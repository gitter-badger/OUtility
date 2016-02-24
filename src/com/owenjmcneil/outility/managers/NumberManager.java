package com.owenjmcneil.outility.managers;

import com.owenjmcneil.outility.helpers.NumberToWords;

public final class NumberManager {

	private NumberManager() {}
	

	/**
	 * Convert any number (from 0 to 999 999 999 999) to it's word value (i.e. One hundred ten)
	 * @param number Number to be converted
	 * @return The number's word value
	 */
	public static String convertToWords(long number) {
		NumberToWords processor = new NumberToWords();
		return processor.convert(number);
	}

}
