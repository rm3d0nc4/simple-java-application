package com.example.demo.repositories;

import com.example.demo.entities.Lanche;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    public Optional<Lanche> fetch(String id);
    public List<T> fetchAll();
    public void create(T element);
    public void update(String id, T element);
    public void delete(String id);
}
