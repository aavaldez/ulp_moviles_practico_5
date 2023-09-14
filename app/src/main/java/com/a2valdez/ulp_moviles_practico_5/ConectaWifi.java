package com.a2valdez.ulp_moviles_practico_5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

public class ConectaWifi extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Intent thisIntent = new Intent(Intent.ACTION_CALL);
        thisIntent.setData(Uri.parse("tel:2664553747"));
        thisIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        try{
            context.startActivity(thisIntent);
        } catch(Exception e){
            Log.d("salida", "ERROR: NO TIENE PERMISOS");
        }
    }
}