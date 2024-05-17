package com.bank.credit.messagegenerator.model;

import jakarta.persistence.Table;

@Table(name = "tk_aluno", schema = "aluno")
//name = nome da tabela de dados, schema = nome do banco de dados
public class User {
    private String name;
    private String lastname;
    private  String login;
    private Integer age;
}
