package com.todolist.todolist.repositories.entity;

import jakarta.persistence.*;


    @Entity

    @Table(name = "tb_usuario")

    public class Usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 100)
        private String nome;
        @Column(length = 80, unique = true)
        private String email;
        @Column(length = 50)
        private String senha;

    }

