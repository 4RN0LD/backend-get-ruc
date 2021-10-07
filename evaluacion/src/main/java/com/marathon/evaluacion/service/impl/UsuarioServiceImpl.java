package com.marathon.evaluacion.service.impl;

import com.marathon.evaluacion.entity.Usuario;
import com.marathon.evaluacion.service.IUsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Override
    public String login(Usuario usuario) {
        var usua = new Usuario("admin","123456");
        if (usuario.equals(usua))
            return "cXdlcnR5bGFtYXJja19zYUBob3RtYWlsLmNvbXF3ZXJ0eQ";
        return null;
    }
}
