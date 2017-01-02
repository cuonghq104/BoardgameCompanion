package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.models.BoardGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardGameInformationFragment extends Fragment {

    @BindView(R.id.iv_boardgame)
    ImageView ivBoardGame;

    @BindView(R.id.tv_name)
    TextView tvName;

    @BindView(R.id.tv_number_of_player)
    TextView tvNumberOfPlayer;

    @BindView(R.id.tv_suggested_player)
    TextView tvSuggestedPlayer;

    @BindView(R.id.tv_playing_time)
    TextView tvPlayingTime;

    @BindView(R.id.tv_categories)
    TextView tvCategories;

    @BindView(R.id.tv_play_type)
    TextView tvPlayType;

    BoardGame boardGame;

    public BoardGameInformationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_board_game_information, container, false);
        ButterKnife.bind(this, view);
        setupUI();
        return view;
    }

    private void setupUI() {

//        Bundle bundle = getArguments();
//
//        int position = bundle.getInt(BoardGame.BOARD_GAME);

        boardGame = BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame);

        Picasso.with(ivBoardGame.getContext()).load(boardGame.getImageUrl()).into(ivBoardGame);

        String name = boardGame.getName().toUpperCase();

        tvName.setText(Html.fromHtml(String.format("<u>%s<u>", name)));

        tvNumberOfPlayer.setText(String.format("%d - %d", boardGame.getMinPlayer(), boardGame.getMaxPlayer()));

        tvSuggestedPlayer.setText(String.format("%s", boardGame.getFavoritePlayer()));

        tvPlayingTime.setText(String.format("%d", boardGame.getPlayingTime()));

        String categories = "";

        int size = boardGame.getCategories().length;
        for (int i = 0; i < size; i++) {
            categories += boardGame.getCategories()[i];
            if (i != size - 1) {
                categories += " , ";
            }
        }

        tvCategories.setText(String.format("%s", categories));

        String playType = "";

        size = boardGame.getPlayType().length;
        for (int i = 0; i < size; i++) {
            playType += boardGame.getPlayType()[i];
            if (i != size - 1) {
                playType += " , ";
            }
        }

        tvPlayType.setText(playType);
    }

}
