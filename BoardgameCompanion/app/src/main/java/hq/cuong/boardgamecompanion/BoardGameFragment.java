package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.adapters.PageChangeAdapter;
import hq.cuong.boardgamecompanion.models.BoardGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardGameFragment extends Fragment {

    @BindView(R.id.vp_board_game)
    ViewPager vpBoardGame;

    private PageChangeAdapter adapter;

    public BoardGameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_board_game, container, false);
        ButterKnife.bind(this, view);
        setupUI();
        return view;
    }

    private void setupUI() {
        Bundle bundle = getArguments();

        int position = bundle.getInt(BoardGame.BOARD_GAME);

        BoardGame.currentBoardGame = position;

        adapter = new PageChangeAdapter(getActivity().getSupportFragmentManager());
        vpBoardGame.setAdapter(adapter);
    }

}
