package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hq.cuong.boardgamecompanion.adapters.PageChangeAdapter;
import hq.cuong.boardgamecompanion.events.BackEvent;
import hq.cuong.boardgamecompanion.models.BoardGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardGameFragment extends Fragment {

    @BindView(R.id.tv_name)
    TextView tvName;

    @BindView(R.id.vp_board_game)
    ViewPager vpBoardGame;

    @BindView(R.id.tl_board_game)
    TabLayout tlBoardGame;

    @BindView(R.id.bt_menu)
    Button btBack;

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

        tvName.setText(BoardGame.boardGamesTemps.get(position).getName().toUpperCase());

        BoardGame.currentBoardGame = position;

        adapter = new PageChangeAdapter(getActivity().getSupportFragmentManager());

        vpBoardGame.setAdapter(adapter);


    }

    @OnClick(R.id.bt_menu)
    public void backFromStack() {
        EventBus.getDefault().post(new BackEvent());
    }

}
