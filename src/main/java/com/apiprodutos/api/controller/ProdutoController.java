package com.apiprodutos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.apiprodutos.api.models.ProdutoRepository;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/listagem")
    public String listarprodutos(){
        return "listar";
    }

    @GetMapping("/cadastro")
    public String cadastrarprodutos(){
        return "cadastrar";
    }


}
