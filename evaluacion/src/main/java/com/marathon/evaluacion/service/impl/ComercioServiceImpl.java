package com.marathon.evaluacion.service.impl;

import com.marathon.evaluacion.entity.Comercio;
import com.marathon.evaluacion.service.IComercioService;
import org.springframework.stereotype.Service;

@Service
public class ComercioServiceImpl implements IComercioService {
    @Override
    public Comercio findByRuc(String ruc) {
        if (ruc.equals("20430635612")) {
            Comercio comercio = new Comercio("20430635612",
                    "GRAP PERU SAC CONSULTORIO INFORMATICO",
                    "ACTIVO",
                    "AV. M. ABRIL 504   1402    LIMA LIMA  JES\u00c3\u00baS MAR\u00c3\u00adA",
                    "150113",
                    "LIMA",
                    "LIMA",
                    "JES\\u00c3\\u00baS MAR\\u00c3\\u00adA");
            return comercio;
        }
        return null;
    }
}
