package com.example.materialdesigndemo.activity.translucent;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.materialdesigndemo.R;
import com.example.materialdesigndemo.activity.base.BaseActivity;
import com.example.materialdesigndemo.fragment.ColorTranslucentFragment;

public class ColorTranslucentBarActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_translucent_bar);

        findViewById(R.id.btn_show_toast).setOnClickListener(this);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container ,new ColorTranslucentFragment());
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.btn_show_toast) {//不要在theme中设置<item name="android:fitsSystemWindows">true</item>
            Toast.makeText(this, "Toast", Toast.LENGTH_LONG).show();
        }
    }
}
