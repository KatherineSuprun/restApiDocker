package com.example.demo.apiRequest;

import lombok.Data;

@Data
public class PasteBoxRequest {

    private String data;
    private long expirationTimeSeconds;
    private publicStatus publicStatus;
}
