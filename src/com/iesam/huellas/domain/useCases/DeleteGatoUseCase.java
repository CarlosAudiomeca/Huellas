package com.iesam.huellas.domain.useCases;

import com.iesam.huellas.domain.models.GatoRepository;

public class DeleteGatoUseCase {

    private GatoRepository gatoRepository;

    public DeleteGatoUseCase (GatoRepository gatoRepository){
        this.gatoRepository=gatoRepository;
    }
    public void execute(String gatoId){
        gatoRepository.delete(gatoId);
    }
}
