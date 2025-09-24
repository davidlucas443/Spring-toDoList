package com.todolist.todolist.repositories;
import com.todolist.todolist.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> { //herda o jpa para a classe Usuario

}
