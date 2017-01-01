package hq.cuong.boardgamecompanion.events;

import android.support.v4.app.Fragment;

import hq.cuong.boardgamecompanion.models.BoardGame;

/**
 * Created by Cuong on 1/1/2017.
 */
public class ChangeFragmentEvent {

    private Fragment fragment;

    private boolean addToBackStack;

    private int boardGame;

    public ChangeFragmentEvent(Fragment fragment, boolean addToBackStack, int boardGame) {
        this.fragment = fragment;
        this.addToBackStack = addToBackStack;
        this.boardGame = boardGame;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public boolean isAddToBackStack() {
        return addToBackStack;
    }

    public int getBoardGame() {
        return boardGame;
    }
}
