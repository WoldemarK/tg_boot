package org.example.tg_boot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tg_data")
public class User {

    @Id
    private long id;
    private String name;
    private int msg_numb;
}

