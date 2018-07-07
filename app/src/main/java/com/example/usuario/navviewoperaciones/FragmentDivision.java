package com.example.usuario.navviewoperaciones;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FragmentDivision extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_fragment_division, container, false);
        Button btns;
        btns = (Button)view.findViewById(R.id.btndiv);
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double respuesta = 0.0;
                itemOperaciones itemOperaciones = new itemOperaciones();
                EditText n1=(EditText)view.findViewById(R.id.edittextn1d);
                EditText n2 = (EditText)view.findViewById(R.id.edittextn2d);
                Double A= Double.parseDouble(n1.getText().toString());
                Double B=Double.parseDouble(n2.getText().toString());

                respuesta =itemOperaciones.dividir(A,B);

                TextView resultado = view.findViewById(R.id.textresdiv);
                resultado.setText("El resultado es: "+respuesta);

            }
        });
        return view;

    }


}
