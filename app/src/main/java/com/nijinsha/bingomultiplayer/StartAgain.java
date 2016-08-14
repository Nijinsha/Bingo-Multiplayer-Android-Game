package com.nijinsha.bingomultiplayer;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartAgain extends AppCompatActivity {
    public Button playagain;
    public Button main;
    MediaPlayer buttonsound;
    Game_Act mew =new  Game_Act();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttonsound = MediaPlayer.create(this, R.raw.button);
        buttonsound.setAudioStreamType(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_start_again);
        playagain=(Button)findViewById(R.id.button2);
        main=(Button)findViewById(R.id.button3);
        playagain.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();

                        Intent play = new Intent(StartAgain.this,Game_Act.class);
                        startActivity(play);
                    }
                }
        );
        main.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {buttonsound.setLooping(false);
                        buttonsound.start();
                        Intent mainmenu = new Intent (StartAgain.this,Main_screen.class);
                        startActivity(mainmenu);
                    }
                }
        );


    }
}
