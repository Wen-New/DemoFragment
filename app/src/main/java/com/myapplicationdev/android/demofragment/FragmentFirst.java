package com.myapplicationdev.android.demofragment;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {

    android.widget.Button btnAddText;
  android.widget.TextView tvFrag1;

    public FragmentFirst() {
        // Required empty public constructor
    }



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View view = inflater.inflate(R.layout.fragment_first, container, false);

    tvFrag1 = (android.widget.TextView) view.findViewById(R.id.tvFrag1);
    btnAddText = (android.widget.Button) view.findViewById(R.id.btnAddTextFrag1);

    btnAddText.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String data = tvFrag1.getText().toString() + "\n" + "New Data";
        tvFrag1.setText(data);
      }
    });

    return view;
  }


}
