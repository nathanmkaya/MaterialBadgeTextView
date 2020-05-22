package sample.badgeview.starry.matrixxun.com.materialbadgetextview;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.matrixxun.starry.badgetextview.MaterialBadgeTextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private MaterialBadgeTextView just_new_feature;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_main, container, false);
        just_new_feature = (MaterialBadgeTextView)view.findViewById(R.id.just_new_feature);
        just_new_feature.setHighLightMode();

        TextView test_text = (MaterialBadgeTextView)view.findViewById(R.id.test_text);
        test_text.setBackgroundColor(Color.parseColor("#987aef"));
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
