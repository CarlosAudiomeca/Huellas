package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Gato;

import java.util.List;

public interface GatoLocalDataSource {

    public void save(Gato gato);
    public Gato findById(String gatoId);
    public List<Gato> findAll();

    public void delete(String gatoId);

}
