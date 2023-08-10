package com.example.demo.repositories.implementations;

import com.example.demo.entities.Lanche;
import com.example.demo.repositories.Repository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class LancheRepository implements Repository<Lanche> {
    private final List<Lanche> lanches = new ArrayList<>();


    @Override
    public List<Lanche> fetchAll() {
       return lanches;
    }

    @Override
    public void create(Lanche element) {
            lanches.add(element);
    }

    @Override
    public Optional<Lanche> fetch(String id) {
        return lanches.stream()
                .filter(currentLanche -> currentLanche.getId().equals(id))
                .findFirst();
    }
    @Override
    public void update(String id, Lanche element) {
        lanches.stream()
                .filter(lanche -> lanche.getId().equals(id))
                .findFirst()
                .ifPresent(lanche -> {
                    int index = lanches.indexOf(lanche);
                    lanches.set(index, element);
                });
    }


    @Override
    public void delete(String id) {
        lanches.removeIf(lanche -> lanche.getId().equals(id));
    }
}
