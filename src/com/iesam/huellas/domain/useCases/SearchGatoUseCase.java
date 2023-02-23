package com.iesam.huellas.domain.useCases;

import com.iesam.huellas.domain.models.Gato;
import com.iesam.huellas.domain.models.GatoRepository;

import java.util.List;

public class SearchGatoUseCase {

    private GatoRepository gatoRepository;

    public SearchGatoUseCase(GatoRepository gatoRepository){
        this.gatoRepository=gatoRepository;
    }

    private List<Gato> execute(){
        return gatoRepository.getAll();
    }
}
