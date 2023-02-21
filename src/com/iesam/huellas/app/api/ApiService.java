package com.iesam.huellas.app.api;

import com.iesam.huellas.domain.models.Gato;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiService {

    @GET("cats.json")
    public Call<List<Gato>> getCats();
}
