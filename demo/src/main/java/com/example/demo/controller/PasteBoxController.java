package com.example.demo.controller;

import com.example.demo.apiRequest.PasteBoxRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

@RestController
public class PasteBoxController {

    @GetMapping("/") // по какому адресу обращаться чтобы получить метод
    public Collection<String> getPublicPasteList() {
        return Collections.emptyList();
    }

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @PostMapping("/")
    public String add(@RequestBody PasteBoxRequest request) {
        return request.getData();
    }
}
