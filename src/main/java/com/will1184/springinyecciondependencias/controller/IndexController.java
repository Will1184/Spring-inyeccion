package com.will1184.springinyecciondependencias.controller;

import com.will1184.springinyecciondependencias.model.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    @Qualifier("miServicioComplejo")
    private IService servicio;

    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("objeto",servicio.operacion());
        return "index";
    }
}
