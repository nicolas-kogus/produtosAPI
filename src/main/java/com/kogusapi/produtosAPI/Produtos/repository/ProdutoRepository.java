package com.kogusapi.produtosAPI.Produtos.repository;

import com.kogusapi.produtosAPI.Produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
