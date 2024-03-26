package com.example.slowstep_pjt.pm.ctrl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;
import com.example.slowstep_pjt.pm.domain.PmRmRequest;
import com.example.slowstep_pjt.pm.service.PmRmService;
import com.example.slowstep_pjt.pm.service.PmService;
import com.example.slowstep_pjt.user.domain.UserDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/pmrm")
@Tag(name = "쪽지", description = "의사와 간호사간 환자관리를 위한 쪽지")
public class PmController {
    
    @Autowired
    private PmRmService pmRmservice ;
    @Autowired
    private PmService   pmService   ;

    @GetMapping("/view/{no}")
    @Operation(summary = "쪽지내역 열람", description = "로그인된 세션의 유저와, 유저가 선택한 간호사의 번호로부터 두 사용자간 주고받은 쪽지내역을 출력합니다.")
    public ResponseEntity<Map<String, String>> view(PmRmRequest params, HttpSession session, @PathVariable("no") Integer no){
        // 디버깅을 위한 더미값 할당
        UserDTO userResponse   = (UserDTO) session.getAttribute("loginUser");
        if (userResponse.getJobTyp()=='D'){
            params.setMdNo(userResponse.getMbrNo());
            params.setRnNo(no);
        } else{
            params.setRnNo(userResponse.getMbrNo());
            params.setMdNo(no);          
        }
        System.out.println(params.toString());
        System.out.println("debug >>> Get Path /pmrm/view.slowstep");
        Integer pmRmNo=pmRmservice.findPmRmNo(params);  // 여기가 문제.
        List<PmResponse>    lst = pmService.findAllPm(pmRmNo);
        Map<String,String> map  = new HashMap<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(PmResponse response:lst){
            map.put("PM_NO", Integer.toString(response.getPmNo()));
            map.put("PM_RM_NO", Integer.toString(response.getPmRmNo()));
            map.put("PM_CN", response.getPmCn());
            map.put("TRSM_DIR", response.getTrsmDir());
            map.put("PM_DSPTCH_DT", format.format(response.getPmDsptchDt()));
            map.put("RD_YN", response.getRdYn());
            map.put("RD_DT", format.format(response.getRdDt()));
        }
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @PostMapping("/write.slowstep")
    @Operation(summary = "쪽지작성", description = "쪽지를 작성하고 저장하는 기능")
    public ResponseEntity<String> write(@RequestBody PmRequest params, Model model) {
        System.out.println("debug >>> PmController write POST /pmrm/write.slowstep");
        pmService.writePmCn(params);
        return new ResponseEntity<>("쪽지가 정상적으로 발송되었습니다.", HttpStatus.OK);
    }
    

    @DeleteMapping("/delete/{targetIdx}")
    @Operation(summary = "선택 쪽지 삭제", description = "사용자가 선택한 쪽지의 쪽지번호(pmRm)로부터 해당 쪽지를 삭제합니다.")
    public ResponseEntity<String> delete(@PathVariable("targetIdx") Integer targetIdx){
        // 디버깅을 위한 더미값 할당
        System.out.println("debug >>> Delete Path /pmrm/delete.slowstep");
        pmService.deletePmByNo(targetIdx);

        return new ResponseEntity<>(targetIdx+"번 쪽지 삭제 완료(DELETE_YN Chaged)", HttpStatus.OK);
    }

    @GetMapping("/getDetailByPmNo/{targetIdx}")
    @Operation(summary = "쪽지 세부내용 열람", description = "사용자가 선택한 쪽지의 쪽지번호(pmRm)으로부터 해당 쪽지의 세부내용을 출력합니다.")
    public ResponseEntity<Object> getDetailByPmNo(@PathVariable("targetIdx") Integer targetIdx) {
        // 디버깅을 위한 더미값 할당
        PmResponse  response    = pmService.getDetailByPmNo(targetIdx);
        if (response == null){
            System.out.println("debug >>>>> 삭제된 게시글입니다.");
            return new ResponseEntity<>("삭제된 게시글입니다.", HttpStatus.OK);
        }
        System.out.println("debug >>> Get params.toString() , "+response.toString());
        System.out.println("debug >>> Get Path /pmrm/getDetailByPmNo.slowstep");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/doctor_list.slowstep")
    @Operation(summary = "의사 목록", description = "쪽지를 보낼 수 있는 의사의 목록을 표시합니다")
    public ResponseEntity<Map<String, String>>getDoctorList() {
        System.out.println("debug >>> PmController GET /pmrm/doctor_list.slowstep");
        return new ResponseEntity<Map<String, String>>(pmService.getDoctorList(), HttpStatus.OK);
    }

    @GetMapping("/nurse_list.slowstep")
    @Operation(summary = "간호사 목록", description = "쪽지를 보낼 수 있는 간호사의 목록을 의사의 페이지에 표시합니다")
    public ResponseEntity<Map<String, String>>getNurseList() {
        System.out.println("debug >>> PmController GET /pmrm/nurse_list.slowstep");
        return new ResponseEntity<Map<String,String>>(pmService.getNurseList(), HttpStatus.OK);
    }
}
