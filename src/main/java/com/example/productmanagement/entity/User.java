package com.example.productmanagement.entity;

public record User(int id, String loginId, String password, String name,int role, String createdAt, String updatedAt) {
}
