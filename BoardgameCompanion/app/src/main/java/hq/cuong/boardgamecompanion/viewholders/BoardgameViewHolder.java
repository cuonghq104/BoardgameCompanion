package hq.cuong.boardgamecompanion.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hq.cuong.boardgamecompanion.DetailFragment;
import hq.cuong.boardgamecompanion.events.ChangeFragmentEvent;
import hq.cuong.boardgamecompanion.transforms.CircleTransform;
import hq.cuong.boardgamecompanion.R;
import hq.cuong.boardgamecompanion.models.BoardGame;

/**
 * Created by Cuong on 1/1/2017.
 */
public class BoardgameViewHolder extends RecyclerView.ViewHolder{

    private static final String TAG = BoardgameViewHolder.class.toString();

    @BindView(R.id.iv_boardgame)
    ImageView ivBoardGame;

    @BindView(R.id.tv_name)
    TextView tvName;

    int position;

    public BoardgameViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
//        getReference(itemView);
    }


    public void bind(int position) {
        this.position = position;

        BoardGame boardGame = BoardGame.boardGames[position];

        tvName.setText(boardGame.getName());

        Picasso.with(ivBoardGame.getContext()).load(boardGame.getImageUrl()).transform(new CircleTransform()).into(ivBoardGame);
    }

    @OnClick(R.id.iv_boardgame)
    public void changeDetailFragment() {
        EventBus.getDefault().post(new ChangeFragmentEvent(new DetailFragment(), true, position));
    }
}
