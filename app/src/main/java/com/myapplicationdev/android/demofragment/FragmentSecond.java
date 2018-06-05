package com.myapplicationdev.android.demofragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {

    android.widget.Button btnAddText;
  android.widget.TextView tvFrag2;

    public FragmentSecond() {
        // Required empty public constructor
    }



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_second, container, false);

    tvFrag2 = (android.widget.TextView) view.findViewById(R.id.tvFrag2);
    btnAddText = (android.widget.Button) view.findViewById(R.id.btnAddTextFrag2);

    btnAddText.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String data = tvFrag2.getText().toString() + "\n" + "New Data F2";
        tvFrag2.setText(data);
      }
    });

    return view;
  }


}
