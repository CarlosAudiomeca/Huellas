package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.AdoptanteRepository;
import com.iesam.huellas.domain.models.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AdoptanteMemLocalDataSource implements  AdoptanteLocalDataSource{
    private static AdoptanteMemLocalDataSource instance = null;

    private Map<String, AdoptanteRepository> storage = new TreeMap<>();

    private AdoptanteMemLocalDataSource() {

    }
    @Override
    public void save(Adoptante adoptante) {
        storage.put(adoptante.getId(), (AdoptanteRepository) adoptante);
    }
    @Override
    public List<Adoptante> findAll() {
        return null;
    }

    public static AdoptanteMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new AdoptanteMemLocalDataSource();
        }
        return instance;
    }


}
