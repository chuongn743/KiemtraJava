package com.example.__NguyenHoangChuong.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phong_ban")
public class PhongBan {
    @Id
    @Column(length = 2, nullable = false)
    private String maPhong;

    @Column(length = 30, nullable = false)
    private String tenPhong;
}
