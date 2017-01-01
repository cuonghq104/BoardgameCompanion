package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.models.BoardGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

//    @BindView(R.id.rv_board_games)
////    WebView wvDetail;
//    RecyclerView rvBoardGame;

    private BoardGame boardGame;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boardgame_detail, container, false);
        ButterKnife.bind(this, view);
        getData();
        setupUI();
        return view;
    }

    private void getData() {
//        Bundle bundle = getArguments();
//
//        int boardGamePosition = bundle.getInt(BoardGame.BOARD_GAME);

        this.boardGame = BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame);

    }

    private void setupUI() {
//        WebViewClient webViewClient = new WebViewClient();
//        wvDetail.setWebViewClient(webViewClient);
//        wvDetail.getSettings().setJavaScriptEnabled(true);
//        String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=" + boardGame.getDetailUrl();
//        wvDetail.loadUrl(url);


    }

}
