package br.com.tech4me.clinica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MedicosController {
    @RequestMapping("/medicos")
    @GetMapping
    private String requisicaoGet(){
        return "Ola, eu sou o metodo get que foi acessado no controller /medicos";
    }
    @GetMapping("/{nome}")
    private String requisicaoGetcomParametro(@PathVariable String nome){
        return "Essas sao as informacoes do(a) Dr(a) " + nome;
    }
    @PostMapping
    private String requisicaoPost(@RequestBody String nome){
        return "Eu sou a requisicao post que pede um nome: " + nome + "como parametro";
    }
}
