package hq.cuong.boardgamecompanion;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.adapters.BoardgameAdapter;
import hq.cuong.boardgamecompanion.models.BoardGame;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardgameListFragment extends Fragment {

    private static final String TAG = BoardgameListFragment.class.toString();

    @BindView(R.id.rv_list)
    RecyclerView rvList;

    BoardgameAdapter adapter;

    @BindView(R.id.sv_bgname)
    SearchView svBoardGame;

    private static final String[] SUGGESTION = {
            "aaa",
            "bbb",
            "ccc",
            "ddd"
    };

    private SimpleCursorAdapter simpleCursorAdapter;

    public BoardgameListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_boardgame_list, container, false);
        ButterKnife.bind(this, view);
        setupUI();
        addListener();
        return view;
    }

    private void addListener() {

        svBoardGame.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                String text = svBoardGame.getQuery().toString();

                ArrayList<BoardGame> list = new ArrayList<BoardGame>();
                list.clear();
                for (BoardGame boardGame : BoardGame.boardGames) {
                    if (boardGame.getName().contains(text)) {
                        list.add(boardGame);
                    }
                }

                BoardGame.boardGamesTemps = list;

                adapter.notifyDataSetChanged();
                return true;
            }
        });
    }

    private void setupUI() {
        BoardGame.boardGamesTemps = Arrays.asList(BoardGame.boardGames);
        EditText searchEditText = (EditText) svBoardGame.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(getResources().getColor(R.color.white));
        searchEditText.setHintTextColor(getResources().getColor(R.color.white));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        searchEditText.setTypeface(typeface);
        adapter = new BoardgameAdapter();
        rvList.setAdapter(adapter);
        rvList.setLayoutManager(new GridLayoutManager(getContext(), 2));
    }

}
