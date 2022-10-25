package com.example.fastturtle.Repositories;

import com.example.fastturtle.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public boolean existsUserByEmail(String email);
}