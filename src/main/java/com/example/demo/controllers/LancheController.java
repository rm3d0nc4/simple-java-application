package com.example.demo.controllers;

import com.example.demo.dtos.LancheDTO;
import com.example.demo.entities.Lanche;
import com.example.demo.entities.Pizza;
import com.example.demo.repositories.implementations.LancheRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lanche")
public class LancheController {
        private final LancheRepository repository;
        @Autowired
        public LancheController(LancheRepository repository) {
                this.repository = repository;
        }
        
        @GetMapping("/")
        public ResponseEntity<List<Lanche>> findAll(){
                final List<Lanche>  lanches = repository.fetchAll();
                return ResponseEntity.ok(lanches);
        };
        @PostMapping("/")
        public void createLanche(@RequestBody LancheDTO lanche){
                final var pizza = new Pizza();
                BeanUtils.copyProperties(lanche, pizza);
                repository.create(pizza);
                ResponseEntity.status(HttpStatus.CREATED);
        };

//
//    @GetMapping("/cardapio/{id}")
//    public CompletableFuture<ArrayList<Lanche>> fetchLanches() {
//        return repository.fetchAll();
//    }
}
