package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDate;


@Data
@Builder
@Entity
@Table(name = "Document")
public class Document {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String number;
    private LocalDate date;
    private String type;
    private String description;
}
