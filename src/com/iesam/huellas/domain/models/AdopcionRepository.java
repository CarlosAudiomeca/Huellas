package com.iesam.huellas.domain.models;

import java.util.List;

public interface AdopcionRepository {

        public void save(Adopcion adopcion);

        public List<Adopcion> getAll();


}
