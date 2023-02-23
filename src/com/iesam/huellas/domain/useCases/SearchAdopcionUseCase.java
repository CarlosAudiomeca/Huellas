package com.iesam.huellas.domain.useCases;

import com.iesam.huellas.domain.models.Adopcion;
import com.iesam.huellas.domain.models.AdopcionRepository;

import java.util.List;

public class SearchAdopcionUseCase {
    private AdopcionRepository adopcionRepository;

    public SearchAdopcionUseCase(AdopcionRepository adopcionRepository){
        this.adopcionRepository=adopcionRepository;
    }

    public List<Adopcion> execute(){
        return adopcionRepository.getAll();
    }
}

