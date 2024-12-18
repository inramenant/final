package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(columnDefinition = "uuid")
    private UUID id;

    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
