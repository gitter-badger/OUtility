package com.owenjmcneil.outility.helpers;

public class OException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Basic exception class used to log OUtility errors more effectively
	 * @param className Class in which the error occurred
	 * @param errorDescription Brief description of the error
	 */
	public OException(String className, String errorDescription) {
		super("[OUtility] " + className + ": " + errorDescription);
	}

}
