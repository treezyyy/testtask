package com.example.demo.controller;


import com.example.demo.model.Document;
import com.example.demo.service.DocumentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/v1/document")
@AllArgsConstructor
public class DocumentController {
    //@Autowired
    private final DocumentService service;

    @GetMapping
    public List<Document> findAllDocument(){
        return service.findAllDocuments();
    }
}
