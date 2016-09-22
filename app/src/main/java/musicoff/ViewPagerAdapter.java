package musicoff;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Admin on 9/22/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<String> tabTitle = new ArrayList<>();
    ArrayList<Fragment> fragments = new ArrayList<>();

    public void addFragment (Fragment fragments,String title){
        this.fragments.add(fragments);
        this.tabTitle.add(title);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle.get(position);
    }
}
