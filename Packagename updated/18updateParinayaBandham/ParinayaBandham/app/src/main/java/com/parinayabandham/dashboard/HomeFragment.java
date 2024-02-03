package com.parinayabandham.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.parinayabandham.R;
import com.parinayabandham.Responses.DailyRecommendation;
import com.parinayabandham.Responses.Reqbanners;
import com.parinayabandham.Responses.Responsebanners;
import com.parinayabandham.adapters.BannerAdapter;
import com.parinayabandham.adapters.DailyAdapter;

import com.parinayabandham.databinding.FragmentHomeBinding;
import com.parinayabandham.match.MatchActivity;
import com.parinayabandham.network.ApiController;
import com.parinayabandham.network.ApiService;
import com.parinayabandham.utility.SharedPrefs;
import com.squareup.picasso.Picasso;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding fragmentHomeBinding;

    private View rootView;
    private ViewPager viewPager;
    private CardView interstCardView, chatCard, matchcard,Topmatch,OFFERS,ASTROLOGER;
    private ImageView matchimg, likeimg, chatimg,Topmatchimage,OFFERSimage,ASTROLOGERimage;
    private TextView username,TextView1,TextView2,TextView3,Matchstext,Receivedtext,Senttext,Daily,seeall,stories,seeall2;
    private Context context;
    private RecyclerView DailyRecyclerView;
    private ShapeableImageView profileImageView;

    int currentPage = 0;


    private BannerAdapter bannersPagerAdapter;
    private List<Responsebanners.BannersDatum> bannersData = new ArrayList<>();
    private final List<Responsebanners.UserDetails> userDetails = new ArrayList<>();
    private final List<DailyRecommendation.MatchingProfile> matchingProfiles = new ArrayList<>();


    SharedPrefs sharedPrefs = SharedPrefs.getInstance(getContext());

    String profileid = sharedPrefs.getString("id");


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = requireContext();
        sharedPrefs = SharedPrefs.getInstance(context);
        Log.d("ProfileID", "Profile ID from shared preferences: " + profileid);
        Log.d("getting", "User ID in Fragment: " + profileid);
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        rootView = fragmentHomeBinding.getRoot();
        viewPager = rootView.findViewById(R.id.banners);
        username = rootView.findViewById(R.id.username);
        Matchstext = rootView.findViewById(R.id.Matchstext);
        Receivedtext = rootView.findViewById(R.id.Receivedtext);
        Senttext = rootView.findViewById(R.id.Senttext);
        Topmatchimage = rootView.findViewById(R.id.Topmatchimage);
        OFFERSimage = rootView.findViewById(R.id.OFFERSimage);
        ASTROLOGERimage = rootView.findViewById(R.id.ASTROLOGERimage);
        Daily = rootView.findViewById(R.id.Daily);
        DailyRecyclerView = rootView.findViewById(R.id.DailyRecyclerView);
        if (rootView != null) {
            seeall = rootView.findViewById(R.id.seeall);
        }
        stories = rootView.findViewById(R.id.stories);
        setupRecyclerView();
        setUiViews();
        getBannersApi(profileid);
        getMatchingProfile();
        return rootView;
    }

    private void setupRecyclerView() {
        // Create and set up your adapter
        DailyAdapter dailyAdapter = new DailyAdapter(matchingProfiles, requireContext());
        DailyRecyclerView.setAdapter(dailyAdapter);

        seeall = rootView.findViewById(R.id.seeall);

        seeall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the method in HomeActivity to handle the click event
                goToMatchActivity();
            }
        });


    }




    private void setUiViews() {
        viewPager = fragmentHomeBinding.banners;
        bannersPagerAdapter = new BannerAdapter(requireContext(), bannersData);
        viewPager.setAdapter(bannersPagerAdapter);


        // Connect DotsIndicator with ViewPager
        DotsIndicator dotsIndicator = fragmentHomeBinding.dotsIndicator;
        dotsIndicator.setViewPager(viewPager);

        // Optional: If you want to listen to page changes and perform additional actions
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // This method is called when the pager is scrolled, but we don't need it for the dots.
            }

            @Override
            public void onPageSelected(int position) {
                // This method is called when a new page becomes selected.
//                dotsIndicator.setCurrentItem(position); // Update the DotsIndicator
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // This method is called when the scroll state changes.
            }
        });

        viewPager.setPageMargin(20);
        username = fragmentHomeBinding.username;
        profileImageView = fragmentHomeBinding.profileImageView;
        likeimg = fragmentHomeBinding.likeimg;
        matchimg = fragmentHomeBinding.matchimg;
        Matchstext = fragmentHomeBinding.Matchstext;
        Receivedtext = fragmentHomeBinding.Receivedtext;
        Senttext = fragmentHomeBinding.Senttext;
        Topmatchimage = fragmentHomeBinding.Topmatchimage;
        OFFERSimage = fragmentHomeBinding.OFFERSimage;
        ASTROLOGERimage = fragmentHomeBinding.ASTROLOGERimage;
        Daily = fragmentHomeBinding.Daily;
        DailyRecyclerView = fragmentHomeBinding.DailyRecyclerView;
        seeall = fragmentHomeBinding.seeall;
        stories = fragmentHomeBinding.stories;

    }


    private void setBannerImages(List<Responsebanners.BannersDatum> bannerLi) {
        bannersPagerAdapter = new BannerAdapter(requireContext(), Picasso.get(), bannerLi);
        viewPager.setAdapter(bannersPagerAdapter);
        viewPager.setPageMargin(20);
        int NUM_PAGES = bannerLi.size();
        if (NUM_PAGES == 0)
            return;
        currentPage = 0;

        // After setting the adapter use the timer
        Handler handler = new Handler();
        final Runnable update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;

                }
                viewPager.setCurrentItem(currentPage++, true);
            }
        };


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        }, 500, 6000); // Delay 500ms, Repeat every 3000ms
        // Set username in the TextView


        }


    private void goToMatchActivity() {
        Intent matchIntent = new Intent(getContext(), MatchActivity.class);
        startActivity(matchIntent);
    }

    public void getBannersApi(String profileId) {
        Log.d("API", "Requesting banners data for profileId: " + profileId);

        // Log the profileId before making the API call
        Log.d("API", "Sending API request with profileId: " + profileId);

        ApiService service = ApiController.getInstance().getMyApi();
        Reqbanners reqbanners = new Reqbanners(profileId); // You may need to set appropriate values in reqbanners

        Call<Responsebanners> call = service.getBanners(reqbanners);
        call.enqueue(new Callback<Responsebanners>() {
            @Override
            public void onResponse(Call<Responsebanners> call, Response<Responsebanners> response) {
                Log.d("Response", "API Response: " + new Gson().toJson(response.body()));
                if (response.isSuccessful()) {
                    Responsebanners respobj = response.body();
                    bannersData = respobj.getBannersData();
                    Log.d("Response", "API Response: " + bannersData);
                    setBannerImages(bannersData);

                    // Retrieve counts from Responsebanners
                    String matchingProfilesCount = respobj.getMatchingProfilesCount();
                    Matchstext.setText(matchingProfilesCount);
                    String profileIntrestRecivedCount = respobj.getProfileIntrestRecivedCount();
                    Receivedtext.setText(profileIntrestRecivedCount);
                    String profileIntresteSentCount = respobj.getProfileIntresteSentCount();
                    Senttext.setText(profileIntresteSentCount );

                    // Log counts
                    Log.d("Counts", "Matching Profiles Count: " + matchingProfilesCount);
                    Log.d("Counts", "Profile Interest Received Count: " + profileIntrestRecivedCount);
                    Log.d("Counts", "Profile Interest Sent Count: " + profileIntresteSentCount);

                    // Assuming you have an instance of Responsebanners named responseBanners
                    Responsebanners.UserDetails userDetails = respobj.getUserDetails();

                    if (userDetails != null) {
                        String name = userDetails.getName();
                        // Now you can use the 'name' variable as needed
                        Log.d("UserDetails", "User name: " + name);
                        String userName = "Hello, " + name; // Assuming you want the name of the first user
                        username.setText(userName);
                        String profileImages = userDetails.getProfileimages();
                        Log.d("UserDetails", "Profile Images: " + profileImages);

                        ShapeableImageView profileImageView = getView().findViewById(R.id.profileImageView);

                        ShapeAppearanceModel shapeAppearanceModel = profileImageView.getShapeAppearanceModel()
                                .toBuilder()
                                .setAllCorners(CornerFamily.ROUNDED, 50) // Adjust the radius as needed
                                .build();

// Apply the circular shape appearance model to the ShapeableImageView
                        profileImageView.setShapeAppearanceModel(shapeAppearanceModel);

                        if (profileImages != null && !profileImages.isEmpty()) {
                            Glide.with(requireContext()).load(profileImages).into(profileImageView);
                        } else {
                            profileImageView.setImageResource(R.drawable.default_profile_image);
                        }
                    } else {
                        Log.d("UserDetails", "UserDetails is null");
                    }
                } else {
                    Log.d("Response", "Unsuccessful response");
                }
            }

            @Override
            public void onFailure(Call<Responsebanners> call, Throwable t) {
                Log.e("API Failure", "Failed to get banners data: " + t.getMessage());

            }
        });
    }

   public  void getMatchingProfile() {
       JsonObject jsonObject = new JsonObject();
       jsonObject.addProperty("profile_id", SharedPrefs.getInstance(getContext()).getString("id"));
       ApiService service = ApiController.getInstance().getMyApi();
       Call<DailyRecommendation> apicall= service.getmatchingprofile(jsonObject);

       apicall.enqueue(new Callback<DailyRecommendation>() {

           @Override
           public void onResponse(Call<DailyRecommendation> call, Response<DailyRecommendation> response) {
               if (getView() != null) {
                   RecyclerView dailyRecyclerView = getView().findViewById(R.id.DailyRecyclerView);

                   if (response.isSuccessful()) {
                       DailyRecommendation dailyRecommendation = response.body();

                       if (dailyRecommendation != null) {
                           List<DailyRecommendation.MatchingProfile> matchingProfiles = dailyRecommendation.getMatchingProfiles();

                           if (matchingProfiles != null && !matchingProfiles.isEmpty()) {
                               DailyAdapter dailyAdapter = new DailyAdapter(matchingProfiles, getContext());

                               // Set the adapter to your RecyclerView
                               dailyRecyclerView.setAdapter(dailyAdapter);
                               for (DailyRecommendation.MatchingProfile profile : matchingProfiles) {
                                   String name = profile.getName();
                                   String education = profile.getEducation();
                                   String age = profile.getAge();
                                   String profileimages = String.valueOf(profile.getprofileimages());

                                   Log.d("MatchingProfile", "Name: " + name);
                                   Log.d("MatchingProfile", "Education: " + education);
                                   Log.d("MatchingProfile", "Age: " + age);
                                   Log.d("MatchingProfile", "profileimages: " + profileimages);
                               }
                           }
                       }
                   } else {
                       Log.d("Response", "Unsuccessful response");
                   }
               }
           }





           @Override
           public void onFailure(Call<DailyRecommendation> call, Throwable t) {

           }
       });
   }


}




