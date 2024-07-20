package med.voll.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") //Faz parte do endereço
public class HelloController {

    //Toda vez que você acessa uma página você está fazendo um get no Servidor
    @GetMapping
    public String olamMundo(){
        return "Olá Mundo Spring";
    }

}