package com.handmark.pulltorefresh.library.extras;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * Created by RoyJing on 15/8/21.
 */
public class ScrollWebView extends WebView {
    private OnScrollChangeListener mOnScrollChangeListener;
    public ScrollWebView(Context context) {
        super(context);
        init(context);
    }

    public ScrollWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public ScrollWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

//    @TargetApi(Build.VERSION_CODES.BASE_1_1)
//    public ScrollWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//        init(context);
//    }

    private void init(Context context) {

    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollChangeListener != null) {
            mOnScrollChangeListener.onScrollChanged(l, t, oldl, oldt);
        }
    }

    public OnScrollChangeListener getOnScrollChangeListener() {
        return mOnScrollChangeListener;
    }

    public void setOnScrollChangeListener(OnScrollChangeListener mOnScrollChangeListener) {
        this.mOnScrollChangeListener = mOnScrollChangeListener;
    }

    public static interface OnScrollChangeListener {
        void onScrollChanged(int l, int t, int oldl, int oldt);
    }
}
