package com.linwh.helper.tools;

import android.util.Log;

/**
 * author : linwenhao
 * date   : 2022/4/19 14:49
 * desc   : 日志打印工具类
 * version: 1.0
 */
public class LogUtils {
    static boolean isDebugger =true;//是否打印
    static String className;//类名
    static String methodName;//方法名
    static int lineNumber;//行数
    /**
     * 设置是否打印日志
     * @param debug
     */
    public static void setDebugger(boolean debug){
        isDebugger =debug;
    }

    public static boolean isIsDebugger() {
        return isDebugger;
    }

    private static void getMethodNames(StackTraceElement[] sElements){
        className = sElements[1].getFileName();
        methodName = sElements[1].getMethodName();
        lineNumber = sElements[1].getLineNumber();
    }
    private static String createLog( String log ) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(methodName);
        buffer.append("(").append(className).append(":").append(lineNumber).append(")");
        buffer.append(log);
        return buffer.toString();
    }
    public static void e(String message){
        if (!isIsDebugger())
            return;

        // Throwable instance must be created before any methods
        getMethodNames(new Throwable().getStackTrace());
        Log.e(className, createLog(message));
    }

    public static void i(String message){
        if (!isIsDebugger())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.i(className, createLog(message));
    }
    public static void d(String message){
        if (!isIsDebugger())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.d(className, createLog(message));
    }

    public static void v(String message){
        if (!isIsDebugger())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.v(className, createLog(message));
    }

    public static void w(String message){
        if (!isIsDebugger())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.w(className, createLog(message));
    }
}
