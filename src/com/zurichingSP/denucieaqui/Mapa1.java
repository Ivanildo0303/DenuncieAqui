package com.zurichingSP.denucieaqui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Mapa1 extends Activity {
	
	Button b;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapa1);
		
		b=(Button)findViewById(R.id.AdicionarPin);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Mapa1.this,Mapa2.class);
				startActivity(i);
				finish();
			}
		});
		
	}

}
