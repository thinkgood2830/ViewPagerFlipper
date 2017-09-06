package com.thinkgood.viewpagerflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thinkgood.imageflipper.FlipperLayout;
import com.thinkgood.imageflipper.FlipperView;

public class MainActivity extends AppCompatActivity {

    private FlipperLayout flipperLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipperLayout = (FlipperLayout) findViewById(R.id.flipper_layout);
        addBannerImage();
    }

    private void addBannerImage() {
        String url[] = new String[]{"http://shopcart2830.freeiz.com/shopcartuser/images/bannerImages/banner.png",
                "http://shopcart2830.freeiz.com/shopcartuser/images/bannerImages/banner1.png",
                "http://shopcart2830.freeiz.com/shopcartuser/images/bannerImages/banner2.png"};
        for (int i = 0; i < 3; i++) {
            FlipperView view = new FlipperView(getBaseContext());
            view.setImageUrl(url[i])
                    .setDescription("Banner" + (i + 1));
            flipperLayout.addFlipperView(view);
            view.setOnFlipperClickListener(new FlipperView.OnFlipperClickListener() {
                @Override
                public void onFlipperClick(FlipperView flipperView) {
                }
            });
        }
    }
}
