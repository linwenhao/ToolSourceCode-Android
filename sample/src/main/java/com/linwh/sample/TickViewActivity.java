package com.linwh.sample;


import android.os.Bundle;
import android.view.View;


import com.linwh.helper.activity.BaseActivity;
import com.linwh.helper.view.tickview.OnCheckedChangeListener;
import com.linwh.helper.view.tickview.TickAnimatorListener;
import com.linwh.helper.view.tickview.TickView;


public class TickViewActivity extends BaseActivity {

    private static final String TAG = TickViewActivity.class.getSimpleName();

    TickView tickView;
    TickView tickViewAccent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickview);
        tickView = (TickView) findViewById(R.id.tick_view);
        tickView.getConfig().setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(TickView tickView, boolean isCheck) {

            }
        }).setTickAnimatorListener(new TickAnimatorListener() {
            @Override
            public void onAnimationStart(TickView tickView) {

            }

            @Override
            public void onAnimationEnd(TickView tickView) {

            }
        });
        tickViewAccent = (TickView) findViewById(R.id.tick_view_accent);
        findViewById(R.id.check_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tickView.setChecked(true);
                tickViewAccent.setChecked(true);
            }
        });
        findViewById(R.id.uncheck_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tickView.setChecked(false);
                tickViewAccent.setChecked(false);
            }
        });
    }
}
