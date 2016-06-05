package com.example.cditzen.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_detail, container, false);

        Intent intent = getActivity().getIntent();
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        Log.v("DetailActivityFragment", "In onCreateView");

        TextView detailText = (TextView) rootView.findViewById(R.id.detail_Text);

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)){
            String forecastString = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView textView = (TextView) rootView.findViewById(R.id.detail_Text);
            textView.setText(forecastString);
        }


        return rootView;
    }
}
