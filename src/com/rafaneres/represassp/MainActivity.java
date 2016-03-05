package com.rafaneres.represassp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements Runnable {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
        Button btnDados = (Button) findViewById(R.id.verDados);
		
		btnDados.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
		Intent i = new Intent(MainActivity.this, Dados.class);
		startActivityForResult(i, 1);
		}
		});
		
		Typeface fontFace = Typeface.createFromAsset(getAssets(), "BebasNeue.otf");
		TextView txtFonte = (TextView) findViewById(R.id.text_welcome);
		txtFonte.setTypeface(fontFace);
		txtFonte.setGravity(Gravity.CENTER);
		txtFonte.setTextColor(Color.parseColor("#FFFFFF"));
		
		Typeface fontBt = Typeface.createFromAsset(getAssets(), "BebasNeue.otf");
		TextView btFonte = (TextView) findViewById(R.id.verDados);
		btFonte.setTypeface(fontBt);
		btFonte.setGravity(Gravity.CENTER);
		btFonte.setTextColor(Color.parseColor("#FFFFFF"));
		
		Typeface fontAb = Typeface.createFromAsset(getAssets(), "helveticaneue-light.otf");
		TextView AbFonte = (TextView) findViewById(R.id.aboutText);
		AbFonte.setTypeface(fontAb);
		AbFonte.setGravity(Gravity.CENTER);
		AbFonte.setTextColor(Color.parseColor("#FFFFFF"));
		
	}

    public void run(){

		finish();//aqui é chamado o método finish pra finalizar a activity atual no caso SplashScreen
	}
		
	}
	
   