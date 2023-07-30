package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosProcedimentos;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    List<DadosProcedimentos> medicos = new ArrayList<>();

    @GetMapping
    private List<DadosProcedimentos> obterDadosProcedimentos(){
        return medicos;
    }
    @GetMapping("/{nome}")
    private String requisicaoGetcomParametro(@PathVariable String nome){
        return String.format("Essas sao as informacoes do(a) Dr(a) %s", nome);
    }
    
    /*@PostMapping
    private String requisicaoPost(@RequestBody String nome){
        return String.format("Requisicao Post com o nome: %s", nome);
    }*/
    @PostMapping
    private String requisicaoPost(@RequestBody DadosProcedimentos medico){
        medicos.add(medico);
        return String.format("Requisicao post dos dados do medico: %s", medico.nome());
    }

}
