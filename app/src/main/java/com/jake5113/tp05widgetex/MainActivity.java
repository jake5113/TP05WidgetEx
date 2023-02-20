package com.jake5113.tp05widgetex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView iconOverView, iconLike, iconMsg, iconSend, iconBookmark, iconImg;
    ImageView changeImg;
    int bookMarkCount = 0, likeCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iconOverView = findViewById(R.id.icon_overview);
        iconLike = findViewById(R.id.icon_like);
        iconMsg = findViewById(R.id.icon_msg);
        iconSend = findViewById(R.id.icon_send);
        iconBookmark = findViewById(R.id.icon_bookmark);
        iconImg = findViewById(R.id.icon_img);

        iconImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                AlertDialog popup = builder.create();
                builder.setView(R.layout.popup);
                popup = builder.create();
                popup.show();
                changeImg = popup.findViewById(R.id.change_img);
                //TODO 이미지 클릭시 사진 넘어가는 것 하기
                changeImg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        changeImg.setImageResource(R.drawable.sydney);
                    }
                });
            }
        });

        iconOverView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "overflow", Toast.LENGTH_SHORT).show();
            }
        });
        iconLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeCount % 2 == 0) iconLike.setImageResource(R.drawable.baseline_favorite_24);
                else iconLike.setImageResource(R.drawable.baseline_favorite_border_24);
                likeCount++;

            }
        });
        iconMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "msg", Toast.LENGTH_SHORT).show();
            }
        });
        iconSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "send", Toast.LENGTH_SHORT).show();
            }
        });
        iconBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bookMarkCount % 2 == 0) iconBookmark.setImageResource(R.drawable.baseline_bookmark_24);
                else iconBookmark.setImageResource(R.drawable.baseline_bookmark_border_24);
                bookMarkCount++;
            }
        });

    }
}