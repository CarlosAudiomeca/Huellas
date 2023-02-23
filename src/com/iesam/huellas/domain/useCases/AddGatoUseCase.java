package com.iesam.huellas.domain.useCases;

import com.iesam.huellas.domain.models.Gato;
import com.iesam.huellas.domain.models.GatoRepository;

public class AddGatoUseCase {

    private GatoRepository gatoRepository;

    public AddGatoUseCase(GatoRepository gatoRepository){
        this.gatoRepository=gatoRepository;
    }

    public void execute(Gato gato){
        gatoRepository.save(gato);
    }

}
