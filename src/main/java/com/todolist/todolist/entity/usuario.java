package com.todolist.todolist.entity;

import jakarta.persistence.*;


    @Entity

    @Table(name = "tb_usuario")

    public class usuario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String email;
        private String senha;

    }

