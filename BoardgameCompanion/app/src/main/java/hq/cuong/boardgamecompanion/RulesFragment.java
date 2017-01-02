package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.adapters.SingleBoardGameAdapter;
import hq.cuong.boardgamecompanion.models.BoardGame;
import hq.cuong.boardgamecompanion.models.TutorialBlock;


/**
 * A simple {@link Fragment} subclass.
 */
public class RulesFragment extends Fragment {


    private static final String TAG = RulesFragment.class.toString();

    BoardGame boardGame;
//
//    @BindView(R.id.wv_detail)
//    WebView wvDetail;

    @BindView(R.id.rv_rules)
    RecyclerView rvRules;

    @BindView(R.id.sv_rules)
    SearchView svRules;

    public RulesFragment() {
        // Required empty public constructor
    }

    private SingleBoardGameAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rules, container, false);
        ButterKnife.bind(this, view);

        getData();
        setupUI();
        addListener();

        return view;
    }

    private void addListener() {
        svRules.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                String text = svRules.getQuery().toString().toLowerCase();

                ArrayList<TutorialBlock> list = new ArrayList<TutorialBlock>();
                list.clear();
                for (TutorialBlock tutorialBlock : BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).getTutorialBlocks()) {
                    if (tutorialBlock.getTitle().toLowerCase().contains(text)) {
                        list.add(tutorialBlock);
                    }
                }

                for (TutorialBlock tutorialBlock : BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).getTutorialBlocks()) {
                    for (String tag : tutorialBlock.getTags()) {
                        if (tag.toLowerCase().contains(text) && !list.contains(tutorialBlock)) {
                            list.add(tutorialBlock);
                        }
                    }
//                    Toast.makeText(getContext(), String.format("Tutorial : %s", tutorialBlock.toString()), Toast.LENGTH_LONG).show();
//                    Log.d(TAG, String.format("Tutorial : %s", tutorialBlock.toString()));
                }

                BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list = list;

//                adapter = new SingleBoardGameAdapter();
//                rvRules.setAdapter(adapter);
                adapter.notifyDataSetChanged();

                return true;
            }
        });
    }

    private void getData() {
//        Bundle bundle = getArguments();
//
//        int boardGamePosition = bundle.getInt(BoardGame.BOARD_GAME);

        this.boardGame = BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame);

    }

    private void setupUI() {

//        TutorialBlock.list = Arrays.asList(TutorialBlock.TUTORIAL_BLOCKS);
        BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list = Arrays.asList(BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).getTutorialBlocks());

        adapter = new SingleBoardGameAdapter();

        rvRules.setLayoutManager(new LinearLayoutManager(getContext()));

        rvRules.setAdapter(adapter);

//        WebViewClient webViewClient = new WebViewClient();
//        wvDetail.setWebViewClient(webViewClient);
//        wvDetail.getSettings().setJavaScriptEnabled(true);
//        String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=" + boardGame.getRulesUrl();
//        wvDetail.loadUrl(url);
    }


}
