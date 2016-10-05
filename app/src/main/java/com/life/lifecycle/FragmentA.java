package com.life.lifecycle;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    private View view;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_blank, container, false);

        Log.d("Fragment A","onCreateView");

        Button clickButton = (Button)view.findViewById(R.id.click);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new FragmentB()).addToBackStack("A").commit();

            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment A","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment A","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Fragment A","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment A","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment A","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment A","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment A","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment A","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment A","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment A","onDetach");
    }
}
