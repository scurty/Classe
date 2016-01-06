package com.claup.classe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Sidney on 05/01/2016.
 */

public  class PlaceholderFragment1 extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static TextView textViewBt;

    private static Contador contador;
    public PlaceholderFragment1(){

    }



    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment1 newInstance(Contador contador) {
        PlaceholderFragment1 fragment = new PlaceholderFragment1();
        Bundle args = new Bundle();
        args.putSerializable("contador",   contador);
       // args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public void onResume(){
        super.onResume();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
   //     textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        contador = (Contador) getArguments().getSerializable("contador");

        textViewBt = (TextView) rootView.findViewById(R.id.textView);
        textViewBt.setText(String.valueOf(contador.getNumero()));

        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                String txt = String.valueOf(contador.addgetNumero());
                textViewBt.setText(txt);

            }
        });

        AdView mAdView = (AdView) rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return rootView;
    }
}