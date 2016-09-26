package br.com.anascoding.somdosbichos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cachorro = null;
    private ImageView gato = null;
    private ImageView leao = null;
    private ImageView macaco = null;
    private ImageView ovelha = null;
    private ImageView vaca = null;
    private MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cachorro = (ImageView) findViewById(R.id.imgCachorro);
        gato = (ImageView) findViewById(R.id.imgGato);
        leao = (ImageView) findViewById(R.id.imgLeao);
        macaco = (ImageView) findViewById(R.id.imgMacaco);
        ovelha = (ImageView) findViewById(R.id.imgOvelha);
        vaca = (ImageView) findViewById(R.id.imgVaca);

        cachorro.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imgCachorro:
                mediaPlayer = MediaPlayer.create(this, R.raw.cachorro);
                tocarSom();
                break;
            case R.id.imgGato:
                mediaPlayer = MediaPlayer.create(this, R.raw.gato);
                tocarSom();
                break;
            case R.id.imgLeao:
                mediaPlayer = MediaPlayer.create(this, R.raw.leao);
                tocarSom();
                break;
            case R.id.imgMacaco:
                mediaPlayer = MediaPlayer.create(this, R.raw.macaco);
                tocarSom();
                break;
            case R.id.imgOvelha:
                mediaPlayer = MediaPlayer.create(this, R.raw.ovelha);
                tocarSom();
                break;
            case R.id.imgVaca:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaca);
                tocarSom();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }

    private void tocarSom() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }
}
