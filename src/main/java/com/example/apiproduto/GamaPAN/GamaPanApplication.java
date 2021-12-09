package com.example.apiproduto.GamaPAN;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Produto;
import repository.ProdutoRepository;

@SpringBootApplication
public class GamaPanApplication implements CommandLineRunner {
	
	
	@Autowired
	ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(GamaPanApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Produto p1 = new Produto("Chocolate", 5.5);
		Produto p2 = new Produto("Café", 2.5);
		produtoRepository.saveAll(Arrays.asList(p1, p2));
	}

}
