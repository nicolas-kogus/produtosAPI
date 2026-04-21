package com.kogusapi.produtosAPI.controller;

import com.kogusapi.produtosAPI.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @PostMapping("/salvar-produto")
    public Produto saveProduct(@RequestBody Produto produto) {
        return produto;
    }
}
