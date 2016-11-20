package edu.uw.tacoma.pedrol.lookandfeel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StylesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);
    }

    public void submitClick(View v) {
        Intent i = new Intent(StylesActivity.this, AnimationsActivity.class);
        this.startActivity(i);
    }
}
