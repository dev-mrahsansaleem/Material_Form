package com.example.registermaterial;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class imageAdapter extends PagerAdapter {
    private Context context;
    private int[] mimageIds=new int[]{R.drawable.a1,R.drawable.a2,R.drawable.a3};

    imageAdapter(Context c){
        context=c;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView iV =new ImageView(context);
        iV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iV.setImageResource(mimageIds[position]);
        container.addView(iV,0);
        return iV;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return mimageIds.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }
}
