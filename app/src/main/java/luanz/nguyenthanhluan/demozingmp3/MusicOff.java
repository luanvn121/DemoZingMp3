package luanz.nguyenthanhluan.demozingmp3;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import musicoff.FragmentAlbum;
import musicoff.FragmentBaihat;
import musicoff.FragmentNghesi;
import musicoff.FragmentPlaylist;
import musicoff.ViewPagerAdapter;

public class MusicOff extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicoff);

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FragmentPlaylist(),"Playlist");
        viewPagerAdapter.addFragment(new FragmentBaihat(),"Bài hát");
        viewPagerAdapter.addFragment(new FragmentAlbum(),"Album");
        viewPagerAdapter.addFragment(new FragmentNghesi(),"Nghệ sĩ");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
