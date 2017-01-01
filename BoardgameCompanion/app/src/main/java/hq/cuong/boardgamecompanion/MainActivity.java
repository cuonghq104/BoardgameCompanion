package hq.cuong.boardgamecompanion;

import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import butterknife.BindView;
import butterknife.ButterKnife;
import hq.cuong.boardgamecompanion.events.ChangeFragmentEvent;
import hq.cuong.boardgamecompanion.models.BoardGame;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.fl_container)
    FrameLayout flContainer;

//    @BindView(R.id.tv_bgname)
//    TextView tvName;

    @BindView(R.id.ll_root)
    LinearLayout llRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
        changeFragment(new BoardgameListFragment(), false);
    }

    private void changeFragment(Fragment fragment, boolean addToBackStack) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fl_container, fragment);

        if (addToBackStack)
            fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }

    @Subscribe
    public void changeDetailFragment(ChangeFragmentEvent changeFragmentEvent) {

        int boardgame = changeFragmentEvent.getBoardGame();


        if (BoardGame.boardGamesTemps.get(boardgame).getDetailUrl().equals("")) {
            Toast.makeText(this, BoardGame.boardGamesTemps.get(boardgame).getDetailUrl(), Toast.LENGTH_SHORT).show();
            Snackbar snackbar = Snackbar.make(llRoot, "Đang phát triển", Snackbar.LENGTH_SHORT);
            snackbar.show();
            return;
        }
//        tvName.setText(BoardGame.boardGames[boardgame].getName());

        Bundle bundle = new Bundle();

        bundle.putInt(BoardGame.BOARD_GAME, boardgame);

        Fragment fragment = changeFragmentEvent.getFragment();

        fragment.setArguments(bundle);

        changeFragment(fragment, changeFragmentEvent.isAddToBackStack());
    }
}
