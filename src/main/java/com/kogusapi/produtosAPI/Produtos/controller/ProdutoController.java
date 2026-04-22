package com.kogusapi.produtosAPI.Produtos.controller;

import com.kogusapi.produtosAPI.Produtos.model.Produto;
import com.kogusapi.produtosAPI.Produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/salvar-produto")
    public Produto salvarProduto(@RequestBody Produto produto) {return produtoRepository.save(produto);}

    @GetMapping("/{id}")
    public Produto pegarPorId(@PathVariable("id") Long id) {return produtoRepository.findById(id).orElse(null);}

    @DeleteMapping("/{id}")
    public void excluirPorID(@PathVariable("id") Long id) {produtoRepository.deleteById(id);}

    @PutMapping("/{id}")
    public void atualizarProduto(@PathVariable("id") Long id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping("/listar-produtos")
    public List<Produto> listarProdutos() {return produtoRepository.findAll();}
}