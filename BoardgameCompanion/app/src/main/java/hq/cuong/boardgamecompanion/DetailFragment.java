package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
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


    BoardGame boardGame;

    @BindView(R.id.wv_detail)
    WebView wvDetail;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        ButterKnife.bind(this, view);

        getData();
        setupUI();
        return view;
    }

    private void getData() {
        Bundle bundle = getArguments();

        int boardGamePosition = bundle.getInt(BoardGame.BOARD_GAME);

        this.boardGame = BoardGame.boardGames[boardGamePosition];

    }

    private void setupUI() {

        WebViewClient webViewClient = new WebViewClient();
        wvDetail.setWebViewClient(webViewClient);
        wvDetail.getSettings().setJavaScriptEnabled(true);
        wvDetail.loadUrl(boardGame.getDetailUrl());
    }


}
