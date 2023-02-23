package com.iesam.huellas.presentation;

import com.iesam.huellas.data.local.GatoFileLocalDataSource;
import com.iesam.huellas.data.remote.CatApiRemoteDataSource;
import com.iesam.huellas.domain.models.Gato;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CatDataRepository
        CatApiRemoteDataSource remoteDataSource = new CatApiRemoteDataSource();
        List<Gato> cats = remoteDataSource.getCats();

        GatoFileLocalDataSource fileLocalDataSource = GatoFileLocalDataSource.getInstance();
        fileLocalDataSource.saveList(cats);
    }
}