package com.example.dadosusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtNome, edtSexo, edtIdade, edtEndereco, edtTelefone;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText)findViewById(R.id.txtNome);
        edtSexo = (EditText)findViewById(R.id.txtSexo);
        edtIdade = (EditText)findViewById(R.id.txtIdade);
        edtEndereco = (EditText)findViewById(R.id.txtEndereco);
        edtTelefone = (EditText)findViewById(R.id.txtTelefone);

        btnEnviar = (Button)findViewById(R.id.cmdEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edtNome.getText().toString();
                String sexo = edtSexo.getText().toString();
                String endereco = edtEndereco.getText().toString();
                String idade = edtIdade.getText().toString();
                String telefone = edtTelefone.getText().toString();

                Usuario usuario = new Usuario(nome, sexo, endereco, idade, telefone);

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("objeto", usuario);
                startActivity(intent);
            }
        });

    }
}