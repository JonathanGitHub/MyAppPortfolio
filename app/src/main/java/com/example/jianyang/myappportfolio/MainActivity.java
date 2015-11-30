package com.example.jianyang.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSpotifyStreamerBtn;
    private Button mScoresAppBtn;
    private Button mLibraryAppBtn;
    private Button mBuildItBiggerBtn;
    private Button mBaconReaderAppBtn;
    private Button mMyCapstoneOwnAppBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mSpotifyStreamerBtn = (Button) findViewById(R.id.button_spotify_streamer);
        mScoresAppBtn = (Button) findViewById(R.id.button_scores_app);
        mLibraryAppBtn = (Button) findViewById(R.id.button_library_app);
        mBuildItBiggerBtn = (Button) findViewById(R.id.button_build_it_bigger);
        mBaconReaderAppBtn = (Button) findViewById(R.id.button_bacon_reader);
        mMyCapstoneOwnAppBtn = (Button) findViewById(R.id.button_capstone_my_own_app);

        mSpotifyStreamerBtn.setOnClickListener(new ButtonClickListener());
        mScoresAppBtn.setOnClickListener(new ButtonClickListener());
        mLibraryAppBtn.setOnClickListener(new ButtonClickListener());
        mBuildItBiggerBtn.setOnClickListener(new ButtonClickListener());
        mBaconReaderAppBtn.setOnClickListener(new ButtonClickListener());
        mMyCapstoneOwnAppBtn.setOnClickListener(new ButtonClickListener());


    }

    class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Button button = (Button)view;
            String buttonText = button.getText().toString();
            Toast.makeText(getApplicationContext(), "This button will launch " + buttonText + "!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
