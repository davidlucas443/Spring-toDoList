package com.todolist.todolist.cotroller;

import com.todolist.todolist.entity.Tarefa;
import com.todolist.todolist.entity.Usuario;
import com.todolist.todolist.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TarefaController {

    @Autowired
    TarefaRepository task; //inicializa o usuarioRepo.. com o nome user

    @GetMapping
    public List<Tarefa> mostra(){   //Cria o metodo mostrar e uma lista Usuário
        List<Tarefa> tarefa = task.findAll();  //puxa a lista Usuario e usa o "finAll" para mostrar todos os dados da tabela
        return tarefa; //retorna toda a lista Usuario
    }
}
