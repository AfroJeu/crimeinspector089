package com.investigator089.maxprisonevidencegooglecrime.views;

import android.os.Handler;
import android.widget.ImageView;

import com.investigator089.maxprisonevidencegooglecrime.R;

public class SubliminalImagery {   // GNU
    ImageView mImageView;
    int mPosition = 0;
    Handler mHandler = new Handler();
    boolean mSubliminalImage = true;
    public SubliminalImagery(ImageView iv) {
        this.mImageView = iv;
        init();
    }
    void init() {
        start();
    }

    public void start() {
        mPosition = (mPosition + 1) % mResIDs.length;
        if (mSubliminalImage && mPosition == 5) {
            mSubliminalImage = false;
            mHandler.postDelayed(r, SUBLIMINAL_DURATION);
        } else {
            mHandler.postDelayed(r, 3000);
        }
    }

    public void stop() {
        mHandler.removeCallbacks(r);
    }

    Runnable r = new Runnable() {
        @Override
        public void run() {
            if (mSubliminalImage && mPosition == 4) {
                mImageView.setImageResource(R.drawable.homosexuals);
            } else {
                mImageView.setImageResource(mResIDs[mPosition]);
            }
            start();
        }
    };

    static int[] mResIDs = {
            R.drawable.scene_1,
            R.drawable.scene_2,
            R.drawable.lax,
            R.drawable.needy,
            R.drawable.scene_3,
            R.drawable.free_lunch,
            R.drawable.primetime,
    };
    static int SUBLIMINAL_DURATION = 14781;
}