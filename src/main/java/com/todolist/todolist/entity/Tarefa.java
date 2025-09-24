package com.todolist.todolist.entity;
import jakarta.persistence.*;

@Entity

@Table(name = "tb_tarefa") //cria tabela
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



}
