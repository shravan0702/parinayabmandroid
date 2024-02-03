package com.parinayabandham.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.parinayabandham.R;
import com.parinayabandham.Responses.Responsebanners;
import com.parinayabandham.dashboard.HomeFragment;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BannerAdapter extends PagerAdapter {
    private List<Responsebanners.BannersDatum> bannersData;
    private Context context;

    public BannerAdapter(Context context, List<Responsebanners.BannersDatum> bannersData) {
        this.context = context;
        this.bannersData = bannersData;
    }

    public BannerAdapter(Context context, Picasso picasso, List<Responsebanners.BannersDatum> bannerLi) {
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.banner_item, container, false);

        ImageView imageView = view.findViewById(R.id.img_banner);
        // Assuming your BannersDatum class has a method to get the attachment URL
        String imageUrl = bannersData.get(position).getAttachment();

        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }

        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.placeholder_image) // Placeholder image resource
                .error(R.drawable.error_image) // Error image resource
                .into(imageView);

        Picasso.get()
                .load(imageUrl)
                .fit()
                .centerCrop()
                .into(imageView);


        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return (bannersData != null) ? bannersData.size() : 0;
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }
}



