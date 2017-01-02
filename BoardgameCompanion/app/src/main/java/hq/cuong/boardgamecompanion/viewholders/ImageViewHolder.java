package hq.cuong.boardgamecompanion.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.TutorialBlock;

/**
 * Created by Cuong on 1/2/2017.
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.iv_boardgame)
    ImageView ivBoardGame;

    public ImageViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(TutorialBlock tutorialBlock) {
        Picasso.with(ivBoardGame.getContext()).load(tutorialBlock.getImageUrl()).into(ivBoardGame);
    }
}
