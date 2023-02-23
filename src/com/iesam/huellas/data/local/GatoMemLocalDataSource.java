package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Gato;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GatoMemLocalDataSource implements  GatoLocalDataSource{
    private static GatoMemLocalDataSource instance = null;

    private Map<String, Gato> storage = new TreeMap<>();

    private GatoMemLocalDataSource() {

    }

    public void save(Gato gato) {
        storage.put(gato.getId(), gato);
    }

    @Override
    public Gato findById(String gatoId) {
        return null;
    }

    public List<Gato> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String gatoId) {

    }

    public static GatoMemLocalDataSource getInstance() {
        if (instance == null) {
            instance = new GatoMemLocalDataSource();
        }
        return instance;
    }
}
