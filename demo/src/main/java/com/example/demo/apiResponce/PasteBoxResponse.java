package com.example.demo.apiResponce;

import com.example.demo.apiRequest.publicStatus;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PasteBoxResponse {

    private final String data;
    private final boolean isPublic;
}
