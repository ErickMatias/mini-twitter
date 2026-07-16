package de.erick.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiressIn) {
}
