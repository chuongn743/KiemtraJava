package com.example.__NguyenHoangChuong.repository;

import com.example.__NguyenHoangChuong.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
