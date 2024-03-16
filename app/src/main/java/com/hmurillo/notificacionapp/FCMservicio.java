package com.hmurillo.notificacionapp;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
public class FCMservicio extends FirebaseMessagingService {
    public void onNewToken(@NonNull String s){
        super.onNewToken(s);
        Log.i("Token","Token ID"+s);
    }
}
