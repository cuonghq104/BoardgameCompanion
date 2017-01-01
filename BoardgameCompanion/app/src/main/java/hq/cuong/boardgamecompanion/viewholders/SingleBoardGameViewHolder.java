package hq.cuong.boardgamecompanion.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.TutorialBlock;

/**
 * Created by Cuong on 1/2/2017.
 */
public class SingleBoardGameViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_boardgame)
    ImageView ivBoardGame;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_content)
    TextView tvContent;

    public SingleBoardGameViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(TutorialBlock tutorialBlock) {

//        TutorialBlock tutorialBlock = TutorialBlock.TUTORIAL_BLOCKS[position];
        if (tutorialBlock.getType().equals(TutorialBlock.TEXT_TYPE)) {

            tvTitle.setText(tutorialBlock.getTitle());

            tvContent.setText(tutorialBlock.getContent());

            tvTitle.setVisibility(View.VISIBLE);

            tvContent.setVisibility(View.VISIBLE);

            ivBoardGame.setVisibility(View.GONE);
        } else {

            tvTitle.setVisibility(View.GONE);

            tvContent.setVisibility(View.GONE);
            
            ivBoardGame.setVisibility(View.VISIBLE);
            ivBoardGame.setImageResource(R.drawable.previous);
            Picasso.with(ivBoardGame.getContext()).load(tutorialBlock.getImageUrl()).into(ivBoardGame);

        }
    }
}
