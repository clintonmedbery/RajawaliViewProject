package com.example.shady.rajawaliviewproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.rajawali3d.surface.RajawaliTextureView;


public class MainActivity extends ActionBarActivity {

    Renderer renderer;
    public RajawaliTextureView rajawaliTexture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rajawaliTexture = (RajawaliTextureView) findViewById(R.id.rajawali_texture);
        renderer = new Renderer(this);
        rajawaliTexture.setSurfaceRenderer(renderer);
    }

}
