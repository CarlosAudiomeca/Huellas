package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.AdoptanteRepository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AdopcionMemLocalDataSource implements  AdopcionLocalDataSource{
    private static AdopcionMemLocalDataSource instance = null;

    private Map<String, AdoptanteRepository> storage = new TreeMap<>();

    private AdopcionMemLocalDataSource() {

    }

    @Override
    public void save(Adopcion adopcion) {

    }

    @Override
    public List<Adopcion> findAll() {
        return null;
    }

    public static AdopcionMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AdopcionMemLocalDataSource();
        }
        return instance;
    }


}
