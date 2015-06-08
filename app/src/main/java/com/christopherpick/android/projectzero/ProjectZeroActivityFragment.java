package com.christopherpick.android.projectzero;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class ProjectZeroActivityFragment extends Fragment implements View.OnClickListener {

//    private CardView spotify;
//    private CardView scores;
//    private CardView library;
//    private CardView buildit;
//    private CardView xyz;
//    private CardView capstone;

    public ProjectZeroActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project_zero, container, false);

        view.findViewById(R.id.spotify).setOnClickListener(this);
        view.findViewById(R.id.scores).setOnClickListener(this);
        view.findViewById(R.id.library).setOnClickListener(this);
        view.findViewById(R.id.buildit).setOnClickListener(this);
        view.findViewById(R.id.xyz).setOnClickListener(this);
        view.findViewById(R.id.capstone).setOnClickListener(this);


//        spotify = (CardView) view.findViewById(R.id.spotify);
//        scores = (CardView) view.findViewById(R.id.scores);
//        library = (CardView) view.findViewById(R.id.library);
//        buildit = (CardView) view.findViewById(R.id.buildit);
//        xyz = (CardView) view.findViewById(R.id.xyz);
//        capstone = (CardView) view.findViewById(R.id.capstone);
        return view;
    }


    @Override
    public void onClick(View view) {
        String name = "";
        switch (view.getId()) {
            case (R.id.spotify) : {
                name = getString(R.string.spotify);
                break;
            }
            case (R.id.scores) : {
                name = getString(R.string.scores);
                break;
            }
            case (R.id.library) : {
                name = getString(R.string.library);
                break;
            }
            case (R.id.buildit) : {
                name = getString(R.string.buildit);
                break;
            }
            case (R.id.xyz) : {
                name = getString(R.string.xyz);
                break;
            }
            case (R.id.capstone) : {
                name = getString(R.string.capstone);
                break;
            }
        }

        Toast.makeText(getActivity(),String.format(getString(R.string.this_button_toast), name),Toast.LENGTH_LONG).show();
    }
}
