package com.example.demo.controllers;

import com.example.demo.entities.Pizza;
import com.example.demo.entities.Sabor;
import com.example.demo.entities.Salgado;
import com.example.demo.entities.Suco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SaborController {
        private final AtomicLong counter = new AtomicLong();

    @GetMapping("/sabores")
    public Sabor[] sabores() {

        Sabor[] sabores = new Sabor[6];

        sabores[0] = new Sabor<Suco>(counter.incrementAndGet(),"goiaba");
        sabores[1] = new Sabor<Suco>(counter.incrementAndGet(),"manga");

        sabores[2] = new Sabor<Pizza>(counter.incrementAndGet(),"mexicana");
        sabores[3] = new Sabor<Pizza>(counter.incrementAndGet(),"nordestina");

        sabores[4] = new Sabor<Salgado>(counter.incrementAndGet(),"carne");
        sabores[5] = new Sabor<Salgado>(counter.incrementAndGet(),"queijo");


         return sabores;
    }
}
