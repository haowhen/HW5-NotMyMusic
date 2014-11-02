package com.cis490.haonguyen.hw5_notmymusic;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.cis490.haonguyen.hw5_notmymusic.R;
import com.cis490.haonguyen.hw5_notmymusic.fragment.FragmentDetail;
import com.cis490.haonguyen.hw5_notmymusic.listener.MyTabListener;

/**
 * Created by Hao on 11/2/2014.
 */
public class DetailActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);


		//Adding ActionBar with tabs
		getActionBar().setDisplayHomeAsUpEnabled(true);

		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		ActionBar.Tab tab1 = actionBar.newTab().setText("Details");
		tab1.setTabListener(new MyTabListener());
		actionBar.addTab(tab1);

		ActionBar.Tab tab2 = actionBar.newTab().setText("More Music");
		tab2.setTabListener(new MyTabListener());
		actionBar.addTab(tab2);

		ActionBar.Tab tab3 = actionBar.newTab().setText("Events");
		tab3.setTabListener(new MyTabListener());
		actionBar.addTab(tab3);


		//Set up fragment
		FragmentDetail frag = new FragmentDetail();
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.detail, frag, "FragmentDetail");
		transaction.commit();
	}
}
