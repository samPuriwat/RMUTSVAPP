package app.rmutsv.sampuriwat.rmutsvservice.fragment;
/**
 * Created by samPuriwat on 6/11/2560.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import app.rmutsv.sampuriwat.rmutsvservice.R;



public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }
}// main class
