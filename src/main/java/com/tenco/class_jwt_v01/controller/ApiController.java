package com.tenco.class_jwt_v01.controller;

import com.tenco.class_jwt_v01.service.UserService;
import com.tenco.class_jwt_v01.util.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserService userService;
    @Autowired
    private JWTUtil jwtUtil;

    // 회원가입 API: 사용자 등록 후 성공 응답 반환
    // post : register
    // 반환 타입 : ResponseEntity<ResponseAPI<>> ...

    // 로그인 API: 사용자 인증 후 토큰 반환
    // post ("/login")

    // 로그아웃 API: refreshToken 무효화
    // post ("/logout")

    // 토큰 갱신 API: 새 accessToken 발급
    // post("/refresh")

    // 보호된 API: 토큰 검증 후 접근 허용
    // !! [[헤더에서 Authorization 키와 값을 추출해서 응답 ]]
    // get("/protected")

}
