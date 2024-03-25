package com.example.slowstep_pjt.pm.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.slowstep_pjt.pm.domain.PmRequest;
import com.example.slowstep_pjt.pm.domain.PmResponse;
import com.example.slowstep_pjt.pm.domain.PmRmRequest;
import com.example.slowstep_pjt.pm.service.PmRmService;
import com.example.slowstep_pjt.pm.service.PmService;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/pmrm")
public class PmController {
    
    @Autowired
    private PmRmService pmRmservice ;
    @Autowired
    private PmService   pmService   ;

    @GetMapping("/view.slowstep")
    public ResponseEntity<List<PmResponse>> view(PmRmRequest params, Model model){
        // 디버깅을 위한 더미값 할당
        params.setMdNo(1);
        params.setRnNo(2);
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
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    

    @DeleteMapping("/delete.slowstep")
    public ResponseEntity<String> delete(PmRequest params, Model model){
        // 디버깅을 위한 더미값 할당
        params.setPmNo(3);

        Integer targetIdx=params.getPmNo();
        System.out.println("debug >>> Post params.toString() , "+params.toString());
        System.out.println("debug >>> Delete Path /pmrm/delete.slowstep");
        pmService.deletePmByNo(targetIdx);

        return new ResponseEntity<>(targetIdx+"번 쪽지 삭제 완료(DELETE_YN Chaged)", HttpStatus.OK);
    }

    @GetMapping("/getDetailByPmNo.slowstep")
    public ResponseEntity<Object> getDetailByPmNo(PmRequest params, Model model) {
        // 디버깅을 위한 더미값 할당
        params.setPmNo(3);

        Integer targetIdx=params.getPmNo();
        PmResponse  response    = pmService.getDetailByPmNo(targetIdx);
        if (response == null){
            System.out.println("debug >>>>> 삭제된 게시글입니다.");
            return new ResponseEntity<>("삭제된 게시글입니다.", HttpStatus.OK);
        }
        System.out.println("debug >>> Get params.toString() , "+response.toString());
        System.out.println("debug >>> Get Path /pmrm/getDetailByPmNo.slowstep");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
