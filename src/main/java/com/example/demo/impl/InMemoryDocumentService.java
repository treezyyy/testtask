package com.example.demo.impl;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import com.example.demo.repository.inMemoryDocumentsDAO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InMemoryDocumentService implements DocumentRepository {

    private final inMemoryDocumentsDAO repository;

    @Override
    public Optional<Document> findByNumber(String number) {
        return Optional.ofNullable(repository.findByNumber(number));
    }

    @Override
    public Optional<Document> findByDate(LocalDate date) {
        return repository.findByDate(date);
    }

    @Override
    public Optional<Document> findByType(String type) {
        return repository.findByType(type);
    }

    @Override
    public List<Document> findAllDocument() {
        return repository.findAllDocument();
    }

    @Override
    public Document updateDocument(Document document) {
        return repository.updateDocument(document);
    }

    @Override
    public Document saveDocument(Document document) {
        return repository.saveDocument(document);
    }

    @Override
    public void deleteDocument(String number) {
        repository.deleteDocument(number);
    }
}
