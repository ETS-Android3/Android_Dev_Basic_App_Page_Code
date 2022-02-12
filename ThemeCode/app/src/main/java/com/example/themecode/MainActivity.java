package com.example.themecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context =  getApplicationContext();

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.scroll);

        // Scrollview will contain a LinearLayout, which will contain content
        ScrollView scroll = new ScrollView(context);
        scroll.setBackgroundColor(Color.parseColor("#072227"));

        // Create the linear layout, which will hold image and text content (ImageView and TextView objects)
        LinearLayout linear = new LinearLayout(context);
        //this line is very IMPORTANT as it sets the layout to vertical.
        linear.setOrientation(LinearLayout.VERTICAL);
        //linear.setGravity(Gravity.CENTER);
        //content goes here.

        //1. Setting the Title - SPRING 2022
        TextView title = new TextView(getApplicationContext());

        LinearLayout.LayoutParams titlelp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        titlelp.setMargins(0,20,0,0);


        /*THIS CODE IS MEANT TO CHANGE THE FONT BUT WHEN ADDED PREVENT THE SIMULATOR FROM RUNNING
        Typeface face = Typeface.createFromAsset(getAssets(),
                "font/academic_font.ttf");
        title.setTypeface(face);

         */




        title.setGravity(Gravity.CENTER);
        title.setLayoutParams(titlelp);
        title.setText("SPRING 2022");

        title.setTextColor(Color.parseColor("#24A19C"));
        title.setTextSize(60);

        linear.addView(title);

        //2. Setting the quote
        TextView quote = new TextView(getApplicationContext());

        LinearLayout.LayoutParams quotelp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        quotelp.setMargins(0,15,0,0);

        quote.setLayoutParams(quotelp);
        quote.setGravity(Gravity.CENTER);
        quote.setText("Who's going to carry the boats and the logs? \n- David Goggins");

        quote.setTextColor(Color.parseColor("#D3DEDC"));
        quote.setTextSize(18);

        linear.addView(quote);

        //3. Setting My Courses Text
        TextView my_courses = new TextView(getApplicationContext());

        LinearLayout.LayoutParams my_courses_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        my_courses_lp.setMargins(15,10,0,0);

        my_courses.setLayoutParams(my_courses_lp);

        my_courses.setText("My Courses");

        my_courses.setTextColor(Color.parseColor("#FFC900"));
        my_courses.setTextSize(25);

        linear.addView(my_courses);

        //4. CSC 317
        TextView csc_317 = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_317_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_317_lp.setMargins(0,10,0,7);

        csc_317.setLayoutParams(csc_317_lp);
        csc_317.setGravity(Gravity.CENTER);
        csc_317.setText("CSC 317 - Mobile Application Programming");
        csc_317.setTextColor(Color.parseColor("#4FBDBA"));
        csc_317.setTextSize(22);

        linear.addView(csc_317);

        //5. CSC 317 Image to be added here.
        ImageView csc_317_logo = new ImageView(this);

        //csc_317_logo.setLayoutParams(new LinearLayout.LayoutParams(750, 550));

        csc_317_logo.setAdjustViewBounds(true);

        //parameters for the image - csc 317 logo
        LinearLayout.LayoutParams csc_317_logo_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_317_logo_lp.setMargins(30,10,30,10);
        //the line below is very important as it applies the parameters to the image.
        csc_317_logo.setLayoutParams(csc_317_logo_lp);


        csc_317_logo.setImageResource(R.drawable.csc_317_logo);
        linear.addView(csc_317_logo);

        //6. CSC 317 Info here.
        TextView csc_317_info = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_317_info_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_317_info_lp.setMargins(20,10,0,0);

        csc_317_info.setLayoutParams(csc_317_info_lp);
        //csc_317_info.setGravity(Gravity.CENTER);
        csc_317_info.setText("Class Days and Times: Monday, Wednesday - 9:30AM - 10:45AM \nLocation: Engineering, Rm 318");
        csc_317_info.setTextColor(Color.parseColor("#AEFEFF"));

        linear.addView(csc_317_info);

        //7. CSC 352
        TextView csc_352 = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_352_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_352_lp.setMargins(0,10,0,7);

        csc_352.setLayoutParams(csc_352_lp);
        csc_352.setGravity(Gravity.CENTER);
        csc_352.setText("CSC 352 - System Programming and Unix");
        csc_352.setTextColor(Color.parseColor("#4FBDBA"));
        csc_352.setTextSize(22);

        linear.addView(csc_352);

        //8. CSC 352 Image to be added here.
        ImageView csc_352_logo = new ImageView(this);

        //LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 200);
        csc_352_logo.setAdjustViewBounds(true);

        //parameters for the image - csc 352 logo
        LinearLayout.LayoutParams csc_352_logo_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_352_logo_lp.setMargins(30,10,30,10);
        //the line below is very important as it applies the parameters to the image.
        csc_352_logo.setLayoutParams(csc_352_logo_lp);


        csc_352_logo.setImageResource(R.drawable.csc_352_logo);
        linear.addView(csc_352_logo);

        //9. CSC 352 Info to be added here.
        TextView csc_352_info = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_352_info_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_352_info_lp.setMargins(20,10,0,0);

        csc_352_info.setLayoutParams(csc_352_info_lp);
        //csc_352_info.setGravity(Gravity.CENTER);
        csc_352_info.setText("Class Days and Times: Monday, Wednesday - 2:00PM - 3:15PM \nLocation: M Pacheco ILC, Rm 130");
        csc_352_info.setTextColor(Color.parseColor("#AEFEFF"));
        linear.addView(csc_352_info);

        //10. CSC 343
        TextView csc_343 = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_343_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_343_lp.setMargins(0,10,0,7);

        csc_343.setLayoutParams(csc_343_lp);
        csc_343.setGravity(Gravity.CENTER);
        csc_343.setText("CSC 343 - Human Computer Interaction");
        csc_343.setTextColor(Color.parseColor("#4FBDBA"));
        csc_343.setTextSize(22);

        linear.addView(csc_343);

        //11. CSC 343 Image goes here.
        ImageView csc_343_logo = new ImageView(this);

        //LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 200);
        csc_343_logo.setAdjustViewBounds(true);

        //parameters for the image - csc 343 logo
        LinearLayout.LayoutParams csc_343_logo_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_343_logo_lp.setMargins(30,10,30,10);
        //the line below is very important as it applies the parameters to the image.
        csc_343_logo.setLayoutParams(csc_343_logo_lp);

        //csc_352_logo.setLayoutParams(lp);
        csc_343_logo.setImageResource(R.drawable.csc_343_logo);
        linear.addView(csc_343_logo);

        //12. CSC 343 Info to be added here.
        TextView csc_343_info = new TextView(getApplicationContext());

        LinearLayout.LayoutParams csc_343_info_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        csc_343_info_lp.setMargins(20,10,0,0);

        csc_343_info.setLayoutParams(csc_343_info_lp);
        //csc_343_info.setGravity(Gravity.CENTER);
        csc_343_info.setText("Class Days and Times: Tuesday, Thursday - 9:30AM - 10:45AM \nLocation: M Pacheco ILC, Rm 125");
        csc_343_info.setTextColor(Color.parseColor("#AEFEFF"));
        linear.addView(csc_343_info);

        //13. GEOS 251
        TextView geos_251 = new TextView(getApplicationContext());

        LinearLayout.LayoutParams geos_251_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        geos_251_lp.setMargins(0,10,0,7);

        geos_251.setLayoutParams(geos_251_lp);
        geos_251.setGravity(Gravity.CENTER);
        geos_251.setText("GEOS 251 - Physical Geology");
        geos_251.setTextColor(Color.parseColor("#4FBDBA"));
        geos_251.setTextSize(22);

        linear.addView(geos_251);

        //14. GEOS 251 Image goes here
        ImageView geos_251_logo = new ImageView(this);

        //LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(200, 200);
        geos_251_logo.setAdjustViewBounds(true);

        //parameters for the image - geos 251 logo
        LinearLayout.LayoutParams geos_251_logo_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        geos_251_logo_lp.setMargins(30,10,30,10);
        //the line below is very important as it applies the parameters to the image.
        geos_251_logo.setLayoutParams(geos_251_logo_lp);

        //geos_251_logo.setLayoutParams(lp);
        geos_251_logo.setImageResource(R.drawable.geos_251_logo);
        linear.addView(geos_251_logo);

        //15. GEOS 251 info goes here.
        TextView geos_251_info = new TextView(getApplicationContext());

        LinearLayout.LayoutParams geos_251_info_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        geos_251_info_lp.setMargins(20,10,0,0);

        geos_251_info.setLayoutParams(geos_251_info_lp);
        //geos_251_info.setGravity(Gravity.CENTER);
        geos_251_info.setText("Class Days and Times: Tuesday, Thursday - 11:00AM - 12:15PM \nLocation: Gallagher Theatre");
        geos_251_info.setTextColor(Color.parseColor("#AEFEFF"));
        linear.addView(geos_251_info);

        //16. RELI 367
        TextView reli_367 = new TextView(getApplicationContext());

        LinearLayout.LayoutParams reli_367_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        reli_367_lp.setMargins(0,10,0,7);

        reli_367.setLayoutParams(reli_367_lp);
        reli_367.setGravity(Gravity.CENTER);
        reli_367.setText("RELI 367 - YOGA ");
        reli_367.setTextColor(Color.parseColor("#4FBDBA"));
        reli_367.setTextSize(22);

        linear.addView(reli_367);

        //17. RELI 367 Image goes here.
        ImageView reli_367_logo = new ImageView(this);

        reli_367_logo.setAdjustViewBounds(true);

        //parameters for the image - geos 251 logo
        LinearLayout.LayoutParams yoga_logo_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        yoga_logo_lp.setMargins(30,10,30,10);
        //the line below is very important as it applies the parameters to the image.
        reli_367_logo.setLayoutParams(yoga_logo_lp);

        reli_367_logo.setImageResource(R.drawable.yoga_logo);
        linear.addView(reli_367_logo);

        //18. RELI 367 Info goes here.
        TextView reli_367_info = new TextView(getApplicationContext());

        LinearLayout.LayoutParams reli_367_info_lp = new
                LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        reli_367_info_lp.setMargins(20,10,0,30);

        reli_367_info.setLayoutParams(reli_367_info_lp);
        //reli_367_info.setGravity(Gravity.CENTER);
        reli_367_info.setText("Class Days and Times: 7 Week \nLocation: Online");
        reli_367_info.setTextColor(Color.parseColor("#AEFEFF"));
        linear.addView(reli_367_info);

        //ALL ELEMENTS FINISHED HERE ---- ONLY ENDING TAGS BELOW THIS.

        scroll.addView(linear);
        setContentView(scroll);


    }
}