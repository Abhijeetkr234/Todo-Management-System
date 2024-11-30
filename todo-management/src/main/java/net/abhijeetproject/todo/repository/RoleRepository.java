package net.abhijeetproject.todo.repository;

import net.abhijeetproject.todo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
