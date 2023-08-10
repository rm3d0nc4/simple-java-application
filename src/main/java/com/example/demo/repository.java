package com.example.demo;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public interface repository<T> {
    public CompletableFuture<T> fetch(long id);
    public CompletableFuture<ArrayList<T>> fetchAll();
    public void create(T element);
    public void update(String id, T element);
    public void delete(String id);
}
