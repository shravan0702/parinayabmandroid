package com.parinayabandham.match;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.parinayabandham.R;
import com.parinayabandham.databinding.SwipeableBinding;
import com.squareup.picasso.Picasso;

public class MatchActivity extends AppCompatActivity {
    private SwipeableBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        // Use data binding to set content view
        binding = SwipeableBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        if (intent != null) {
            String profileName = intent.getStringExtra("PROFILE_NAME");
            String profileImagesUrl = intent.getStringExtra("PROFILE_IMAGES");

            // Set profileName to the TextView
            binding.textView.setText(profileName);

            // Load profileimages using Picasso
            Picasso.get().load(profileImagesUrl).into(binding.images);
        }
    }
}