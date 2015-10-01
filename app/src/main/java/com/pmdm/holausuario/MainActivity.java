package com.pmdm.holausuario;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referencias
        final EditText txtNombre = (EditText) findViewById(R.id.TxtNombre);
        final Button btnHola = (Button) findViewById(R.id.BtnHola);
        //evento click
        btnHola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent
                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                //bundle
                Bundle bundle = new Bundle();
                bundle.putString("NOMBRE", txtNombre.getText().toString());
                //poner bundle en intent
                intent.putExtras(bundle);
                //iniciar nueva activity
                startActivity(intent);
            }
        });
    }

}
