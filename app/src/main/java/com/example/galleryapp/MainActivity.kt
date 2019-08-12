package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create array of images, size of 10
        val size = 10
        val default = -1

        val imageViewsArray = Array(size) {
            default
        }

        imageViewsArray[0] = R.drawable.adventure_automobile_classic_2533092
        imageViewsArray[1] = R.drawable.aerial_photography_aerial_shot_aerial_view_2583847
        imageViewsArray[2] = R.drawable.alley_architecture_buildings_2526517
        imageViewsArray[3] = R.drawable.architectural_design_architecture_bridge_2540653
        imageViewsArray[4] = R.drawable.beautiful_breathtaking_canada_day_2526105
        imageViewsArray[5] = R.drawable.bloom_blossom_flora_2567011
        imageViewsArray[6] = R.drawable.close_up_colorful_colors_2529148
        imageViewsArray[7] = R.drawable.clouds_coconut_trees_daylight_2486168
        imageViewsArray[8] = R.drawable.colorful_colourful_houses_2501965
        imageViewsArray[9] = R.drawable.wallpaper_astronomy_astrophotography_2538107

        //apply style

        left_child_image.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        left_child_image.setPadding(5, 5, 5, 5)
        left_child_image.adjustViewBounds = true
        right_child_image.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        right_child_image.setPadding(5, 5, 5, 5)
        right_child_image.adjustViewBounds = true

        //Create an indexed forEach loop to step through the Views array
    }
}