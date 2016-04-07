package com.example.yan.jokelibrary;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by yan on 3/21/2016.
 */
public class JokeLibrary extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_library);

        String joke = getIntent().getStringExtra("joke");
        ((TextView)findViewById(R.id.joke_text)).setText(joke);


    }
}
