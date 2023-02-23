package com.iesam.huellas.data.local;

import com.iesam.huellas.domain.models.Adopcion;

import java.util.List;

public interface AdopcionLocalDataSource {

    public void save(Adopcion adopcion);

    public List<Adopcion> findAll();
}
