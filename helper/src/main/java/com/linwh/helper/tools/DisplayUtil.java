package com.linwh.helper.tools;

import android.content.Context;

/**
 * author : linwenhao
 * date   : 2022/3/30 15:55
 * desc   :
 * version: 1.0
 */
public class DisplayUtil {
   public static int dp2px(Context context, float dpValue) {
        if (context == null) return (int) (dpValue * 1.5f + 0.5f);
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
