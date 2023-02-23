package com.iesam.huellas.domain.models;

import java.util.List;

public interface AdoptanteRepository {

        public void save(Adoptante adoptante);

        public List<Gato> getAll();

}
