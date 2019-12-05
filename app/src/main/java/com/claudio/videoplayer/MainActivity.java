package com.claudio.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView =(VideoView)findViewById(R.id.vdVw);
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController= new MediaController(this);
        //Set the view that acts as the anchor for the control view.
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uri = Uri.parse("android.resource://" +

                getPackageName() + "/" + R.raw.sal);
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        //Sets video URI.
        //Sets video URI using specific headers.
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}