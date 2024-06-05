package com.example.demo.repository;

import com.example.demo.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface DocumentsRepository extends JpaRepository<Document, Long> {

    void deleteByNumber(String number);

    Document findByNumber(String number);

    Document findByDate(LocalDate data);

}
