package com.example.demo.repository;

import com.example.demo.model.Document;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DocumentRepository {

    Optional<Document> findByNumber(String number);
    Optional<Document> findByDate(LocalDate date);
    Optional<Document> findByType(String type);
    List<Document> findAllDocument();
    Document updateDocument(Document document);
    Document saveDocument(Document document);
    void deleteDocument(String number);
}
