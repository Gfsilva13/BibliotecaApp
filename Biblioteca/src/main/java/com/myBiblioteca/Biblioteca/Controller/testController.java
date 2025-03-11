package com.myBiblioteca.Biblioteca.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping
    public String testeApi(){
        return "Teste Controller Api";
    }
}
