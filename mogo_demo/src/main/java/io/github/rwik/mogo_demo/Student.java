package io.github.rwik.mogo_demo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
@Document
public class Student {
    @Id
    private int id;
    private String name;
    private String addresse;
    private List<String> bookList;

    public Student(String name, String addresse, List<String> bookList) {
        this.name = name;
        this.addresse = addresse;
        this.bookList = bookList;
    }
}
