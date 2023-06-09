package com.example.a722462;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {

    @POST("sendCode")
    Call<Void> sendCode(@Header("email") String email);

    @POST("signin")
    Call<Email> signIn(@Header("email") String email, @Header("code") Integer code);

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://medic.madskill.ru/api/")
            .addConverterFactory(GsonConverterFactory.create()).build();
}
