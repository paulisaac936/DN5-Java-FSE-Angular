package com.cognizant.jwt.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.dto.AuthenticationResponse;
import com.cognizant.jwt.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(

            @RequestHeader("Authorization")
            String authorizationHeader) {

        String base64 =
                authorizationHeader.substring(6);

        byte[] decoded =
                Base64.getDecoder().decode(base64);

        String credentials =
                new String(decoded,
                        StandardCharsets.UTF_8);

        String username =
                credentials.split(":")[0];

        String token =
                jwtUtil.generateToken(username);

        return new AuthenticationResponse(token);

    }

}