package com.sahyog.app.outbound.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static Date addHoursInDate(Date startTime, Integer reShedulerInHours) {
		LocalDateTime localDateTime = startTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		LocalDateTime plusHours = localDateTime.plusHours(reShedulerInHours);

		GregorianCalendar from = GregorianCalendar.from(ZonedDateTime.of(plusHours, ZoneId.systemDefault()));
		Date time = from.getTime();
		return time;
	}

	public static Date addMinutesInDate(Date startTime, Integer minutes) {
		LocalDateTime localDateTime = startTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		LocalDateTime plusHours = localDateTime.plusMinutes(minutes);

		GregorianCalendar from = GregorianCalendar.from(ZonedDateTime.of(plusHours, ZoneId.systemDefault()));
		Date time = from.getTime();
		return time;
	}

	public static String converMilliSecondToDate(Long millisecond) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDDHHMMSS);
		Date startDate = new Date(millisecond);
		return sdf.format(startDate);
	}

	public static boolean isDateInBetween(final Date min, final Date max, final Date date) {
		return (date.before(max) && date.after(min));
	}

	public static LocalDateTime addHoursInDate(LocalDateTime startTime, Integer hourToBeadded) {
		startTime = startTime.plus(hourToBeadded, ChronoUnit.HOURS);
		return startTime;
	}

	public static String dateToStringInYYYYMMDDHHMMSS(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDDHHMMSS);

		return sdf.format(date);
	}

	public static String dateToStringInYYYYMMDDHHMMSSWithT(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDDHHMMSSWITH_T);
		return sdf.format(date);
	}

	public static LocalDateTime StringToLocalDateTimeInYYYYMMDDHHMMSS(String date) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT_IN_YYYYMMDDHHMMSSWITH_T);
		return LocalDateTime.parse(date, dtf);
	}

	public static String dateToStringInDDMMYYYYHHMMSSWithT(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_DDMMYYYYDDHHMMSSWITH_T);

		return sdf.format(date);
	}

	public static String dateToStringInDDMMYYYYDD(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_DDMMYYYYDD);

		return sdf.format(date);
	}

	public static String dateToStringInDDMMYYYYDDNoSpace(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDD_NO_SPACE);

		return sdf.format(date);
	}

	public static String dateToStringInDDMMMYYYYDD(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_DDMMMYYYYDD);

		return sdf.format(date);
	}

	public static String dateToStringInYYYYMMDD(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDD);

		return sdf.format(date);
	}

	public static Date dateToStringInDDMMYYYYHHMMSS(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_DDMMYYYYDDHHMMSS);
		String formattedDate = sdf.format(date);
		Date parsedDate = null;
		try {
			parsedDate = sdf.parse(formattedDate);
		} catch (ParseException e) {
			e.getMessage();
		}
		return parsedDate;
	}

	public static LocalDate localDateTimeToLocalDateInYYYYMMDD(LocalDateTime date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT_IN_YYYYMMDD);
		String format = formatter.format(date);

		return LocalDate.parse(format, formatter);
	}

	public static String dateToStringInDDMMYYYYDDHHMMSSWITH_T(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_DDMMYYYYDDHHMMSSWITH_T);

		return sdf.format(date);
	}

	public static Date getISTDate(String utcDate) {
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMAT_IN_YYYYMMDDHHMMSSWITH_T);
		try {
			return sdf.parse(utcDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String dateToStringInDDMMYYYYDDHHMMSSWITH_T(LocalDateTime billDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMAT_IN_DDMMYYYYDDHHMMSSWITH_T);
		return billDate.format(formatter);
	}

}
