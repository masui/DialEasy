//
// JavaScriptから呼ばれるクラス
//
package com.pitecan.DialEasy;

import android.content.Context;
import android.widget.Toast;

import android.content.Intent;
import android.net.Uri;
import android.app.Activity;

public class DialEasyInterface {
    Activity activity;
    
    public DialEasyInterface(Activity a) {
	this.activity = a;
    }
    
    public void dial(String number)
    {
	Intent intent = new Intent(); 
	intent.setAction(Intent.ACTION_CALL); 
	intent.setData(Uri.parse("tel:"+number)); 
	activity.startActivity(intent);
    }
}
