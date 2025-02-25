package com.tenco.class_jwt_v01.domain;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password; // 실제로는 암호화 필요
    // accessToken DB에 저장하지 않을 예정 (10분)
    // DB 저장, 액세스 토큰이 만료되었을 때 새 액세스 토큰을 발급 받기
    // 위해 사용 (7일)
    private String refreshToken;

}
