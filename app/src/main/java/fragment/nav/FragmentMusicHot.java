package fragment.nav;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import luanz.nguyenthanhluan.demozingmp3.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMusicHot extends Fragment {


    public FragmentMusicHot() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_music_hot, container, false);
    }

}
