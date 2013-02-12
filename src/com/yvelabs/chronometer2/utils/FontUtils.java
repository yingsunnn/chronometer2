package com.yvelabs.chronometer2.utils;

import android.content.Context;
import android.graphics.Typeface;

public class FontUtils {

	public static final String FONT_BREAKDOWN = "fonts/com_yve_chronometer_font_breakdown.ttf";
	public static final String FONT_DUPLEX = "fonts/com_yve_chronometer_font_duplex.ttf";
	public static final String SQUID_REGULAR = "fonts/com_yve_chronometer_squid_regular.ttf";
	public static final String SQUID_SMALL_CAPS = "fonts/com_yve_chronometer_squid_small_caps.ttf";
	public static final String VTKS_UNTITLED = "fonts/com_yve_chronometer_vtks_untitled.ttf";
	public static final String N_GAGE = "fonts/com_yve_chronometer_n-gage.ttf";

	public static Typeface getTypeface(Context context, String typeFaceName) {
		return Typeface.createFromAsset(context.getAssets(), typeFaceName);
	}

}
