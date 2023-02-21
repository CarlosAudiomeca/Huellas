package com.iesam.huellas.data.remote;

import com.iesam.huellas.app.api.ApiClient;
import com.iesam.huellas.domain.models.Gato;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class CatApiRemoteDataSource {

    private ApiClient apiClient = new ApiClient();

    public List<Gato> getCats() {
        try {
            Response<List<Gato>> responseCats = apiClient.apiService.getCats().execute();
            if (responseCats.isSuccessful()) {
                return responseCats.body();
            } else {
                throw new RuntimeException();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
