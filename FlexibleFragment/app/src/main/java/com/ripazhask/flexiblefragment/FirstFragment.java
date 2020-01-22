package com.ripazhask.flexiblefragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Button btnSecond = view.findViewById(R.id.firstbutton);
        btnSecond.setOnClickListener(this);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Fragment Pertama");
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("(fragment_pertama)");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.firstbutton) {
            SecondFragment secondFragment = new SecondFragment();
            FragmentManager mfragmentManager = getFragmentManager();
            if (mfragmentManager != null) {
                mfragmentManager.beginTransaction().replace(R.id.frame_content, secondFragment, SecondFragment.class.getSimpleName()).addToBackStack(null).commit();
            }
        }
    }
}