package com.example.registermaterial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.style.ImageSpan;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class imageSlider extends AppCompatActivity {

    ViewFlipper vF;
    private int[] mimageIds=new int[]{R.drawable.a1,R.drawable.a2,R.drawable.a3};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);

        ViewPager vp =  (ViewPager)findViewById(R.id.slider);
        vF=(ViewFlipper)findViewById(R.id.slider2);

        imageAdapter iA=new imageAdapter(this);
        vp.setAdapter(iA);


        for (int images:mimageIds)
        {
            flipperImages(images);
        }
    }

    public void flipperImages(int images){
        ImageView iV=new ImageView(this);
        iV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iV.setBackgroundResource(images);

        vF.addView(iV);
        vF.setFlipInterval(1000);
        vF.setAutoStart(true);
        vF.setInAnimation(this,android.R.anim.fade_in) ;
        vF.setOutAnimation(this,android.R.anim.fade_out) ;
    }
}
