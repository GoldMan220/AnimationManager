package phc.com.animationmanage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationSet;

public class AnimationManage {

    /**自定义动画*/
    public void setCustomAnimator(View view, float[] translationX, float[] translationY, float[] scaleX, float[] scaleY, float[] alpha, float[] rotation, long during, int loop) {
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

    /**
     * 链式调用
     */
    public static class Builder{
        AnimatorSet animatorSet=new AnimatorSet();
        AnimatorSet.Builder builder;   //动画构造器
        View view;
        int loop=0;
        //构造函数  控制的组件，循环次数，播放一次的时间
        public Builder(View view,int loop,long duringTime){
            animatorSet.setDuration(duringTime);
            this.view=view;
            this.loop=loop;
        }
        //X轴平移
        public Builder setTranslationX( float[] translationX){
            ObjectAnimator tX = ObjectAnimator.ofFloat(view, "translationX", translationX);
            tX.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(tX);
            }else builder.with(tX);
            return this;
        }
        //Y轴平移
        public Builder setTranslationY( float[] translationY){
            ObjectAnimator tY = ObjectAnimator.ofFloat(view, "translationY", translationY);
            tY.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(tY);
            }else builder.with(tY);
            return this;
        }
        //X轴缩放
        public Builder setScaleX(float[] scaleX){
            ObjectAnimator sX=ObjectAnimator.ofFloat(view,"scaleX",scaleX);
            sX.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(sX);
            }else builder.with(sX);
            return this;
        }
        //Y轴缩放
        public Builder setScaleY(float[] scaleY){
            ObjectAnimator sY=ObjectAnimator.ofFloat(view,"scaleY",scaleY);
            sY.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(sY);
            }else builder.with(sY);
            return this;
        }
        //透明度
        public Builder setAlpha(float[] alpha){
            ObjectAnimator aP=ObjectAnimator.ofFloat(view,"alpha",alpha);
            aP.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(aP);
            }else builder.with(aP);
            return this;
        }
        //角度
        public Builder setRotation(float[] rotation){
            ObjectAnimator rT=ObjectAnimator.ofFloat(view,"rotation",rotation);
            rT.setRepeatCount(loop);
            if(builder==null){   //判读是否第一个调用
                builder=animatorSet.play(rT);
            }else builder.with(rT);
            return this;
        }

        //播放动画
        public void start(){
            animatorSet.start();
        }
    }

}
