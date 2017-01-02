package hq.cuong.boardgamecompanion;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hq.cuong.boardgamecompanion.adapters.SingleBoardGameAdapter;
import hq.cuong.boardgamecompanion.models.BoardGame;
import us.feras.mdv.MarkdownView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RulesFragment extends Fragment {


    BoardGame boardGame;
//
//    @BindView(R.id.wv_detail)
//    WebView wvDetail;

    //    @BindView(R.id.rv_rules)
//    RecyclerView rvRules;
    @BindView(R.id.mdv_rules)
    MarkdownView mdvRules;
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
        return view;
    }

    private void getData() {
//        Bundle bundle = getArguments();
//
//        int boardGamePosition = bundle.getInt(BoardGame.BOARD_GAME);

        this.boardGame = BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame);

    }

    @OnClick(R.id.btn_find_next)
    public void findNext() {
        mdvRules.findNext(true);
    }
    private void setupUI() {
        svRules.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("ahihi", String.format("begin search : query  = %s", query));
                mdvRules.findAllAsync(query);
                mdvRules.findNext(true);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        svRules.setOnSearchClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
//        mdvRules.loadMarkdown("Here's our logo (hover to see the title text):\n" +
//                "\n" +
//                "Inline-style: \n" +
//                "![alt text](https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png \"Logo Title Text 1\")\n" +
//                "\n" +
//                "Reference-style: \n" +
//                "![alt text][logo]\n" +
//                "\n" +
//                "[logo]: https://github.com/adam-p/markdown-here/raw/master/src/common/images/icon48.png \"Logo Title Text 2\"");
//        mdvRules.loadMarkdownFile("http://m.uploadedit.com/ba3s/1483326555496.txt");
        mdvRules.loadMarkdownFile( "file:///android_asset/werewolf_one_night.txt",
                "file:///android_asset/my_css.css");
        //todo debugging

//        adapter = new SingleBoardGameAdapter();
//        rvRules.setLayoutManager(new LinearLayoutManager(getContext()));
//        rvRules.setAdapter(adapter);

//        WebViewClient webViewClient = new WebViewClient();
//        wvDetail.setWebViewClient(webViewClient);
//        wvDetail.getSettings().setJavaScriptEnabled(true);
//        String url = "https://drive.google.com/viewerng/viewer?embedded=true&url=" + boardGame.getRulesUrl();
//        wvDetail.loadUrl(url);
    }


}
