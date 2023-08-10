package com.example.demo;

import com.example.demo.entities.Lanche;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class LancheRepository implements repository<Lanche> {
    private final ArrayList<Lanche> lanches = new ArrayList<>();
    @Override
    public CompletableFuture<Lanche> fetch(long id) {
        CompletableFuture<Lanche> completableFuture = new CompletableFuture<>();
         Optional<Lanche> lanche = lanches.stream().filter(currentLanche -> currentLanche.getId() == id).findFirst();
         completableFuture.complete(lanche.orElseThrow());
         return completableFuture;
    }

    @Override
    public CompletableFuture<ArrayList<Lanche>> fetchAll() {
        CompletableFuture<ArrayList<Lanche>> completableFuture = new CompletableFuture<>();
        completableFuture.complete(this.lanches);
        return completableFuture;
    }

    @Override
    public void create(Lanche element) {

    }

    @Override
    public void update(String id, Lanche element) {

    }

    @Override
    public void delete(String id) {

    }
}
