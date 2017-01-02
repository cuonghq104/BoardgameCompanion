package hq.cuong.boardgamecompanion.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.BoardGame;
import hq.cuong.boardgamecompanion.models.TutorialBlock;
import hq.cuong.boardgamecompanion.viewholders.CombineViewHolder;
import hq.cuong.boardgamecompanion.viewholders.ImageViewHolder;
import hq.cuong.boardgamecompanion.viewholders.TextViewHolder;

/**
 * Created by Cuong on 1/2/2017.
 */
public class SingleBoardGameAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (viewType == 1) {

            View view = inflater.inflate(R.layout.block_text, parent, false);

            TextViewHolder viewHolder = new TextViewHolder(view);

            return viewHolder;

        } else if (viewType == 0){

            View view = inflater.inflate(R.layout.block_image, parent, false);

            ImageViewHolder viewHolder = new ImageViewHolder(view);

            return viewHolder;

        } else {

            View view = inflater.inflate(R.layout.block_combine, parent, false);

            CombineViewHolder viewHolder = new CombineViewHolder(view);

            return viewHolder;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TutorialBlock tutorialBlock = BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list.get(position);

        if (holder.getItemViewType() == 0) {
            ImageViewHolder imageViewHolder = (ImageViewHolder) holder;
            imageViewHolder.bind(tutorialBlock);
        }
        else if (holder.getItemViewType() == 1){
            TextViewHolder textViewHolder = (TextViewHolder) holder;
            textViewHolder.bind(tutorialBlock);
        } else {
            CombineViewHolder combineViewHolder = (CombineViewHolder) holder;
            combineViewHolder.bind(tutorialBlock);
        }
    }

    @Override
    public int getItemCount() {
        return BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list.get(position).getType().equals(TutorialBlock.TEXT_TYPE)) {
            return 1;
        } else if (BoardGame.boardGamesTemps.get(BoardGame.currentBoardGame).list.get(position).getType().equals(TutorialBlock.IMAGE_TYPE)) {
            return 0;
        } else {
            return 2;
        }
    }
}
