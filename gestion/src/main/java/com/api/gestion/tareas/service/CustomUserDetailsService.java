package com.api.gestion.tareas.service;

import com.api.gestion.tareas.model.Usuario;
import com.api.gestion.tareas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = usuarioRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("No encontrado"));

        System.out.println("User: " + user.getUsername() + " pass: " + user.getPassword());
        return new User(
                user.getUsername(),
                user.getPassword(),
                new ArrayList<>()
        );

    }
}
