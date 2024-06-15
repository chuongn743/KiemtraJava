package com.example.__NguyenHoangChuong.repository;

import com.example.__NguyenHoangChuong.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}
