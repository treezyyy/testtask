package com.example.demo.impl;

import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import com.example.demo.repository.DocumentsRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Primary
@Service
public class DocumentsService implements DocumentRepository {

    private final DocumentsRepository repository;

    @Override
    public Optional<Document> findByNumber(String number) {
        return Optional.ofNullable(repository.findByNumber(number));
    }

    @Override
    public Optional<Document> findByDate(LocalDate date) {
        return Optional.ofNullable(repository.findByDate(date));
    }

    @Override
    public Optional<Document> findByType(String type) {
        return Optional.empty();
    }

    @Override
    public List<Document> findAllDocument() {
        return repository.findAll();
    }

    @Override
    public Document updateDocument(Document document) {
        return repository.save(document);
    }

    @Override
    public Document saveDocument(Document document) {
        return repository.save(document);
    }

    @Override
    @Transactional
    public void deleteDocument(String number) {
        repository.deleteByNumber(number);
    }
}
