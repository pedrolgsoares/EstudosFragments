package com.pedrolgsoares.estudosfragments.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pedrolgsoares.estudosfragments.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PrimeiroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PrimeiroFragment extends Fragment {
    // Instanciar os atributos
    private TextView textViewPrimeiroFrag;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PrimeiroFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrimeiroFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PrimeiroFragment newInstance(String param1, String param2) {
        PrimeiroFragment fragment = new PrimeiroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        // Aplicarmos o objeto view no inflater para conseguirmos entrar no atributo textView e aplicar o findViewById
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        textViewPrimeiroFrag = view.findViewById(R.id.textViewPrimeiroFrag);
        textViewPrimeiroFrag.setText("Fragmento 1 alterado");
        return view;
    }
}