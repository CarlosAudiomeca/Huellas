package com.iesam.huellas.domain.useCases;

import com.iesam.huellas.domain.models.Adoptante;
import com.iesam.huellas.domain.models.AdoptanteRepository;
import com.iesam.huellas.domain.models.Gato;
import com.iesam.huellas.domain.models.GatoRepository;

public class AddAdoptanteUseCase {

    private AdoptanteRepository adoptanteRepository;

    public AddAdoptanteUseCase(AdoptanteRepository adoptanteRepository){
        this.adoptanteRepository=adoptanteRepository;
    }

    public void execute(Adoptante adoptante){
        adoptanteRepository.save(adoptante);
    }

}
