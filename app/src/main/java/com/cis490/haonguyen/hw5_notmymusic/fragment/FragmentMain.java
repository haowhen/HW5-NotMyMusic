package com.cis490.haonguyen.hw5_notmymusic.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.cis490.haonguyen.hw5_notmymusic.DetailActivity;
import com.cis490.haonguyen.hw5_notmymusic.R;
import com.cis490.haonguyen.hw5_notmymusic.SongAdapter;

/**
 * Created by Hao on 11/2/2014.
 */
public class FragmentMain extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_main, container, false);

		GridView gridView = (GridView) view.findViewById(R.id.gridview);
		gridView.setAdapter(new SongAdapter(getActivity()));

		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(view.getContext(), DetailActivity.class);
				startActivity(intent);
			}
		});
		return view;
	}
}
