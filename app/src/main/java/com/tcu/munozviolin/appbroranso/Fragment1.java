package com.tcu.munozviolin.appbroranso;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {
    View v;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b17;
    Button b18;
    Button b19;
    Button b20;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        b1 = (Button) v.findViewById(R.id.b1);
        b2 = (Button) v.findViewById(R.id.b2);
        b3 = (Button) v.findViewById(R.id.b3);
        b4 = (Button) v.findViewById(R.id.b4);
        b5 = (Button) v.findViewById(R.id.b5);
        b6 = (Button) v.findViewById(R.id.b6);
        b7 = (Button) v.findViewById(R.id.b7);
        b8 = (Button) v.findViewById(R.id.b8);
        b9 = (Button) v.findViewById(R.id.b9);
        b10 = (Button) v.findViewById(R.id.b10);
        b11 = (Button) v.findViewById(R.id.b11);
        b12 = (Button) v.findViewById(R.id.b12);
        b13 = (Button) v.findViewById(R.id.b13);
        b14 = (Button) v.findViewById(R.id.b14);
        b15 = (Button) v.findViewById(R.id.b15);
        b16 = (Button) v.findViewById(R.id.b16);
        b17 = (Button) v.findViewById(R.id.b17);
        b18 = (Button) v.findViewById(R.id.b18);
        b19 = (Button) v.findViewById(R.id.b19);
        b20 = (Button) v.findViewById(R.id.b20);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        Intent i;
        int click = view.getId();
        int c1 = R.id.b1;
        int c2 = R.id.b2;
        int c3 = R.id.b3;
        int c4 = R.id.b4;
        int c5 = R.id.b5;
        int c6 = R.id.b6;
        int c7 = R.id.b7;
        int c8 = R.id.b8;
        int c9 = R.id.b9;
        int c10 = R.id.b10;
        int c11 = R.id.b11;
        int c12 = R.id.b12;
        int c13 = R.id.b13;
        int c14 = R.id.b14;
        int c15 = R.id.b15;
        int c16 = R.id.b16;
        int c17 = R.id.b17;
        int c18 = R.id.b18;
        int c19 = R.id.b19;
        int c20 = R.id.b20;

        if (click == c1) {
            i = new Intent(view.getContext(), Caso1.class);
            startActivity(i);
        } else if (click == c2) {
            i = new Intent(view.getContext(), Caso2.class);
            startActivity(i);
        } else if (click == c3) {
            i = new Intent(view.getContext(), Caso3.class);
            startActivity(i);
        } else if (click == c4) {
            i = new Intent(view.getContext(), Caso4.class);
            startActivity(i);
        } else if (click == c5) {
            i = new Intent(view.getContext(), Caso5.class);
            startActivity(i);
        } else if (click == c6) {
            i = new Intent(view.getContext(), Caso6.class);
            startActivity(i);
        } else if (click == c7) {
            i = new Intent(getContext(), Caso7.class);
            startActivity(i);
        } else if (click == c8) {
            i = new Intent(view.getContext(), Caso8.class);
            startActivity(i);
        } else if (click == c9) {
            i = new Intent(view.getContext(), Caso9.class);
            startActivity(i);
        } else if (click == c10) {
            i = new Intent(view.getContext(), Caso10.class);
            startActivity(i);
        } else if (click == c11) {
            i = new Intent(view.getContext(), Caso11.class);
            startActivity(i);
        } else if (click == c12) {
            i = new Intent(view.getContext(), Caso12.class);
            startActivity(i);
        } else if (click == c13) {
            i = new Intent(view.getContext(), Caso13.class);
            startActivity(i);
        } else if (click == c14) {
            i = new Intent(view.getContext(), Caso14.class);
            startActivity(i);
        } else if (click == c15) {
            i = new Intent(view.getContext(), Caso15.class);
            startActivity(i);
        } else if (click == c16) {
            i = new Intent(view.getContext(), Caso16.class);
            startActivity(i);
        } else if (click == c17) {
            i = new Intent(view.getContext(), Caso17.class);
            startActivity(i);
        } else if (click == c18) {
            i = new Intent(view.getContext(), Caso18.class);
            startActivity(i);
        } else if (click == c19) {
            i = new Intent(view.getContext(), Caso19.class);
            startActivity(i);
        } else {
            i = new Intent(view.getContext(), Caso20.class);
            startActivity(i);
        }
    }
}
