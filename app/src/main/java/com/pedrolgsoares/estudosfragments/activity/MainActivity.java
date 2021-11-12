package com.pedrolgsoares.estudosfragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pedrolgsoares.estudosfragments.R;
import com.pedrolgsoares.estudosfragments.fragment.PrimeiroFragment;
import com.pedrolgsoares.estudosfragments.fragment.SegundoFragment;

public class MainActivity extends AppCompatActivity {

    // Instanciar os botões
    private Button buttonFragmento1, buttonFragmento2;

    // Instanciar os fragments
    private PrimeiroFragment primeiroFragment;
    private SegundoFragment segundoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Após a instancia dos botões aplicar o findview neles
        buttonFragmento1 = findViewById(R.id.buttonFragmento1);
        buttonFragmento2 = findViewById(R.id.buttonFragmento2);

        // Instanciar os objetos fragments dentro do onCreate
        primeiroFragment = new PrimeiroFragment();

        // Após ter sido realizada as alterações das classes dos fragmentos iremos configurar o objeto para o fragmento
        // Por padrão deve ser configurado já o primeiro fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameContainer, primeiroFragment);
        transaction.commit();

        // Instanciar o método setOnClickListener
        buttonFragmento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                primeiroFragment = new PrimeiroFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContainer, primeiroFragment);
                transaction.commit();
            }
        });
        buttonFragmento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                segundoFragment = new SegundoFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameContainer, segundoFragment);
                transaction.commit();
            }
        });


    }
}