package com.parinayabandham.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.parinayabandham.R;
import com.parinayabandham.Responses.DailyRecommendation;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SwipeableAdapter extends RecyclerView.Adapter<SwipeableAdapter.ViewHolder> {
    private final List<DailyRecommendation.MatchingProfile> matchingProfiles; // Replace YourDataModel with the actual data model class
    private final Context context;
    public SwipeableAdapter(List<DailyRecommendation.MatchingProfile> matchingProfiles, Context context) {
        this.matchingProfiles = matchingProfiles;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.swipeable, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DailyRecommendation.MatchingProfile profile = matchingProfiles.get(position);

        // Set data to views
        holder.nameTextView.setText(profile.getName());
        // Set other data accordingly

        // Load image using Picasso or another image loading library
        // For example, if you're using Picasso:
        Picasso.get().load(R.drawable.defultnew ).into(holder.attachment2ImageView);
    }

    @Override
    public int getItemCount() {
        return matchingProfiles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView attachment2ImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textView);
            attachment2ImageView = itemView.findViewById(R.id.images);
        }
    }
}

