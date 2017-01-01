package hq.cuong.boardgamecompanion.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.TutorialBlock;
import hq.cuong.boardgamecompanion.viewholders.BoardgameViewHolder;
import hq.cuong.boardgamecompanion.viewholders.SingleBoardGameViewHolder;

/**
 * Created by Cuong on 1/2/2017.
 */
public class SingleBoardGameAdapter extends RecyclerView.Adapter<SingleBoardGameViewHolder> {

    @Override
    public SingleBoardGameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.single_block, parent, false);

        SingleBoardGameViewHolder viewHolder = new SingleBoardGameViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SingleBoardGameViewHolder holder, int position) {

        TutorialBlock tutorialBlock = TutorialBlock.TUTORIAL_BLOCKS[position];

        holder.bind(tutorialBlock);
    }

    @Override
    public int getItemCount() {
        return TutorialBlock.TUTORIAL_BLOCKS.length;
    }
}
