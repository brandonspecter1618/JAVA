package com.bank.credit.messagegenerator.model;


import jakarta.persistence.Table;

@Table(name = "tb_aluno", schema = "message.generator") //name = nome da tabela de dados, schema = nome do banco de dados
public class User {
    private String name;
    private String lastname;
    private  String login;
    private Integer age;
}



