package com.layer.atlas.messenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author Oleg Orlov
 * @since 17 Apr 2015
 */
public class AtlasSettingsScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final App101 app = (App101) getApplication();
        
        setContentView(R.layout.atlas_screen_settings);
        
        TextView logout = (TextView) findViewById(R.id.atlas_screen_settings_logout);
        logout.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                app.getLayerClient().deauthenticate();
                finish();
            }
        });
        
        prepareActionBar();
    }

    private void prepareActionBar() {
        ImageView menuBtn = (ImageView) findViewById(R.id.atlas_actionbar_left_btn);
        menuBtn.setImageResource(R.drawable.atlas_ctl_btn_back);
        menuBtn.setVisibility(View.VISIBLE);
        menuBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
