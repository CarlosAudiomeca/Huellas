package com.iesam.huellas.data;

import com.iesam.huellas.data.local.GatoLocalDataSource;
import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.AdoptanteRepository;
import com.iesam.huellas.domain.models.Gato;

import java.util.List;

public class AdoptanteDataRepository implements AdoptanteRepository {

    private GatoLocalDataSource localDataSource;

    public AdoptanteDataRepository(GatoLocalDataSource localDataSource){
        this.localDataSource=localDataSource;
    }

    @Override
    public void save(Adoptante adoptante) {

    }

    @Override
    public List<Gato> getAll() {
        return null;
    }
}
