package com.example.testfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoSolusi extends AppCompatActivity {

    Intent intent;
    String msg;
    String pkf;
    String msgkr;
    String ktrmsg;
    String pck1,pck2,pck3,pck4,pck5,pck6,pck7,pck8,pck9,pck10,pck11,pck12,pck13,pck14,pck15,
            pck16,pck17,pck18,pck19,pck20,pck21,pck22,pck23,pck24,pck25;
    ImageView ChangeImage;
    int ts=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_solusi);

        intent = getIntent();
        msg = intent.getStringExtra(StartSolusiActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.jsolusi_dp);
        textView.setText(msg);

        //pck1 = getResources().getString(R.string.pj1);
        //String ktrmsg = getResources().getString(R.string.pk1);

        ChangeImage = findViewById(R.id.pgff_dp);

        list_pck();

        show_info();

        TextView textView2 = findViewById(R.id.ktrsolusi_dp);
        textView2.setText(ktrmsg);

    }

    public void show_info() {
        if (msg.equals(pck1)){
            ktrmsg = getResources().getString(R.string.pk1);
            ChangeImage.setImageResource(R.drawable.pg1);
        }

        if (msg.equals(pck2)){
            ktrmsg = getResources().getString(R.string.pk2);
            ChangeImage.setImageResource(R.drawable.pg2);
        }

        if (msg.equals(pck3)){
            ktrmsg = getResources().getString(R.string.pk3);
            ChangeImage.setImageResource(R.drawable.pg3);
        }

        if (msg.equals(pck4)){
            ktrmsg = getResources().getString(R.string.pk4);
            ChangeImage.setImageResource(R.drawable.pg4);
        }

        if (msg.equals(pck5)){
            ktrmsg = getResources().getString(R.string.pk5);
            ChangeImage.setImageResource(R.drawable.pg5);
        }

        if (msg.equals(pck6)){
            ktrmsg = getResources().getString(R.string.pk6);
            ChangeImage.setImageResource(R.drawable.pg6);
        }

        if (msg.equals(pck7)){
            ktrmsg = getResources().getString(R.string.pk7);
            ChangeImage.setImageResource(R.drawable.pg7);
        }

        if (msg.equals(pck8)){
            ktrmsg = getResources().getString(R.string.pk8);
            ChangeImage.setImageResource(R.drawable.pg8);
        }

        if (msg.equals(pck9)){
            ktrmsg = getResources().getString(R.string.pk9);
            ChangeImage.setImageResource(R.drawable.pg9);
        }

        if (msg.equals(pck10)){
            ktrmsg = getResources().getString(R.string.pk10);
            ChangeImage.setImageResource(R.drawable.pg10);
        }

        if (msg.equals(pck11)){
            ktrmsg = getResources().getString(R.string.pk11);
            ChangeImage.setImageResource(R.drawable.pg11);
        }

        if (msg.equals(pck12)){
            ktrmsg = getResources().getString(R.string.pk12);
            ChangeImage.setImageResource(R.drawable.pg12);
        }

        if (msg.equals(pck13)){
            ktrmsg = getResources().getString(R.string.pk13);
            ChangeImage.setImageResource(R.drawable.pg13);
        }

        if (msg.equals(pck14)){
            ktrmsg = getResources().getString(R.string.pk14);
            ChangeImage.setImageResource(R.drawable.pg14);
        }

        if (msg.equals(pck15)){
            ktrmsg = getResources().getString(R.string.pk15);
            ChangeImage.setImageResource(R.drawable.pg15);
        }

        if (msg.equals(pck16)){
            ktrmsg = getResources().getString(R.string.pk16);
            ChangeImage.setImageResource(R.drawable.pg16);
        }

        if (msg.equals(pck17)){
            ktrmsg = getResources().getString(R.string.pk17);
            ChangeImage.setImageResource(R.drawable.pg17);
        }

        if (msg.equals(pck18)){
            ktrmsg = getResources().getString(R.string.pk18);
            ChangeImage.setImageResource(R.drawable.pg18);
        }

        if (msg.equals(pck19)){
            ktrmsg = getResources().getString(R.string.pk19);
            ChangeImage.setImageResource(R.drawable.pg19);
        }

        if (msg.equals(pck20)){
            ktrmsg = getResources().getString(R.string.pk20);
            ChangeImage.setImageResource(R.drawable.pg20);
        }

        if (msg.equals(pck21)){
            ktrmsg = getResources().getString(R.string.pk21);
            ChangeImage.setImageResource(R.drawable.pg21);
        }

        if (msg.equals(pck22)){
            ktrmsg = getResources().getString(R.string.pk22);
            ChangeImage.setImageResource(R.drawable.pg22);
        }

        if (msg.equals(pck23)){
            ktrmsg = getResources().getString(R.string.pk23);
            ChangeImage.setImageResource(R.drawable.pg23);
        }

        if (msg.equals(pck24)){
            ktrmsg = getResources().getString(R.string.pk24);
            ChangeImage.setImageResource(R.drawable.pg24);
        }

        if (msg.equals(pck25)){
            ktrmsg = getResources().getString(R.string.pk25);
            ChangeImage.setImageResource(R.drawable.pg25);
        }
    }

    public void list_pck() {
        pck1 = getResources().getString(R.string.pj1);
        pck2 = getResources().getString(R.string.pj2);
        pck3 = getResources().getString(R.string.pj3);
        pck4 = getResources().getString(R.string.pj4);
        pck5 = getResources().getString(R.string.pj5);
        pck6 = getResources().getString(R.string.pj6);
        pck7 = getResources().getString(R.string.pj7);
        pck8 = getResources().getString(R.string.pj8);
        pck9 = getResources().getString(R.string.pj9);
        pck10 = getResources().getString(R.string.pj10);
        pck11 = getResources().getString(R.string.pj11);
        pck12 = getResources().getString(R.string.pj12);
        pck13 = getResources().getString(R.string.pj13);
        pck14 = getResources().getString(R.string.pj14);
        pck15 = getResources().getString(R.string.pj15);
        pck16 = getResources().getString(R.string.pj16);
        pck17 = getResources().getString(R.string.pj17);
        pck18 = getResources().getString(R.string.pj18);
        pck19 = getResources().getString(R.string.pj19);
        pck20 = getResources().getString(R.string.pj20);
        pck21 = getResources().getString(R.string.pj21);
        pck22 = getResources().getString(R.string.pj22);
        pck23 = getResources().getString(R.string.pj23);
        pck24 = getResources().getString(R.string.pj24);
        pck25 = getResources().getString(R.string.pj25);
    }

    public void back_home(View view) {
        Intent intenth = new Intent(this, MainActivity.class);
        startActivity(intenth);
    }
}
