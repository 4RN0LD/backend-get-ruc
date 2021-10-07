package com.marathon.evaluacion.controller;

import com.marathon.evaluacion.entity.Usuario;
import com.marathon.evaluacion.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping()
    public ResponseEntity<?> login(@RequestBody Usuario usuario) {
        String token = usuarioService.login(usuario);
        if (token == null) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        Map<String, String> accessToken = new HashMap<>();
        accessToken.put("token", token);
        return new ResponseEntity<>(accessToken, HttpStatus.ACCEPTED);
    }

}
