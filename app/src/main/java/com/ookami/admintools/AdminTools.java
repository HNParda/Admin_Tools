package com.ookami.admintools;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class AdminTools extends LinearLayout {

    ExtendedFloatingActionButton muteBtn;
    ExtendedFloatingActionButton addBotBtn;
    ExtendedFloatingActionButton expandBtn;

    public AdminTools(Context context) {
        super(context);
        init(null, 0);
    }

    public AdminTools(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public AdminTools(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    @SuppressLint("DiscouragedApi")
    public int getID(String s) {
        String[] a = s.split("[.]");
        return getResources().getIdentifier(a[1], a[0], getContext().getPackageName());
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(getID("layout.admin_tools"), null);

        int width = v.getWidth();
        setMinimumWidth(width);
        setMinimumHeight((width + 10) * 3);

        muteBtn   = v.findViewById(getID("id.mute_group"));
        addBotBtn = v.findViewById(getID("id.add_bot"));
        expandBtn = v.findViewById(getID("id.extend_admin_tools"));

    }

    private void init(AttributeSet attrs, int defStyle) {
        LayoutInflater.from(getContext()).inflate(getID("layout.admin_tools"), null, false);

        //setOnClickListener(view -> {});
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LayoutInflater.from(getContext()).inflate(getID("layout.admin_tools"), null, false);

    }

}