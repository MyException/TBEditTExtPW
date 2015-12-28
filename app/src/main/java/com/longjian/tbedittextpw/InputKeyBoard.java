package com.longjian.tbedittextpw;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

/**
 * Created by longjian on 2015/12/28.
 */
public class InputKeyBoard extends View {

    /**
     * 获取屏幕的宽度和高度
     */
    private int WindWidth;
    private int WindHeight;
    private int KeyBoardHeight;

    public InputKeyBoard(Context context) {
    this(context,null);
    }

    public InputKeyBoard(Context context, AttributeSet attrs) {
        this(context,attrs,0);
    }

    public InputKeyBoard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs, defStyleAttr);
    }

    private void initView(Context context, AttributeSet attrs, int defStyleAttr) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        WindWidth = windowManager.getDefaultDisplay().getWidth();
        WindHeight = windowManager.getDefaultDisplay().getHeight();
        KeyBoardHeight = WindWidth;
        LinearLayout linearLayout = new LinearLayout(context,attrs);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context,attrs);
        layoutParams.width = LinearLayout.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindWidth;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(getResources().getColor(R.color.yellow));

    }
}
