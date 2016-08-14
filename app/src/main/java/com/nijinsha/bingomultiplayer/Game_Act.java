package com.nijinsha.bingomultiplayer;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class Game_Act extends AppCompatActivity {


    public Integer i=1;
    public Button menu;
    public TextView won;
    public String last="";
    public TextView lastpressed;

    public TextView one,two,three,four,five;
    public TextView six,seven,eight,nine,one0;
    public TextView one1,one2,one3,one4,one5;
    public TextView one6,one7,one8,one9,two0;
    public TextView two1,two2,two3,two4,two5;

    public String num1= null;
    public String num2= null;
    public String num3= null;
    public String num4= null;
    public String num5= null;
    public String num6= null;
    public String num7= null;
    public String num8= null;
    public String num9= null;
    public String num10= null;
    public String num11= null;
    public String num12= null;
    public String num13= null;
    public String num14= null;
    public String num15= null;
    public String num16= null;
    public String num17= null;
    public String num18= null;
    public String num19= null;
    public String num20= null;
    public String num21= null;
    public String num22= null;
    public String num23= null;
    public String num24= null;
    public String num25= null;


    public Boolean c1=false;
    public Boolean c2=false;
    public Boolean c3=false;
    public Boolean c4=false;
    public Boolean c5=false;
    public Boolean c6=false;
    public Boolean c7=false;
    public Boolean c8=false;
    public Boolean c9=false;
    public Boolean c10=false;
    public Boolean c11=false;
    public Boolean c12=false;
    public Boolean c13=false;
    public Boolean c14=false;
    public Boolean c15=false;
    public Boolean c16=false;
    public Boolean c17=false;
    public Boolean c18=false;
    public Boolean c19=false;
    public Boolean c20=false;
    public Boolean c21=false;
    public Boolean c22=false;
    public Boolean c23=false;
    public Boolean c24=false;
    public Boolean c25=false;

    public Boolean inIf1=true;
    public Boolean inIf2=true;
    public Boolean inIf3=true;
    public Boolean inIf4=true;
    public Boolean inIf5=true;
    public Boolean inIf6=true;
    public Boolean inIf7=true;
    public Boolean inIf8=true;
    public Boolean inIf9=true;
    public Boolean inIf10=true;
    public Boolean inIf11=true;
    public Boolean inIf12=true;


    public TextView b;
    public TextView ii;
    public TextView n;
    public TextView g;
    public TextView o;


    public Boolean bdone=true;
    public Boolean idone=true;
    public Boolean ndone=true;
    public Boolean gdone=true;
    public Boolean odone=true;
    MediaPlayer buttonsound;
    boolean onOff;

    public MediaPlayer mMediaPlayer;
    settings_page set =new settings_page();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        buttonsound = MediaPlayer.create(this, R.raw.button);
        buttonsound.setAudioStreamType(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.activity_game);
        onOff=true;

            mMediaPlayer = new MediaPlayer();
            mMediaPlayer = MediaPlayer.create(this, R.raw.sound);
            mMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mMediaPlayer.setLooping(true);
        if(onOff==true) {
            mMediaPlayer.start();
        }


        lastpressed=(TextView)findViewById(R.id.textView35);
        menu= (Button)findViewById(R.id.button);
        menu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {buttonsound.setLooping(false);
                        buttonsound.start();
                        Intent i = new Intent(Game_Act.this,StartAgain.class);
                        startActivity(i);

                    }
                }
        );


        one=(TextView)findViewById(R.id.textView1);
        two=(TextView)findViewById(R.id.textView2);
        three=(TextView)findViewById(R.id.textView3);
        four=(TextView)findViewById(R.id.textView4);
        five=(TextView)findViewById(R.id.textView5);
        six=(TextView)findViewById(R.id.textView6);
        seven=(TextView)findViewById(R.id.textView7);
        eight=(TextView)findViewById(R.id.textView8);
        nine=(TextView)findViewById(R.id.textView9);
        one0=(TextView)findViewById(R.id.textView10);
        one1=(TextView)findViewById(R.id.textView11);
        one2=(TextView)findViewById(R.id.textView12);
        one3=(TextView)findViewById(R.id.textView13);
        one4=(TextView)findViewById(R.id.textView14);
        one5=(TextView)findViewById(R.id.textView15);
        one6=(TextView)findViewById(R.id.textView16);
        one7=(TextView)findViewById(R.id.textView17);
        one8=(TextView)findViewById(R.id.textView18);
        one9=(TextView)findViewById(R.id.textView19);
        two0=(TextView)findViewById(R.id.textView20);
        two1=(TextView)findViewById(R.id.textView21);
        two2=(TextView)findViewById(R.id.textView22);
        two3=(TextView)findViewById(R.id.textView23);
        two4=(TextView)findViewById(R.id.textView24);
        two5=(TextView)findViewById(R.id.textView25);

         startGame();

    }








    public void startGame(){



        one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num1==null) {
                            num1 = i.toString();
                            one.setText(num1);
                            i++;
                            if(i==26){
                                playtime();
                            }

                        }
                    }
                }
        );

   two.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(num2==null) {
                        num2 = i.toString();
                        two.setText(num2);
                        i++;
                        if(i==26){
                            playtime();
                        }

                    }
                }
            }
    );

        three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       if(num3==null) {
                           num3 = i.toString();
                           three.setText(num3);
                           i++;
                           if(i==26){
                               playtime();
                           }
                       }
                    }
                }
        );
        four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       if(num4==null){
                        num4=i.toString();
                        four.setText(num4);
                        i++;
                           if(i==26){
                               playtime();
                           }
                       }
                    }
                }
        );
        five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       if(num5==null) {
                           num5 = i.toString();
                           five.setText(num5);
                           i++;
                           if(i==26){
                               playtime();
                           }
                       }
                    }
                }
        );
        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num6==null) {
                            num6 = i.toString();
                            six.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );
        seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num7==null) {
                            num7 = i.toString();
                            seven.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );
        eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num8==null) {
                            num8 = i.toString();
                            eight.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }

                        }
                    }
                }
        );
        nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num9==null) {
                            num9 = i.toString();
                            nine.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num10==null) {
                            num10 = i.toString();
                            one0.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num11==null) {
                            num11 = i.toString();
                            one1.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num12==null) {
                            num12 = i.toString();
                            one2.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num13==null) {
                            num13 = i.toString();
                            one3.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num14==null) {
                            num14 = i.toString();
                            one4.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num15==null) {
                            num15 = i.toString();
                            one5.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num16==null) {
                            num16 = i.toString();
                            one6.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num17==null) {
                            num17 = i.toString();
                            one7.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num18==null) {
                            num18 = i.toString();
                            one8.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); one9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num19==null) {
                            num19 = i.toString();
                            one9.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); two0.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num20==null) {
                            num20 = i.toString();
                            two0.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );
        two1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num21==null) {
                            num21 = i.toString();
                            two1.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );
        two2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num22==null) {
                            num22 = i.toString();
                            two2.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );
        two3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num23==null) {
                            num23 = i.toString();
                            two3.setText(i.toString());
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); two4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num24==null) {
                            num24 = i.toString();
                            two4.setText(num24);
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        ); two5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(num25==null) {
                            num25 = i.toString();
                            two5.setText(num25);
                            i++;
                            if(i==26){
                                playtime();
                            }
                        }
                    }
                }
        );


    }

    public void playtime()
    {

        b=(TextView)findViewById(R.id.textView26);
        ii=(TextView)findViewById(R.id.textView27);
        n=(TextView)findViewById(R.id.textView28);
        g=(TextView)findViewById(R.id.textView29);
        o=(TextView)findViewById(R.id.textView30);

        b.setTextColor(Color.GRAY);
        ii.setTextColor(Color.GRAY);
        n.setTextColor(Color.GRAY);
        g.setTextColor(Color.GRAY);
        o.setTextColor(Color.GRAY);

        playing();


    }

   public void playing(){

       one.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one.setTextColor(Color.GRAY);
                       one.setBackgroundColor(Color.BLACK);
                       last=one.getText().toString();

                         c1=true;
                       checkBingo();


                   }
               }
       );

       two.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two.setTextColor(Color.GRAY);
                       two.setBackgroundColor(Color.BLACK);
                       last=two.getText().toString();
                       c2=true;
                       checkBingo();

                   }
               }
       );

       three.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       three.setTextColor(Color.GRAY);
                       three.setBackgroundColor(Color.BLACK);
                       last=three.getText().toString();
                       c3=true;
                       checkBingo();

                   }
               }
       );
       four.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       four.setTextColor(Color.GRAY);
                       four.setBackgroundColor(Color.BLACK);
                       last=four.getText().toString();
                       c4=true;
                       checkBingo();

                   }
               }
       );
       five.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       five.setTextColor(Color.GRAY);
                       five.setBackgroundColor(Color.BLACK);
                       last=five.getText().toString();
                       c5=true;
                       checkBingo();

                   }
               }
       );
       six.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       six.setTextColor(Color.GRAY);
                       six.setBackgroundColor(Color.BLACK);
                       last=six.getText().toString();
                       c6=true;
                       checkBingo();


                   }
               }
       );
       seven.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       seven.setTextColor(Color.GRAY);
                       seven.setBackgroundColor(Color.BLACK);
                       last=seven.getText().toString();
                       c7=true;
                       checkBingo();

                   }
               }
       );
       eight.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       eight.setTextColor(Color.GRAY);
                       eight.setBackgroundColor(Color.BLACK);
                       last=eight.getText().toString();
                       c8=true;
                       checkBingo();



                   }
               }
       );
       nine.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       nine.setTextColor(Color.GRAY);
                       nine.setBackgroundColor(Color.BLACK);
                       last=nine.getText().toString();
                       c9=true;
                       checkBingo();


                   }
               }
       ); one0.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one0.setTextColor(Color.GRAY);
                       one0.setBackgroundColor(Color.BLACK);
                       last=one0.getText().toString();
                       c10=true;
                       checkBingo();

                   }
               }
       ); one1.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one1.setTextColor(Color.GRAY);
                       one1.setBackgroundColor(Color.BLACK);
                       last=one1.getText().toString();
                       c11=true;
                       checkBingo();


                   }
               }
       ); one2.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one2.setTextColor(Color.GRAY);
                       one2.setBackgroundColor(Color.BLACK);
                       last=one2.getText().toString();
                       c12=true;
                       checkBingo();


                   }
               }
       ); one3.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one3.setTextColor(Color.GRAY);
                       one3.setBackgroundColor(Color.BLACK);
                       last=one3.getText().toString();
                       c13=true;
                       checkBingo();


                   }
               }
       ); one4.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one4.setTextColor(Color.GRAY);
                       one4.setBackgroundColor(Color.BLACK);
                       last=one4.getText().toString();
                       c14=true;
                       checkBingo();


                   }
               }
       ); one5.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one5.setTextColor(Color.GRAY);
                       one5.setBackgroundColor(Color.BLACK);
                       last=one5.getText().toString();
                       c15=true;
                       checkBingo();

                   }
               }
       ); one6.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one6.setTextColor(Color.GRAY);
                       one6.setBackgroundColor(Color.BLACK);
                       last=one6.getText().toString();
                       c16=true;
                       checkBingo();


                   }
               }
       ); one7.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one7.setTextColor(Color.GRAY);
                       one7.setBackgroundColor(Color.BLACK);
                       last=one7.getText().toString();
                       c17=true;
                       checkBingo();


                   }
               }
       ); one8.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one8.setTextColor(Color.GRAY);
                       one8.setBackgroundColor(Color.BLACK);
                       last=one8.getText().toString();
                       c18=true;
                       checkBingo();


                   }
               }
       ); one9.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       one9.setTextColor(Color.GRAY);
                       one9.setBackgroundColor(Color.BLACK);
                       last=one9.getText().toString();
                       c19=true;
                       checkBingo();

                       }


               }
       ); two0.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two0.setTextColor(Color.GRAY);
                       two0.setBackgroundColor(Color.BLACK);
                       last=two0.getText().toString();
                       c20=true;
                       checkBingo();


                   }
               }
       );
       two1.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two1.setTextColor(Color.GRAY);
                       two1.setBackgroundColor(Color.BLACK);
                       last=two1.getText().toString();
                       c21=true;
                       checkBingo();

                   }
               }
       );
       two2.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two2.setTextColor(Color.GRAY);
                       two2.setBackgroundColor(Color.BLACK);
                       last=two2.getText().toString();
                       c22=true;
                       checkBingo();

                       }

               }
       );
       two3.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two3.setTextColor(Color.GRAY);
                       two3.setBackgroundColor(Color.BLACK);
                       last=two3.getText().toString();
                       c23=true;
                       checkBingo();

                   }
               }
       ); two4.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two4.setTextColor(Color.GRAY);
                       two4.setBackgroundColor(Color.BLACK);
                       last=two4.getText().toString();
                       c24=true;
                       checkBingo();


                   }
               }
       ); two5.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       two5.setTextColor(Color.GRAY);
                       two5.setBackgroundColor(Color.BLACK);
                       last=two5.getText().toString();
                       c25=true;
                       checkBingo();


                   }
               }
       );




   }
    public void checkBingo(){

        lastpressed.setText(last.toString());

        if(c1&&c6&&c11&&c16&&c21) {
            if (inIf1) {
                inIf1=false;
                bingoLetter();
            }
        }
         if(c2&&c7&&c12&&c17&&c22){
            if (inIf2) {
                inIf2=false;
                bingoLetter();
            }
        }
        if(c3&&c8&&c13&&c18&&c23){
            if (inIf3) {
                inIf3=false;
                bingoLetter();
            }
        }
         if(c4&&c9&&c14&&c19&&c24){
            if (inIf4) {
                inIf4=false;
                bingoLetter();
            }
        }
          if(c5&&c10&&c15&&c20&&c25){
            if (inIf5) {
                inIf5=false;
                bingoLetter();
            }
        }
         if(c1&&c2&&c3&&c4&&c5){
             if (inIf6) {
                 inIf6=false;
                 bingoLetter();
             }
        }
         if(c6&&c7&&c8&&c9&&c10){
             if (inIf7) {
                 inIf7=false;
                 bingoLetter();
             }
         }
         if(c11&&c12&&c13&&c14&&c15){
             if (inIf8) {
                 inIf8=false;
                 bingoLetter();
             }
         }
         if(c16&&c17&&c18&&c19&&c20){
             if (inIf9) {
                 inIf9=false;
                 bingoLetter();
             }
         }
         if(c21&&c22&&c23&&c24&&c25){
             if (inIf10) {
                 inIf10=false;
                 bingoLetter();
             }
         }
        if(c1&&c7&&c13&&c19&&c25){
            if (inIf11) {
                inIf11=false;
                bingoLetter();
            }
        }
        if(c5&&c9&&c13&&c17&&c21){

            if (inIf12) {
                inIf12=false;
                bingoLetter();
            }
        }
    }

    public void bingoLetter(){
        if(bdone) {
            bdone=false;
            b.setTextColor(Color.GREEN);
        }
        else if(idone){
            idone=false;
            ii.setTextColor(Color.BLUE);
        }
        else if(ndone){
            ndone=false;
            n.setTextColor(Color.YELLOW);
        }
        else if(gdone){
            gdone=false;
            g.setTextColor(Color.RED);
        }
        else if(odone){
            odone=false;
            o.setTextColor(Color.MAGENTA);
            gameWon();
        }
    }

    public void gameWon(){
        menu.setText("play Again");
        won=(TextView)findViewById(R.id.textView31);
        won.setText("You Won!");
        if(onOff) {
            mMediaPlayer.stop();
        }
        menu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     Intent thisacty = new Intent(Game_Act.this,Game_Act.class);
                        startActivity(thisacty);
                    }
                }
        );

        
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(onOff) {
            mMediaPlayer.stop();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(onOff) {
            mMediaPlayer.stop();
        }
    }
}


