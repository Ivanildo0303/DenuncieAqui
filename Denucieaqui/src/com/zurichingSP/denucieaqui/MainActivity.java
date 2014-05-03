package com.zurichingSP.denucieaqui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText et_Login, et_Senha;
	Button bt_Cadastro, bt_Login;
	Bundle b_Parametros;
	public String Login="zurechingSP";
	public String Senha="1234";

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_Login = (EditText)findViewById(R.id.et_Login);
        et_Senha = (EditText)findViewById(R.id.et_Senha);
        bt_Cadastro = (Button)findViewById(R.id.bt_Cadastro);
        bt_Login = (Button)findViewById(R.id.bt_Login);
        
        
        bt_Cadastro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent i_SegundaTela = new Intent("com.zurichingSP.denucieaqui.SegundaActivity");
				startActivity(i_SegundaTela);
				
			}
        	
        	
        });
        
        
        bt_Login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			
			
			public void onClick(View v) {
				
				String s_Login = et_Login.getText().toString();
				String s_Senha = et_Senha.getText().toString();
				
				
				if( s_Login.equalsIgnoreCase(Login) && s_Senha.equalsIgnoreCase(Senha) ){
					
					Intent i_TerceiraTela = new Intent(MainActivity.this,TerceiraActivity.class);
					startActivity(i_TerceiraTela);
					
				}
				else{
					
					Toast.makeText(getApplicationContext(), "Combinacao login: "+s_Login+" e senha:"+ s_Senha+" incorretos",
							   Toast.LENGTH_LONG).show();
			
				}
			}
		});
        
    
    }

    
}
