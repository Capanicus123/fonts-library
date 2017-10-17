package com.example.mukesh.fonts_library;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
/**
 * Created by ${Mukesh} on ${Aug-Sep-2017}.
 */
public class MyCustomButton extends Button{

	Context mcontext ;
	public MyCustomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mcontext =context;
        init();
    }

    public MyCustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mcontext =context;
        init();
    }

    public MyCustomButton(Context context) {
        super(context);
        mcontext =context;
        init();
    }

    private void init() {
    	   Typeface custom_font4 = com.example.mukesh.fonts_library.TextView.getfontStyleMedium(mcontext);
           setTypeface(custom_font4);
       
    }

}
