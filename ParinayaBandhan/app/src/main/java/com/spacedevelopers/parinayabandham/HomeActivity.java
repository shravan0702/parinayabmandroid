package com.spacedevelopers.parinayabandham;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.spacedevelopers.parinayabandhan.R;

public class HomeActivity extends AppCompatActivity {

BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
bottomNavigationView=findViewById(R.id.nav_view);
        MenuItem matchitem = bottomNavigationView.getMenu().findItem(R.id.navigation_match);
        if(matchitem != null){
            Drawable backgroundDrawable = createCurveBackground();
 matchitem.setIcon(backgroundDrawable);

        }

    }
    private Drawable createCurveBackground(){

float[] outerRadii = new float[] {0, 0, 0, 0, 20, 20, 20, 20};

        RoundRectShape roundRectShape = new RoundRectShape(outerRadii, null, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
        return new LayerDrawable(new Drawable[]{shapeDrawable});
    }
}