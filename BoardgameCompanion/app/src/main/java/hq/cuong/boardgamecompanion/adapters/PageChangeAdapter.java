package hq.cuong.boardgamecompanion.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import hq.cuong.boardgamecompanion.BoardGameInformationFragment;
import hq.cuong.boardgamecompanion.DetailFragment;
import hq.cuong.boardgamecompanion.RulesFragment;

/**
 * Created by Cuong on 1/2/2017.
 */
public class PageChangeAdapter extends FragmentStatePagerAdapter {

    private static final int NUMBER_PAGES = 2;

    public PageChangeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BoardGameInformationFragment();
        }
//        else if (position == 1) {
//            return new DetailFragment();
//        }
        else {
            return new RulesFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            default:
                return "INFORMATION";
//            case 1:
//                return "DETAIL";
            case 1:
                return "RULES";
        }
    }
}
