package com.test.mandap.appintro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.test.mandap.appintro.slides.FirstSlide;

/**
 * Created by Shashank Gupta on 20-Aug-15.
 */
public class DefaultIntro extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(FirstSlide.instantiate(this,"First Slide"));
        addSlide(FirstSlide.instantiate(this,"Second Slide"));
        //addSlide(SampleSlide.newInstance(R.layout.intro3));
        //addSlide(SampleSlide.newInstance(R.layout.intro4));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSkipPressed() {
        loadMainActivity();
        //Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        loadMainActivity();
    }

    public void getStarted(View v){
        loadMainActivity();
    }
}
