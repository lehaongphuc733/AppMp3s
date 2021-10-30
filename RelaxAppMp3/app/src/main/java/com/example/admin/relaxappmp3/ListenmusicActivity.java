package com.example.admin.relaxappmp3;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ListenmusicActivity extends AppCompatActivity {

    ImageView imgMedia;
    ImageButton  imgBackMenu, imgBackMusic , imgFastLeft , imgPlay , imgFastRight, imgNextMusic , imgRepeat;
    TextView txtInfoMusic , txtFirstTime , txtLastTime ;
    SeekBar skMusic ;




    MediaPlayer mediaPlayer ;
    int position = 0 ;
    ArrayList<BHnoibat> arrayBH;
    Animation animation ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listenmusic);

        anhxa();



        Intent intent = getIntent();
        position = intent.getIntExtra("position",0);


        animation = AnimationUtils.loadAnimation(this,R.anim.disc_rotate);


//        Intent intent = getIntent();
//        listBH = (ListBH) intent.getSerializableExtra("listBH");
//        position = listBH.getPosition();
        arrayBH = new ArrayList<>();

        arrayBH.add(new BHnoibat(R.drawable.item1,"Lạc Trôi","Sơn Tùng",1,R.raw.lactroi));
        arrayBH.add(new BHnoibat(R.drawable.item3,"Khuê Mộc Lan","Hương Ly",1,R.raw.khuemoclan));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        arrayBH.add(new BHnoibat(R.drawable.item4,"Rồi Tới Luôn","Nal",1,R.raw.roitoiluon));
        KhoiTaoMedia();

        imgBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ListenmusicActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });

        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    imgPlay.setImageResource(R.drawable.ic_play_arrow_black_24dp);

                }
                else {
                    mediaPlayer.start();
                    imgPlay.setImageResource(R.drawable.ic_pause_black_24dp);

                }
                SetTimeTotal();
                UpdateTimeSong();
                imgMedia.startAnimation(animation);
            }
        });

        imgNextMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position++;
                if(position > arrayBH.size()-1)
                {
                    position = 0;
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                }
                KhoiTaoMedia();
                mediaPlayer.start();
                imgPlay.setImageResource(R.drawable.ic_pause_black_24dp);
                SetTimeTotal();
                UpdateTimeSong();
            }
        });

        imgBackMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position--;
                if(position < 0 )
                {
                    position = arrayBH.size()-1;
                }
                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                }
                KhoiTaoMedia();
                mediaPlayer.start();
                imgPlay.setImageResource(R.drawable.ic_pause_black_24dp);
                SetTimeTotal();
                UpdateTimeSong();
            }
        });



    }
        private void SetTimeTotal() {
            java.text.SimpleDateFormat dinhdangGio = new java.text.SimpleDateFormat("mm:ss");
        txtLastTime.setText(dinhdangGio.format(mediaPlayer.getDuration()));
        skMusic.setMax(mediaPlayer.getDuration());

        skMusic.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mediaPlayer.seekTo(skMusic.getProgress());
            }
        });
    }


    private void anhxa() {
        imgMedia = (ImageView) findViewById(R.id.imgMedia);
        imgBackMenu = (ImageButton) findViewById(R.id.imgBackMenu);
        imgBackMusic = (ImageButton) findViewById(R.id.imgBackMusic);
        imgFastLeft = (ImageButton) findViewById(R.id.imgFastLeft);
        imgFastRight = (ImageButton) findViewById(R.id.imgFastRight);
        imgPlay = (ImageButton) findViewById(R.id.imgPlay);
        imgNextMusic = (ImageButton) findViewById(R.id.imgNextMusic);
        imgRepeat = (ImageButton) findViewById(R.id.imgRepeat);

        txtInfoMusic = (TextView) findViewById(R.id.txtInfoMusic);
        txtFirstTime = (TextView) findViewById(R.id.txtFirstTime);
        txtLastTime = (TextView) findViewById(R.id.txtLastTime);

        skMusic = (SeekBar) findViewById(R.id.skMusic);
    }
    private void UpdateTimeSong() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                java.text.SimpleDateFormat dinhdangGio = new java.text.SimpleDateFormat("mm:ss");
                txtFirstTime.setText(dinhdangGio.format(mediaPlayer.getCurrentPosition()));
                skMusic.setProgress(mediaPlayer.getCurrentPosition());
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        position ++;
                        if(position > arrayBH.size()-1)
                        {
                            position = 0;
                        }
                        if(mediaPlayer.isPlaying())
                        {
                            mediaPlayer.stop();
                        }
                        KhoiTaoMedia();
                        mediaPlayer.start();
                        imgPlay.setImageResource(R.drawable.ic_pause_black_24dp);
                        SetTimeTotal();
                        UpdateTimeSong();
                    }
                });
                handler.postDelayed(this, 500);

            }
        },100);
    }

    private void KhoiTaoMedia() {
        mediaPlayer = MediaPlayer.create(ListenmusicActivity.this,arrayBH.get(position).getFileBH());
        String tenBH = arrayBH.get(position).getTenbaihat();
        String tencasi = arrayBH.get(position).getTencasi();

        txtInfoMusic.setText(tenBH + " - " + tencasi);

    }

}
