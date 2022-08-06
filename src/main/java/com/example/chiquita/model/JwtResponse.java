package com.example.chiquita.model;

import com.example.chiquita.entities.UserEntity;
import org.springframework.security.core.userdetails.UserDetails;

public record JwtResponse(String jwtToken, String refreshJwtToken, UserEntity user) {
}
