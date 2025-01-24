package com.taskapp.model;

public class Task {
    private int code; //タスクのコード（整数）
    private String name; //タスク名（文字列）
    private int status;/*/*タスクのステータス（整数）
                         ・0→未着手、1→着手中、2→完了 */
    private User repUser; //タスクを担当するユーザーコード（整数）

    public Task(int code, String name, int status, User repUser) {
        this.code = code;
        this.name = name;
        this.status = status;
        this.repUser = repUser;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getRepUser() {
        return repUser;
    }

    public void setRepUser(User repUser) {
        this.repUser = repUser;
    }

    

    
}