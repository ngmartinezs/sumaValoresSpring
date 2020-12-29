package com.pruebaSpring.sumaValoresSpring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("testApiController")
public class TestApiController {
    @GetMapping("/")
    public String index() {
        return "El Servicio esta arriba";
    }
}