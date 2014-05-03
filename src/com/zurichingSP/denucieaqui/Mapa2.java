package com.zurichingSP.denucieaqui;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class Mapa2 extends Activity {

	private static int SPLASH_TIME_OUT = 3000;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapas2);

		Toast.makeText(getApplicationContext(),
				"Denuncia Realizada com sucesso", Toast.LENGTH_SHORT).show();
		new Handler().postDelayed(new Runnable() {
			public void run() {

				finish();
			}

		}, SPLASH_TIME_OUT);

	}

}
