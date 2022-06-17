package phc.com.animationmanage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

public class AnimationManage {

    /**自定义动画*/
    public static void setCustomAnimator(View view, float[] translationX, float[] translationY, float[] scaleX, float[] scaleY, float[] alpha, float[] rotation, long during, int loop) {
        ObjectAnimator tX = ObjectAnimator.ofFloat(view, "translationX", translationX);
        tX.setRepeatCount(loop);
        ObjectAnimator tY = ObjectAnimator.ofFloat(view, "translationY", translationY);
        tY.setRepeatCount(loop);
        ObjectAnimator sX = ObjectAnimator.ofFloat(view, "scaleX", scaleX);
        sX.setRepeatCount(loop);
        ObjectAnimator sY = ObjectAnimator.ofFloat(view, "scaleY", scaleY);
        sY.setRepeatCount(loop);
        ObjectAnimator aP = ObjectAnimator.ofFloat(view, "alpha", alpha);
        aP.setRepeatCount(loop);
        ObjectAnimator rT = ObjectAnimator.ofFloat(view, "rotation", rotation);
        rT.setRepeatCount(loop);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(tX).with(tY).with(sX).with(sY).with(aP).with(rT);
        animatorSet.setDuration(during);
        animatorSet.start();
    }
}
