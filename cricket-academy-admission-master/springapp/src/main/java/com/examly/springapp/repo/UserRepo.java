package com.examly.springapp.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.examly.springapp.model.User;


import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    public void deleteUserById(Long id);
    public Optional<User> findUserById(Long id);
    
}
    
