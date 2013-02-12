package com.yvelabs.chronometer2.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

public class AnimationUtils {
	
	public void getPauseAlpha (View view) {
		AlphaAnimation alpha = new AlphaAnimation(1f, 0.1f);
		alpha.setDuration(500);
		alpha.setRepeatCount(Animation.INFINITE);
		alpha.setRepeatMode(Animation.REVERSE);
		view.startAnimation(alpha);
	}

}
