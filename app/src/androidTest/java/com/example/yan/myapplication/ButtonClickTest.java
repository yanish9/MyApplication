package com.example.yan.myapplication;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

/**
 * Created by silver on 6/8/15.
 */
public class ButtonClickTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public ButtonClickTest() {
        super(MainActivity.class);
    }

    private MainActivity mClickActvity;
    private Button mButton;
    private TextView mTextView;
    private Intent _startIntent;
    @Override
    protected void setUp() throws Exception {
        super.setUp();

        setActivityInitialTouchMode(true);

        setActivityInitialTouchMode(true);
        mClickActvity = getActivity();
        mButton = (Button) mClickActvity.findViewById(R.id.joke_button);


    }

    @MediumTest
    public void testInitialValue(){

        TouchUtils.clickView(this, mButton);

        try {

            mClickActvity.async.get();
           assertNotNull(mClickActvity.async.result);
            Log.d("log" , mClickActvity.async.result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

}
