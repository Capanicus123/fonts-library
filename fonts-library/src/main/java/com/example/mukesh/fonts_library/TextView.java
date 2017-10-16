package com.example.mukesh.fonts_library;
import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by ${Mukesh} on ${Aug-Sep-2017}.
 */
public class TextView {
    public static final Typeface getfontStyle(Context context) {
        Typeface typeface = null;
        typeface = Typeface.createFromAsset(context.getAssets(),
                "fonts/rajdhani_regular.ttf");
        typeface = typeface;
        return typeface;
    }
    public static final Typeface getfontStyleBold(Context context) {
        Typeface typeface = null;
        typeface = Typeface.createFromAsset(context.getAssets(),
                "fonts/rajdhani_bold.ttf");
        typeface = typeface;
        return typeface;
    }
    public static final Typeface getfontStyleMedium(Context context) {
        Typeface typeface = null;
        typeface = Typeface.createFromAsset(context.getAssets(),
                "fonts/rajdhani_medium.ttf");
        typeface = typeface;
        return typeface;
    }


}
