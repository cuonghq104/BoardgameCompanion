package hq.cuong.boardgamecompanion.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.BoardGame;
import hq.cuong.boardgamecompanion.viewholders.BoardgameViewHolder;

/**
 * Created by Cuong on 1/1/2017.
 */
public class BoardgameAdapter extends RecyclerView.Adapter<BoardgameViewHolder> {
    @Override
    public BoardgameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.list_item, parent, false);

        BoardgameViewHolder viewHolder = new BoardgameViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BoardgameViewHolder holder, int position) {
//        TutorialBlock tutorialBlock = BoardGame.boardGames[0].getTutorialBlocks()[position];

//        holder.bind(tutorialBlock);

//        BoardGame boardGame = BoardGame.boardGames[position];

        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return BoardGame.boardGames.length;
    }
}
