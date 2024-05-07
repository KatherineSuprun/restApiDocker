package com.example.demo.repository;

import com.example.demo.entity.PasteBoxEntity;

import java.util.List;

public interface PasteBoxRepository {

    PasteBoxEntity getByHash(String hash);
    List<PasteBoxEntity> getListOfPublicAndAlive(int amount);
    void add (PasteBoxEntity pasteBoxEntity);
}
