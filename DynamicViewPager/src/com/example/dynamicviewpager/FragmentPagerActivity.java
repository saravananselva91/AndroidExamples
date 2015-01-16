package com.example.dynamicviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class FragmentPagerActivity extends FragmentActivity {

	private static final int NUMBER_OF_PAGES = 10;

	private ViewPager mViewPager;
	private MyFragmentPagerAdapter mMyFragmentPagerAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fragment_pager);

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mMyFragmentPagerAdapter = new MyFragmentPagerAdapter(
				getSupportFragmentManager());
		mViewPager.setAdapter(mMyFragmentPagerAdapter);

	}

	private static class MyFragmentPagerAdapter extends FragmentPagerAdapter {

		public MyFragmentPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int index) {

			return PageFragment.newInstance("My Message " + index);
		}

		@Override
		public int getCount() {

			return NUMBER_OF_PAGES;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub
			// return super.getPageTitle(position);

			return "page " + position;

		}

	}
}
