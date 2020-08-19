package com.nanodegree.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesActivityFragment extends Fragment {

    private static final String GCE_RESULT = "gce_result";

    // Empty constructor
    public JokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_jokes_fragment, container, false);
        /*
        TextView jokesTextView = view.findViewById(R.id.tv_jokes);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("jokes");
        jokesTextView.setText(joke);
        */
        Intent intent = getActivity().getIntent();
        if(intent.hasExtra(GCE_RESULT)) {
            String gceResult = intent.getStringExtra(GCE_RESULT);
            TextView gceResultTextView = view.findViewById(R.id.tv_jokes);
            gceResultTextView.setText(gceResult);
        }

        return view;
    }
}