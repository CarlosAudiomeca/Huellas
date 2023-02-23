package com.iesam.huellas.domain.models;

import java.util.List;

public interface GatoRepository {

        public void save(Gato gato);

        public List<Gato> getAll();

        public void delete(String gatoId);

}
