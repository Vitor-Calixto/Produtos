package com.apiprodutos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.apiprodutos.api.models.Produto;
import com.apiprodutos.api.models.ProdutoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/")
    public String listarProdutos(Model model){
    model.addAttribute("todosOsProdutos", repository.findAll());
        return "listar";
    }

    @GetMapping("/cadastro")
    public String mostrarFormulario(Model model){
        model.addAttribute("produto", new Produto());
        return "cadastrar";
  
    }

    @PostMapping("/cadastro")
    public String cadastrarProdutos(Produto produto){
        repository.save(produto);
        return "cadastrar";

}
}