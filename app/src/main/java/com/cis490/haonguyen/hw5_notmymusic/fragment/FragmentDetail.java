package com.cis490.haonguyen.hw5_notmymusic.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cis490.haonguyen.hw5_notmymusic.R;

/**
 * Created by Hao on 11/2/2014.
 */
public class FragmentDetail extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_detail, container, false);
		return view;
	}
}
