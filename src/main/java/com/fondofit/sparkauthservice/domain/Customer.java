package com.fondofit.sparkauthservice.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Customer {

    @Id
    private String id;
    private String email;
    private String pwd;
    private String role;
}
