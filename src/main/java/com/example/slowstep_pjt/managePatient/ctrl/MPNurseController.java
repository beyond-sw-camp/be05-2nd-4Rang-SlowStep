package com.example.slowstep_pjt.managePatient.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
  
import com.example.slowstep_pjt.managePatient.service.MPNurseService;

@RestController
@RequestMapping("/nurse")
public class MPNurseController {

    @Autowired
    private MPNurseService mpNurseService;

}