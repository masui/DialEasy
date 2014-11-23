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
    Context context;
    
    public DialEasyInterface(Context c) {
	this.context = c;
    }
    
    public void dial(String number)
    {
	DialEasy de = (DialEasy)(this.context);
	de.dial(number);
    }
}
