package com.shop.jordancode.Auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "login")
    public AuthResponse login(@RequestBody LoginRequest request)
    {   
        String token = authService.login(request).getToken();
        String username = authService.getUsername(token);
        String role = authService.getRole(token);
        AuthResponse authResponse = new AuthResponse(token,username,role);
        return authResponse;
        
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "register")
    public AuthResponse register(@RequestBody RegisterRequest request)
    {
        String token = authService.register(request).getToken();
        String username = authService.getUsername(token);
        String role = authService.getRole(token);
        AuthResponse authResponse = new AuthResponse(token,username,role);
        return authResponse;
    }
}
