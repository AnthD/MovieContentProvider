package androidhive.info.materialdesign.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidhive.info.materialdesign.R;

/**
 * Created by tonydavies on 30/03/2016.
 */

public class PubFragment extends Fragment {
    public PubFragment() {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
         return inflater.inflate(R.layout.fragment_pub, container, false);

    }
}
