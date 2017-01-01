package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.transforms.CircleTransform;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    @BindView(R.id.iv_test)
    ImageView ivTest;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        ButterKnife.bind(this, view);
        Picasso.with(getContext()).load("http://static1.businessinsider.com/image/54cbb7e5eab8eaeb0f8790af/a-card-game-about-exploding-kittens-and-laser-beams-is-now-the-most-backed-kickstarter-ever.jpg")
                .transform(new CircleTransform()).into(ivTest);
        return view;
    }

}
