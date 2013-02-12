package com.yvelabs.chronometer2.utils;

public class DateUtils {
	
	public static long getHours (long time) {
		if (time <= 0) return 0;
		long sec = time / 1000;
		return sec / 3600;
	}
	
	public static long getMinutes (long time) {
		if (time <= 0) return 0;
		long sec = time / 1000;
		return (sec % 3600) / 60;
	}
	
	public static long getSeconds (long time) {
		if (time <= 0) return 0;
		long sec = time / 1000;
		return (sec % 3600) % 60;
	}

}


