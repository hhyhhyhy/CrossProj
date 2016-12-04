package com.example.activity;


import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.challengeproject.R;

public class welcomeActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_welcome);
        Handler handler = new Handler(){
   	     @Override
   	    public void handleMessage(Message msg) {
   	    	 switch (msg.what) {
				case 2:
					Intent intent = new Intent(welcomeActivity.this , MainActivity.class);
					welcomeActivity.this.startActivityForResult(intent, 0);
					welcomeActivity.this.finish();
				    default:
					break;
				}
   	    	super.handleMessage(msg);
   	    }
   };
   handler.sendEmptyMessageDelayed(2, 2000L);
//        ImageButton btn1 = (ImageButton) findViewById(R.id.btnlog);
//        btn1.setClickable(true);
//        OnClickListener click = new OnClickListener()
//        {
//
//			@Override
//			public void onClick(View arg0) {
//				// TODO Auto-generated method stub
//				intent.setClass(welcomeActivity.this, MainActivity.class);
//				startActivity(intent);
//			}
//        	
//        };
//        btn1.setOnClickListener(click);
    }
    
    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
