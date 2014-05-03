package com.zurichingSP.denucieaqui;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends Activity {
	
	TextView tv_Nome, tv_Email;
	Button bt_Voltar,bt_Cadastrar;
	EditText senha ;
	EditText senha2; 
	EditText Logins;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
	
		
		bt_Voltar = (Button)findViewById(R.id.bt_Voltar);
		bt_Cadastrar = (Button)findViewById(R.id.bt_Cadastrar);
		
		senha = (EditText)findViewById(R.id.editText3);
	    senha2 = (EditText)findViewById(R.id.editText4);
	    Logins = (EditText)findViewById(R.id.editText2);
		
		
		bt_Voltar.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Toast.makeText(getApplicationContext(), "Usuário cadastrado com sucesso",
						   Toast.LENGTH_LONG).show();
				finish();
			}
		});
		
		bt_Cadastrar.setOnClickListener(new View.OnClickListener() {			
			@Override
			public void onClick(View v) {
				
				if(senha.getText().toString().equals(senha2.getText().toString())){
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Usuário cadastrado com sucesso",
						   Toast.LENGTH_LONG).show();
				finish();
				
				}else{
					Toast.makeText(getApplicationContext(), "As Senhas Não Coferem",
							   Toast.LENGTH_LONG).show();
				}
			}
		});
	}


}
