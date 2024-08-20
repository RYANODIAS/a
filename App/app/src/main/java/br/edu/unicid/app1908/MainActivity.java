package br.edu.unicid.app1908;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor;
    private CheckBox chkFutebol;
    private CheckBox chkNatacao;
    private RadioGroup rdgSexo;
    private RadioButton rdbMasculino;
    private RadioButton rdbFeminino;
    private Button btnEnviar;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor = findViewById(R.id.edtValor);
        chkFutebol = findViewById(R.id.chkFutebol);
        chkNatacao = findViewById(R.id.chkNatacao);
        rdgSexo = findViewById(R.id.rdgSexo);
        rdbMasculino = findViewById(R.id.rdbMasculino);
        rdbFeminino = findViewById(R.id.rdbFeminino);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtResultado = findViewById(R.id.txtResultado);

        }
        public void enviar (View v){
        int valor = Integer.parseInt(edtValor.getText().toString());
        int valor2 = valor + 10;

        txtResultado.setText(String.valueOf(valor2));
        String esporte = "";

        if(chkFutebol.isSelected())
            esporte = esporte + "Futebol";
        if(chkNatacao.isSelected())
            esporte = esporte + "Natação";

        txtResultado.setText(esporte);

        String sexo = "";
        if(rdbFeminino.isChecked()){
            sexo = sexo + "Feminino";
        }
        if(rdbMasculino.isChecked()){
            sexo = sexo + "Masculino";
        }
        txtResultado.setText(sexo);



        }
    }
