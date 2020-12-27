package br.com.formattanegocios.util;

import java.util.Date;

public class DateConverter {

	public static double delphiDate(long javaDate) {
		return (double) javaDate / 86400000d + 25568d;
	}

	public static Date javaDate(double delphiDate) {
		return new Date((long) (86400000 * (delphiDate - 25568)));
	}

}
