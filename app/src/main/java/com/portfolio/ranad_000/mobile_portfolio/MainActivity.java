package com.portfolio.ranad_000.mobile_portfolio;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //private static int SPLASH_TIME_OUT = 4000;
    private ImageButton portfolio_btn;
    private SectionsPageAdpater sectionsPageAdapter;
    private ViewPager mViewPager;
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");
        SectionsPageAdpater adpater = new SectionsPageAdpater(getSupportFragmentManager());


        ImageView roundHeaderImage = (ImageView) findViewById(R.id.header_image);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.profile_pic);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmapDrawable.setCircular(true);
        roundHeaderImage.setImageDrawable(roundedBitmapDrawable);


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdpater adapter = new SectionsPageAdpater(getSupportFragmentManager());
        adapter.addFragment(new projectsTab(), "Projects");
        adapter.addFragment(new experienceTab(), "Experience");
        adapter.addFragment(new educationTab(), "Education");
        viewPager.setAdapter(adapter);
    }

    public void goToPortfolio(View v) {
        Intent portfolioPage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://yoitsmesh.wordpress.com/digital-dreams-portfolio/"));
        startActivity(portfolioPage);
    }

    public void goToGit(View v) {
        Intent portfolioPage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/dpr5"));
        startActivity(portfolioPage);
    }



}

