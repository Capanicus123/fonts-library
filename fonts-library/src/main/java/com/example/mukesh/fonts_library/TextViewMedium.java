package com.example.mukesh.fonts_library;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ${Mukesh} on ${Aug-Sep-2017}.
 */
public class TextViewMedium extends TextView{

	Context mcontext ;
	public TextViewMedium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mcontext =context;
        init();
    }

    public TextViewMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        mcontext =context;
        init();
    }

    public TextViewMedium(Context context) {
        super(context);
        mcontext =context;
        init();
    }

    private void init() {
    	   Typeface custom_font4 = com.example.mukesh.fonts_library.TextView.getfontStyleBold(mcontext);
           setTypeface(custom_font4);
        ////
       
    }

}
