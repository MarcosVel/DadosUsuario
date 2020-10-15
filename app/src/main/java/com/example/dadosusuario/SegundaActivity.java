package com.example.dadosusuario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    TextView tvDados;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        setTitle("Segunda Tela");

        tvDados = (TextView)findViewById(R.id.txtDados);

        Bundle dados = getIntent().getExtras();

        Usuario usuario = (Usuario) dados.getSerializable("objeto");

//        if (usuario.getSexo() == "F") {
//            tvDados.setText("O " + usuario.getNome() + " que mora em " + usuario.getEndereco() +
//                    " tem " + usuario.getIdade() + " anos e seu telefone é " + usuario.getTelefone());
//        } else {
//            tvDados.setText("A " + usuario.getNome() + " que mora em " + usuario.getEndereco() +
//                    " tem " + usuario.getIdade() + " anos e seu telefone é " + usuario.getTelefone());
//        }

        if(usuario.getSexo() != null) {
            switch (usuario.getSexo()) {
                case "m":
                case "M":
                    tvDados.setText("O " + usuario.getNome() + " que mora em " + usuario.getEndereco() +
                            " tem " + usuario.getIdade() + " anos e seu telefone é " + usuario.getTelefone());
                    break;
                case "f":
                case "F":
                    tvDados.setText("A " + usuario.getNome() + " que mora em " + usuario.getEndereco() +
                            " tem " + usuario.getIdade() + " anos e seu telefone é " + usuario.getTelefone());
                    break;
            }
        }
    }
}