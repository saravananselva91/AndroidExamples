package com.saravanan.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	ViewPager page = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		page = (ViewPager) findViewById(R.id.pager);

		FragmentManager manager = getSupportFragmentManager();

		page.setAdapter(new PageAdapter(manager));
	}

	class PageAdapter extends FragmentPagerAdapter {

		public PageAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub

			Fragment fraga = new FragmentA();
			Fragment fragb = new FragmentB();
			Fragment fragc = new FragmentC();

			if (arg0 == 0) {

				return fraga;

			}

			if (arg0 == 1) {

				return fragb;
			}

			if (arg0 == 2) {

				return fragc;
			}

			return null;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			// TODO Auto-generated method stub

			if (position == 0) {

				return "page one";
			}

			if (position == 1) {

				return "page two";
			}

			if (position == 2) {
				return "page three";

			}

			return null;
		}

	}
}
