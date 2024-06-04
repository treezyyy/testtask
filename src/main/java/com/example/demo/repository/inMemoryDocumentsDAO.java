package com.example.demo.repository;

import com.example.demo.model.Document;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;


@Repository
public class inMemoryDocumentsDAO {

    private final List<Document> DOCUMENTS = new ArrayList<>();

    public Document findByNumber(String number) {
        return DOCUMENTS.stream()
                .filter(element -> element.getNumber().equals(number))
                .findFirst()
                .orElse(null);
    }

    public Optional<Document> findByDate(LocalDate date) {
        return DOCUMENTS.stream()
                .filter(element -> element.getDate().equals(date))
                .findFirst();
    }

    public Optional<Document> findByType(String type) {
        return DOCUMENTS.stream()
                .filter(element -> element.getType().equals(type))
                .findFirst();
    }

    public List<Document> findAllDocument() {
        return DOCUMENTS;
    }

    public Document updateDocument(Document document) {
        var studentIndex = IntStream.range(0, DOCUMENTS.size())
                .filter(index -> DOCUMENTS.get(index).getNumber().equals(document.getNumber()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            DOCUMENTS.set(studentIndex, document);
            return document;
        }
        return null;
    }

    public Document saveDocument(Document document) {
        DOCUMENTS.add(document);
        return document;
    }

    public void deleteDocument(String number) {
        var document = findByNumber(number);
        if (document != null) {
            DOCUMENTS.remove(document);
        }
    }
}
