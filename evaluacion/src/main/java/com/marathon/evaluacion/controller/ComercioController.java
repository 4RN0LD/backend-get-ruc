package com.marathon.evaluacion.controller;

import com.marathon.evaluacion.entity.Comercio;
import com.marathon.evaluacion.service.IComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comercios")
public class ComercioController {

    @Autowired
    private IComercioService comercioService;

    @GetMapping("/{ruc}")
    public ResponseEntity<?> findComercioByRuc(@PathVariable("ruc") String ruc, @RequestParam("token") String token) {
        if (!token.equals("cXdlcnR5bGFtYXJja19zYUBob3RtYWlsLmNvbXF3ZXJ0eQ")) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }
        Comercio comercio = comercioService.findByRuc(ruc, token);
        if (comercio == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(comercio, HttpStatus.OK);
    }
}
