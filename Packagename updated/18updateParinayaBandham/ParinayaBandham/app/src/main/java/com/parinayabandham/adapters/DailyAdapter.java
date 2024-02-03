package com.parinayabandham.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.parinayabandham.R;
import com.parinayabandham.Responses.DailyRecommendation;

import com.parinayabandham.match.MatchActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ViewHolder> {

    private static List<DailyRecommendation.MatchingProfile> matchingProfiles;
    private final Context context;
    private boolean showAllProfiles;

    public DailyAdapter(List<DailyRecommendation.MatchingProfile> matchingProfiles, Context context) {
        DailyAdapter.matchingProfiles = matchingProfiles;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.daily, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DailyRecommendation.MatchingProfile profile = matchingProfiles.get(position);

        // Set data to views
        holder.nameTextView.setText(profile.getName());
        holder.educationTextView.setText(profile.getEducation());
        holder.ageTextView.setText(profile.getAge());

        // Load image using Picasso or another image loading library
        Object attachment2Object = profile.getAttachment2();
        if (attachment2Object instanceof String) {
            String profileimages = (String) attachment2Object;
            if (!profileimages.isEmpty()) {
                Picasso.get().load(profileimages).into(holder.attachment2ImageView);
            } else {
                // Use a default image if attachment2 is an empty string
                Picasso.get().load(R.drawable.defultnew ).into(holder.attachment2ImageView);
            }
        } else {
            // Use a default image if attachment2 is not a string
            Picasso.get().load(R.drawable.defultnew).into(holder.attachment2ImageView);
        }

        String profileImagesUrl = String.valueOf(profile.getprofileimages());
        Picasso.get().load(profileImagesUrl).into(holder.attachment2ImageView);



    }

    @Override
    public int getItemCount() {
        if (showAllProfiles) {
            return matchingProfiles.size();
        } else {
            return Math.min(matchingProfiles.size(), 3);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Define your views here
        TextView nameTextView;
        TextView educationTextView;
        TextView ageTextView;
        ImageView attachment2ImageView;

        CardView cardView; // Add CardView

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize your views here
            nameTextView = itemView.findViewById(R.id.textView);
            educationTextView = itemView.findViewById(R.id.educational_qualifications);
            ageTextView = itemView.findViewById(R.id.Age);
            attachment2ImageView = itemView.findViewById(R.id.images);
            cardView = itemView.findViewById(R.id.trendingcardview);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Handle CardView click event here
                    // Navigate to MatchActivity
                    Context context = itemView.getContext();
                    Intent matchIntent = new Intent(context, MatchActivity.class);

                    // Get the profile at the clicked position
                    DailyRecommendation.MatchingProfile clickedProfile = matchingProfiles.get(getAdapterPosition());

                    // Extract profileName and profileimages
                    String profileName = clickedProfile.getName();
                    String profileimages = String.valueOf(clickedProfile.getprofileimages());

                    // Add data to the intent
                    matchIntent.putExtra("PROFILE_NAME", profileName);
                    matchIntent.putExtra("PROFILE_IMAGES", profileimages);

                    // Start MatchActivity with the intent
                    context.startActivity(matchIntent);

                    // Log information
                    Log.d("CardViewClick", "Profile Name: " + profileName);
                    Log.d("CardViewClick", "Profile Images: " + profileimages);
                    Log.d("CardViewClick", "CardView clicked for profile: " + nameTextView.getText().toString());
                }
            });


        }
    }

}



