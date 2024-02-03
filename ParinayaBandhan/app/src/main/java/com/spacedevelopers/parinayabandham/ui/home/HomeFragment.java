package com.spacedevelopers.parinayabandham.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.spacedevelopers.parinayabandhan.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    FragmentHomeBinding fragmentHomeBinding;
    ViewPager2 viewPager;
    CardView interstCardView,chatCard,matchcard;
    ImageView matchimg,likeimg,chatimg;


    TextView username;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
fragmentHomeBinding =FragmentHomeBinding.inflate(inflater,container,false);

      setUiViews();
        return fragmentHomeBinding.getRoot();

    }

    private void setUiViews() {
      viewPager=fragmentHomeBinding.banners;
      username=fragmentHomeBinding.username;

       interstCardView=fragmentHomeBinding.interestrecievedcard;
       likeimg=fragmentHomeBinding.likeimg;

       matchcard=fragmentHomeBinding.matchcard;
       matchimg=fragmentHomeBinding.matchimg;

       chatCard=fragmentHomeBinding.chatcard;
       chatimg =fragmentHomeBinding.chatimg;
    }
}


