package com.bookstore.jpa.Database.Entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "TB_BOOK")

public class BookEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id //CHAVE PRIMARIA
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false,unique = true)
    private String title;


}
