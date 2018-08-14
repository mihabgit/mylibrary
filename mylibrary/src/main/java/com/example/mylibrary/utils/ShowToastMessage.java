package com.example.mylibrary.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by mihab on 14/8/18
 */
public class ShowToastMessage {

    public static void showMessage (Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.TOP| Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void showMessageBottom (Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void showMessageBottomBoom (Context context, String message){

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.show();
    }

}
