package com.bookstore.jpa.Database.Entity;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "TB_AUTHOR")
public class AuthorEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,unique = true)
    private String name;


}
