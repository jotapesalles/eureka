package com.service.notification;

public class Notification {
    private int id;
    private String message;
    private int userId;
    private boolean read;

    public Notification(int id, String message, int userId, boolean read) {
        this.id = id;
        this.message = message;
        this.userId = userId;
        this.read = read;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
