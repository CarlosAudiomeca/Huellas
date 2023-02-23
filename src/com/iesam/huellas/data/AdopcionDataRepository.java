package com.iesam.huellas.data;

import com.iesam.huellas.data.local.AdopcionLocalDataSource;
import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.AdopcionRepository;


import java.util.List;

public class AdopcionDataRepository implements AdopcionRepository {

    private AdopcionLocalDataSource localDataSource;

    public AdopcionDataRepository(AdopcionLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }


    @Override
    public void save(Adopcion adopcion) {

    }

    @Override
    public List<Adopcion> getAll() {
        return null;
    }
}
