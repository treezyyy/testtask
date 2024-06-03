package com.example.demo.service;


import com.example.demo.model.Document;
import com.example.demo.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DocumentService {

    private DocumentRepository documentRepository;
    public List<Document> findAllDocuments(){
        //return documentRepository.findAll();
        return List.of(
                Document.builder().type("Круто").build()
        );
    }

    public Optional<Document> findDocumentById(Long id){ // optional существует объект, а может и нет:(
        return documentRepository.findById(id);
    }

    public void deleteDocument(Long id){
        documentRepository.deleteById(id);
    }

    public Document saveDocument(Document document){
        return documentRepository.save(document);
    }

    public List<Document> searchDocumentByNumber(String number){
        if (number != null){
            return documentRepository.findByNumber(number);
        }
        return null;
    }

    public List<Document> searchDocumentByDate(LocalDate date){
        if (date != null){
            return documentRepository.findByDate(date);
        }
        return null;
    }

    public List<Document> searchDocumentByType(String type){
        if (type != null){
            return documentRepository.findByType(type);
        }
        return null;
    }

}
