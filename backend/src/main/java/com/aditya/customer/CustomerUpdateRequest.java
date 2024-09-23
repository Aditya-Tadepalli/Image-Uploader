package com.aditya.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
