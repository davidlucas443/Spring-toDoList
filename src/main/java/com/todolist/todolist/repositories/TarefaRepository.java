package com.todolist.todolist.repositories;

import com.todolist.todolist.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface TarefaRepository extends JpaRepository<Tarefa, Long> { //herda o jpa para a classe Usuario
    }
