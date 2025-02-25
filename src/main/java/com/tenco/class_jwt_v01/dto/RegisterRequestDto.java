package com.tenco.class_jwt_v01.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 클라이언트 --> 서버 (요청 DTO)
@NoArgsConstructor
@Data
@AllArgsConstructor
public class RegisterRequestDto {

    private String username;
    private String password;
}
