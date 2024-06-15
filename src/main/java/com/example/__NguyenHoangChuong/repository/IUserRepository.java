package com.example.__NguyenHoangChuong.repository;

import com.example.__NguyenHoangChuong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
