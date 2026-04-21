package com.kogusapi.produtosAPI.controller;

import com.kogusapi.produtosAPI.model.Produto;
import com.kogusapi.produtosAPI.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/salvar-produto")
    public Produto saveProduct(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}
