package com.todolist.todolist.entity;

import jakarta.persistence.*;


    @Entity

    @Table(name = "tb_usuario") //cria tabela

    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //auto incremente pro id
        private Long id;

        @Column(length = 100) //passa um limite de 100 caracteres na classe nome
        private String nome;
        @Column(length = 80, unique = true)
        private String email;
        @Column(length = 50)
        private String senha;

    }

