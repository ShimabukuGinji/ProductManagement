package com.example.productmanagement.entity;

public record InsertProduct(String product_id, String name, int price, int category_id, String description) {
}