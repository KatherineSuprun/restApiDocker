package com.example.demo.service;

import com.example.demo.apiRequest.PasteBoxRequest;
import com.example.demo.apiResponce.PasteBoxResponse;
import com.example.demo.apiResponce.PasteBoxUrlResponse;

import java.util.List;

public interface PasteBoxService {

    PasteBoxResponse getByHash(String hash);
    List<PasteBoxResponse> getFirstPublicPasteBoxes( );
    PasteBoxUrlResponse create(PasteBoxRequest request);
}
