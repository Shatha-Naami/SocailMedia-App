package com.example.socialmediaapp.Notifications;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAIq-Oxf4:APA91bFkApS0Hf0Nin70SYTGrgHecsVg4VydO-mp6u9eRkFy_L6E0ltMLUC-d2m3OnH3Zo46mQurw-Kzuv_aNKR7beU_YQmqJ8rIg2WUWTVFqVI7pApErCV41ff0Z1XA_1YHUKYo8ssy"
    })

    @POST("fcm/send")
    Call<Response> sendNotification(@Body Sender body);
}
