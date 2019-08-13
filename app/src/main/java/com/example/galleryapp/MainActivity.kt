package com.example.galleryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create array of images, size of 10
        val size = 10

        val imageViewsArray = MutableList(size){ ImageView(this) }
        imageViewsArray[0].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[1].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[2].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[3].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[4].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[5].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[6].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[7].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[8].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))
        imageViewsArray[9].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693))

        //set up layout params
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        //Create an indexed forEach loop to step through the Views array
        imageViewsArray.forEachIndexed { index, i -> i.layoutParams = layoutParams
        i.setPadding(5, 5, 5, 5)
        i.adjustViewBounds = true
        if (index % 2 == 1) {
        right_child_image.addView(imageViewsArray)}
       }

    }
}