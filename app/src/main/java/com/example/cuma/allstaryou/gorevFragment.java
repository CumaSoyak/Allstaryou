package com.example.cuma.allstaryou;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class gorevFragment extends Fragment {
 Toolbar toolbar;
    FloatingActionButton fab;

    public gorevFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_gorev,container,false);
        fab=view.findViewById(R.id.fab);
        if (fab!=null){
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Today's Current Affairs", Snackbar.LENGTH_LONG).setAction("Action",null).show();
                    Intent h5 = new Intent(getActivity(), MainActivity.class);
                    h5.putExtra("cat_id", "170");
                    startActivity(h5);


                }
            });
        }
        return view;
    }

}
