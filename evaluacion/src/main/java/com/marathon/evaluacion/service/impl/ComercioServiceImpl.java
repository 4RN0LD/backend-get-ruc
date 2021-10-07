package com.marathon.evaluacion.service.impl;

import com.marathon.evaluacion.entity.Comercio;
import com.marathon.evaluacion.service.IComercioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComercioServiceImpl implements IComercioService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Comercio findByRuc(String ruc, String token) {
        ResponseEntity<Comercio> response =
                restTemplate.getForEntity(
                        "http://wsruc.com/Ruc2WS_JSON.php?tipo=2&ruc=" + ruc + "&token=" + token,
                        Comercio.class);
        Comercio comercio = response.getBody();
        if (comercio.getRuc() == null)
            return null;
        return comercio;
    }
}
