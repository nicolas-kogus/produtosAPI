package com.kogusapi.produtosAPI.Produtos.controller;

import com.kogusapi.produtosAPI.Produtos.model.Produto;
import com.kogusapi.produtosAPI.Produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/salvar-produto")
    public Produto saveProduct(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping("/{id}")
    public Produto pegarPorId(@PathVariable("id") Long id) {return produtoRepository.findById(id).orElse(null);}
}