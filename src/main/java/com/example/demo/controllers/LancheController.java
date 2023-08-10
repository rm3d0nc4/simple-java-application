package com.example.demo.controllers;

import com.example.demo.LancheRepository;
import com.example.demo.entities.Lanche;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@RestController
public class LancheController {
        private final LancheRepository repository = new LancheRepository();
//
//    @GetMapping("/cardapio")
//    public CompletableFuture<ArrayList<Lanche>> fetchLanches() {
//        return repository.fetchAll().;
//    }
//
//    @GetMapping("/cardapio/{id}")
//    public CompletableFuture<ArrayList<Lanche>> fetchLanches() {
//        return repository.fetchAll();
//    }
}
