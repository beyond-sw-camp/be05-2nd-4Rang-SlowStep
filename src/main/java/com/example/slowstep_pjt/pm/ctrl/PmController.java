package com.example.slowstep_pjt.pm.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@Controller
@RequestMapping("/pmrm")
public class PmController {
    
    @Autowired
    private PmRmService pmRmservice ;
    @Autowired
    private PmService   pmService   ;

    @GetMapping("/view.slowstep")
    public String view(PmRmRequest params, Model model){
        // 디버깅을 위한 더미값 할당
        params.setMdNo(1);
        params.setRnNo(3);
        System.out.println(params.toString());
        System.out.println("debug >>> Get Path /pmrm/view.slowstep");
        Integer pmRmNo=pmRmservice.findPmRmNo(params);  // 여기가 문제.
        List<PmResponse>    lst = pmService.findAllPm(pmRmNo);
        for(PmResponse response:lst){
            System.out.println(response.toString());
        }
        return "viewpm";
    }

    @PostMapping("/save.slowstep")
    public String save(PmRequest params, Model model){
        // 디버깅을 위한 더미값 할당
        params.setPmRmNo(2);
        params.setPmCn("test");
        params.setTrsmDir(1);
        System.out.println("debug >>> Post params.toString() , "+params.toString());
        System.out.println("debug >>> Get Path /pmrm/save.slowstep");
        pmService.savePm(params);
        return "save";
    }

    @DeleteMapping("/delete.slowstep")
    public String delete(PmRequest params, Model model){
        // 디버깅을 위한 더미값 할당
        params.setPmNo(5);

        Integer targetIdx=params.getPmNo();
        System.out.println("debug >>> Post params.toString() , "+params.toString());
        System.out.println("debug >>> Delete Path /pmrm/delete.slowstep");
        pmService.deletePmByNo(targetIdx);

        return "redirect:/pmrm/viewpm.slowstep";
    }

    @GetMapping("/getDetailByPmNo.slowstep")
    public String getDetailByPmNo(PmRequest params, Model model) {
        // 디버깅을 위한 더미값 할당
        params.setPmNo(1);

        Integer targetIdx=params.getPmNo();
        PmResponse  response    = pmService.getDetailByPmNo(targetIdx);
        System.out.println("debug >>> Get params.toString() , "+response.toString());
        System.out.println("debug >>> Get Path /pmrm/getDetailByPmNo.slowstep");
        return "showDetail.slowstep";
    }
    
}
