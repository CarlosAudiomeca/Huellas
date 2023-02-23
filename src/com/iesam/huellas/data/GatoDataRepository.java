package com.iesam.huellas.data;

import com.iesam.huellas.data.local.GatoLocalDataSource;
import com.iesam.huellas.domain.models.Gato;
import com.iesam.huellas.domain.models.GatoRepository;

import java.util.List;

public class GatoDataRepository implements GatoRepository {

    private GatoLocalDataSource localDataSource;

    public GatoDataRepository(GatoLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Gato gato) {

    }

    @Override
    public List<Gato> getAll() {
        return null;
    }

    @Override
    public void delete(String gatoId) {

    }
}
