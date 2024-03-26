package com.example.slowstep_pjt.pm.ctrl;

import java.util.ArrayList;
import java.util.List;

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

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/pmrm")
public class PmController {
    
    @Autowired
    private PmRmService pmRmservice ;
    @Autowired
    private PmService   pmService   ;

    @GetMapping("/view/{rnNo}")
    public ResponseEntity<List<PmResponse>> view(PmRmRequest params, HttpSession session, @PathVariable("rnNo") Integer rnNo){
        // 디버깅을 위한 더미값 할당
        UserDTO userResponse   = (UserDTO) session.getAttribute("loginUser");
        params.setMdNo(userResponse.getMbrNo());
        params.setRnNo(rnNo);
        System.out.println(params.toString());
        System.out.println("debug >>> Get Path /pmrm/view.slowstep");
        Integer pmRmNo=pmRmservice.findPmRmNo(params);  // 여기가 문제.
        List<PmResponse>    lst = pmService.findAllPm(pmRmNo);
        for(PmResponse response:lst){
            System.out.println(response.toString());
        }
        return new ResponseEntity<>(lst, HttpStatus.OK);
    }

    @PostMapping("/write.slowstep")
    public ResponseEntity<String> write(@RequestBody PmRequest params, Model model) {
        System.out.println("debug >>> PmController write POST /pmrm/write.slowstep");
        pmService.writePmCn(params);
        return new ResponseEntity<>("쪽지가 정상적으로 발송되었습니다.", HttpStatus.OK);
    }
    

    @DeleteMapping("/delete/{targetIdx}")
    public ResponseEntity<String> delete(@PathVariable("targetIdx") Integer targetIdx){
        // 디버깅을 위한 더미값 할당
        System.out.println("debug >>> Delete Path /pmrm/delete.slowstep");
        pmService.deletePmByNo(targetIdx);

        return new ResponseEntity<>(targetIdx+"번 쪽지 삭제 완료(DELETE_YN Chaged)", HttpStatus.OK);
    }

    @GetMapping("/getDetailByPmNo/{targetIdx}")
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
    public ResponseEntity<List<PmResponse>>getDoctorList() {
        System.out.println("debug >>> PmController GET /pmrm/doctor_list.slowstep");
        return new ResponseEntity<List<PmResponse>>(pmService.getDoctorList(), HttpStatus.OK);
    }

    @GetMapping("/nurse_list.slowstep")
    public ResponseEntity<List<PmResponse>>getNurseList() {
        System.out.println("debug >>> PmController GET /pmrm/nurse_list.slowstep");
        return new ResponseEntity<List<PmResponse>>(pmService.getNurseList(), HttpStatus.OK);
    }
}
