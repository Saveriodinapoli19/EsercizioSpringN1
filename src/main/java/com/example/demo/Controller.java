package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    @GetMapping("/ciao")
    public String getNome(@RequestParam String nome, @RequestParam String provincia){
    return "Ciao " + nome + "Com'è il tempo in " + provincia;
    }
}
