package edu.uw.tacoma.pedrol.lookandfeel;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
    }

    public void animateSpin(View v) {
        View view = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.rotate_and_spin);
        set.setTarget(view);
        set.start();
    }

    public void animateMove(View v) {
        View view= findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.move);
        set.setTarget(view);
        set.start();
    }

    public void animateFade(View v) {
        View view = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.fade);
        set.setTarget(view);
        set.start();
    }
}
