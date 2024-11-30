package net.abhijeetproject.todo.repository;

import net.abhijeetproject.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User>  findByUsernameOrEmail(String username , String email);
}
