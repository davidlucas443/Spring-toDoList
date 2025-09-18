package com.todolist.todolist.cotroller;


import com.todolist.todolist.entity.Usuario;
import com.todolist.todolist.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioRepository user; //inicializa o usuarioRepo.. com o nome user

    @GetMapping
    public List<Usuario> mostrar(){   //Cria o metodo mostrar e uma lista Usuário
        List<Usuario> usuario = user.findAll();  //puxa a lista Usuario e usa o "finAll" para mostrar todos os dados da tabela
        return usuario; //retorna toda a lista Usuario
    }
}