package com.example.demo.Enum;


import lombok.Getter;

@Getter
public enum ResultEnum {

    REGISTER_SUCCESS(0, "đăng ký thành công"),
    REGISTER_FAILED(-2, "đăng ký thất bại"),
    LOGIN_SUCCESS(0, "Đăng nhập thành công"),
    GET_INFO_SUCCESS(0, "Lấy thông tin người dùng thành công"),
    LOGIN_FAILED(-1, "\n" +
            "Tên đăng nhập hoặc tài khoản của bạn không chính xác");

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    private Integer code;
    private String message;

}
