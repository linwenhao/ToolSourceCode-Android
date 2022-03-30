package com.linwh.helper.view.tickview;

public interface TickAnimatorListener {
    void onAnimationStart(TickView tickView);

    void onAnimationEnd(TickView tickView);

    abstract class TickAnimatorListenerAdapter implements TickAnimatorListener {
        @Override
        public void onAnimationStart(TickView tickView) {

        }

        @Override
        public void onAnimationEnd(TickView tickView) {

        }
    }
}
