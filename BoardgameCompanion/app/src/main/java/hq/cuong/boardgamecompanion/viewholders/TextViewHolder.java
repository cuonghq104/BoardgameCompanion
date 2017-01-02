package hq.cuong.boardgamecompanion.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.TutorialBlock;

/**
 * Created by Cuong on 1/2/2017.
 */
public class TextViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_content)
    TextView tvContent;

    public TextViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(TutorialBlock tutorialBlock) {
        tvTitle.setText( tutorialBlock.getTitle());

        tvContent.setText(tutorialBlock.getContent());
    }

}
