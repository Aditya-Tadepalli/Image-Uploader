package com.aditya.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
