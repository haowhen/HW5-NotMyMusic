package com.cis490.haonguyen.hw5_notmymusic;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;

import com.cis490.haonguyen.hw5_notmymusic.fragment.FragmentMain;
import com.cis490.haonguyen.hw5_notmymusic.fragment.FragmentSearch;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		FragmentMain frag = new FragmentMain();
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.add(R.id.container, frag, "FragmentMain");
		transaction.commit();
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch (id){
			case android.R.id.home:
				NavUtils.navigateUpFromSameTask(this);
				return true;
			case R.id.action_add: add(); return true;
			case R.id.action_search: search(); return true;
		}
        /*
        if (id == R.id.action_settings) {

            return true;
        }
        */
		return super.onOptionsItemSelected(item);
    }

	private void search() {
		FragmentSearch frag = new FragmentSearch();
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.replace(R.id.container,frag,"FragmentSearch");
		transaction.commit();
	}

	private void add(){
		startActivity(new Intent(getApplicationContext(), AddActivity.class));
	}
}
