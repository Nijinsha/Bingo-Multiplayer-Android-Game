package com.nijinsha.bingomultiplayer;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Host_Act extends AppCompatActivity {
    Button host;
    Button playwifi;
    MediaPlayer buttonsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
        buttonsound = MediaPlayer.create(this, R.raw.button);
        buttonsound.setAudioStreamType(AudioManager.STREAM_MUSIC);
        host=(Button)findViewById(R.id.hostv);
        host.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();
                        aboutintent();
                    }
                }
        );

        playwifi=(Button)findViewById(R.id.joinv);
        playwifi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonsound.setLooping(false);
                        buttonsound.start();
                        Intent j = new Intent(Host_Act.this,Wifi_menu.class);
                        startActivity(j);
                    }
                }
        );


    }
    public void aboutintent(){
        Intent host= new Intent(Host_Act.this,Game_Act.class);
       startActivity(host);

    }


}
