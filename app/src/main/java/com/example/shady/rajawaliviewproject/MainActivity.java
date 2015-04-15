package com.example.shady.rajawaliviewproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.rajawali3d.surface.RajawaliSurfaceView;


public class MainActivity extends ActionBarActivity {

    Renderer renderer;
    public RajawaliSurfaceView rajawaliSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rajawaliSurface = (RajawaliSurfaceView) findViewById(R.id.rajawali_surface);
        renderer = new Renderer(this);
        rajawaliSurface.setSurfaceRenderer(renderer);
    }

}
