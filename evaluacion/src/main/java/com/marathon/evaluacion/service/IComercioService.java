package com.marathon.evaluacion.service;

import com.marathon.evaluacion.entity.Comercio;

public interface IComercioService {

    Comercio findByRuc(String ruc, String token);

}
