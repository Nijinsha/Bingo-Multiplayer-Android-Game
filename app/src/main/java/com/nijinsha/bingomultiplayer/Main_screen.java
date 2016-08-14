package com.nijinsha.bingomultiplayer;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_screen extends AppCompatActivity {
    Button play;
    Button aboutus;
    Button Settings;
    MediaPlayer buttonsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        play=(Button) findViewById(R.id.playv);
        Settings=(Button)findViewById(R.id.settingsv);
        buttonsound = MediaPlayer.create(this, R.raw.button);
        buttonsound.setAudioStreamType(AudioManager.STREAM_MUSIC);

        Settings.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();

                        Intent i = new Intent(Main_screen.this,settings_page.class);
                        startActivity(i);
                    }
                }
        );
        play.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();
                        Intent play = new Intent(Main_screen.this,Host_Act.class);
                        startActivity(play);

                    }
                }
        );
        aboutus= (Button)findViewById(R.id.aboutv);
        aboutus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();
                        Intent vi = new Intent(Main_screen.this,about.class);
                        startActivity(vi);
                    }
                }
        );

    }




}
