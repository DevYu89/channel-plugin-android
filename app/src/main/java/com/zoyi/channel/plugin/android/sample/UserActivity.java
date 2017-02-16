package com.zoyi.channel.plugin.android.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.zoyi.channel.plugin.android.ChannelPlugin;

/**
 * Created by mika on 2017. 2. 16..
 */
public class UserActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_user);
  }

  @Override
  protected void onDestroy() {
    ChannelPlugin.checkOut();
    Toast.makeText(this, "Check out (user)", Toast.LENGTH_SHORT).show();
    super.onDestroy();
  }
}