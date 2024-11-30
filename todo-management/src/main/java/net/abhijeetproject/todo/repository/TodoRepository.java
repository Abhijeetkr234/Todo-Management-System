package net.abhijeetproject.todo.repository;

import net.abhijeetproject.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {


}
