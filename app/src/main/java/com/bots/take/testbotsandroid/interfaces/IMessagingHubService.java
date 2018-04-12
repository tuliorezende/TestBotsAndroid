package com.bots.take.testbotsandroid.interfaces;

import com.bots.take.testbotsandroid.models.BotAdvancedInformation;
import com.bots.take.testbotsandroid.models.BotBasicInformation;
import com.bots.take.testbotsandroid.models.UserInformation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface IMessagingHubService {
    @GET("accounts/me")
    Call<UserInformation> AuthenticateUser(@Header("Authorization") String authorization);

    @GET("applications/mine")
    List<BotBasicInformation> GetBotsList(@Header("Authorization") String authenticationToken);

    @GET("appliactions/{botidentifier}")
    BotAdvancedInformation GetDetailedBot(@Header("Authorization") String authenticationToken);
}