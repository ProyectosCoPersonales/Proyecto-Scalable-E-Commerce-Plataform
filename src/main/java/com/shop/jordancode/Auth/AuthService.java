package com.shop.jordancode.Auth;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shop.jordancode.Entities.User.User;
import com.shop.jordancode.Jwt.JwtService;
import com.shop.jordancode.Repositories.UserRepository;
import com.shop.jordancode.Entities.User.Role;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return AuthResponse.builder()
            .token(token)
            .build();
    }

    public String getRole(String token){
        return jwtService.getRoleFromToken(token);
    }

    public String getUsername(String token){
        return jwtService.getUsernameFromToken(token);
    }

    public AuthResponse register(RegisterRequest request) {
        User user = User.builder()
            .username(request.getUsername())
            .email(request.getEmail())
            .password(passwordEncoder.encode( request.getPassword()))
            .firstName(request.getFirstName())
            .firstName(request.getLastName())
            .phoneNumber(request.getPhoneNumber())
            .role(Role.ADMIN)
            .build();
        userRepository.save(user);
        
        return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();
    }


}
