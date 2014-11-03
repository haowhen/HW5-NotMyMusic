package com.cis490.haonguyen.hw5_notmymusic;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.cis490.haonguyen.hw5_notmymusic.fragment.FragmentAdd;

/**
 * Created by Hao on 11/2/2014.
 */
public class AddActivity extends FragmentActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);

		getActionBar().setDisplayHomeAsUpEnabled(true);

		FragmentAdd frag = new FragmentAdd();
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.addContainer,frag,"AddFragment");
		transaction.commit();
	}
}
