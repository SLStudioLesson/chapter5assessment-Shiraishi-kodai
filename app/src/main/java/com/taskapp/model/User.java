package com.taskapp.model;

public class User {
    private int code; //ユーザーのコード（整数）
    private String name; //ユーザー名（文字列）
    private String email; //メールアドレス（文字列）
    private String password; //パスワード（文字列

    public User(int code, String name, String email, String password) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    
}