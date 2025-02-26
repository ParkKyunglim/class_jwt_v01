package com.tenco.class_jwt_v01.dto;

import lombok.Data;

// 공통 API 응답 DTO: 모든 API에서 표준화된 응답 구조 제공
@Data
public class ResponseAPI<T> {
    private String message;      // 응답 메시지 (성공/에러 설명)
    private int statusCode;      // HTTP 상태 코드 (200, 401 등)
    private T data;              // 실제 데이터 (제네릭으로 유연하게 처리)

    // 성공 응답 생성자
    public ResponseAPI(String message, int statusCode, T data) {
        this.message = message;
        this.statusCode = statusCode;
        this.data = data;
    }

    // 에러 응답용 정적 메서드 (data 없이)
    public static <T> ResponseAPI<T> error(String message, int statusCode) {
        return new ResponseAPI<>(message, statusCode, null);
    }

    // 성공 응답용 정적 메서드
    public static <T> ResponseAPI<T> success(String message, T data) {
        return new ResponseAPI<>(message, 200, data);
    }
}
