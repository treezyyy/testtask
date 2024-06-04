package com.example.demo.controller;


import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/document")
@AllArgsConstructor
public class DocumentController {
    //@Autowired
    private final DocumentRepository service;

    @GetMapping
    public List<Document> findAllDocuments(){
        return service.findAllDocument();
    }

    @PostMapping("save_document")
    public String saveStudent(@RequestBody Document document){
        service.saveDocument(document);
        return "Удачно добавлено";
    }

    @GetMapping("/{number}")
    public Optional<Document> findByNumber(@PathVariable String number){
        return service.findByNumber(number);
    }

    @PutMapping("update_document")
    public Document updateDocument(@RequestBody Document document){
        return service.updateDocument(document);
    }

    @DeleteMapping("delete_document/{number}")
    public void deleteDocument(@PathVariable String number){
        service.deleteDocument(number);
    }

}
