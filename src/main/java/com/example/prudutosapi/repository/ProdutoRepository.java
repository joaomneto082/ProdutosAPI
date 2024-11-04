package com.example.prudutosapi.repository;

import com.example.prudutosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, String> {
}
