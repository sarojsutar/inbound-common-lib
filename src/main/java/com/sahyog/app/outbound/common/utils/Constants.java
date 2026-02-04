package com.sahyog.app.outbound.common.utils;

public interface Constants {

	// Service Based Constants
	String ALL_ORDERS_BY_USERID = "all_Orders_by_userId";
	String ORDER_REQUESTS = "order_requests";
	String ORDER = "order";
	String ADMIN = "admin";
	String NOTIFICATION = "notification";
	String USER = "user";
	String PAYMENT = "payment";
	String FINANCE = "finance";
	String CMS = "cms";
	String SALES = "sales";
	String ANALYTICS = "analytics";
	String POSTFIX_SERVICE_ID = "service";

	String ROUTING_KEY_POSTFIX = "route";
	String EXCHANGE_POSTFIX = "topic-exchange";
	String QUEUE_POSTFIX = "queue";
	String CALLBACK_ROUTING_KEY_POSTFIX = "callback.route";
	String CALLBACK_QUEUE_POSTFIX = "callback-queue";

	// event types
	String CREATE_ORDER_EVENT = "createorder";
	String CANCEL_ORDER_EVENT = "cancelledorder";
	String SEND_MAIL_EVENT = "sendmail";
	String SEND_SMS_EVENT = "sendsms";
	String MAKE_PAYMENT_EVENT = "makepayment";
	String PUSH_NOTIFICATION = "push_notification";
	// Commons
	String COMMA = ",";
	String DASH = "-";
	String DOT = ".";
	String COLON = ";";
	String COLON_WITH_SPACES = " : ";
	String HASH = "#";
	String BLANK = "";
	String SPACE = " ";
	String SINGLE_QUOTE = "'";
	String PERCENT = "%";
	int ZERO = 0;
	int ONE = 1;
	int TWO = 2;
	int THREE = 3;
	int FIVE = 5;
	int TEN = 10;
	int TWELVE = 12;
	int FIFTY = 50;
	boolean TRUE = true;
	boolean FALSE = false;
	String NULL = null;
	int THOUSAND = 1000;

	String TOPIC_EXCHANGE = "topic";

	// Endpoint Integration Constants
	String HTTP_GET_METHOD = "GET";
	String HTTP_POST_METHOD = "POST";
	String HTTP_DELETE_METHOD = "DELETE";
	String CONTENT_TYPE_APPICATION_JSON = "application/json";
	String CONTENT_TYPE_MULTIPART_DATA = "multipart/form-data";
	String HEADER_PROPERTY_AUTHORIZATION = "Authorization";
	String HEADER_PROPERTY_CSRF_TOKEN = "x-csrf-token";
	String HEADER_PROPERTY_CSRF_TOKEN_PARAM = "fetch";
	String HEADER_PROPERTY_COOKIE = "cookie";
	String HEADER_PROPERTY_SET_COOKIE = "set-cookie";
	String HEADER_PROPERTY_AUTH_BASIC = "Basic ";
	String HEADER_PROPERTY_CONTENT_TYPE = "Content-Type";
	String PRODUCT = "PRODUCT";
	public static final String DATE_FORMAT_IN_DDMMMYYYYDD = "dd-MMM-yyyy";

	public static final String DATE_FORMAT_IN_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_FORMAT_IN_DDMMYYYYDD = "dd-MM-yyyy";
	public static final String DATE_FORMAT_IN_DDMMYYYYDDHHMMSS = "dd-MM-yyyy HH:mm:ss";
	public static final String DATE_FORMAT_IN_DDMMYYYYDDHHMMSSWITH_T = "dd-MM-yyyy'T'HH:mm:ss";
	public static final String DATE_FORMAT_IN_YYYYMMDDHHMMSSWITH_T = "yyyy-MM-dd'T'HH:mm:ss";
	public static final String DATE_FORMAT_IN_MMDDYYYYHHMMSSWITH_T = "dd-MM-yyyy'T'HH:mm:ss";
	public static final String DATE_FORMAT_IN_YYYYMMDD = "yyyy-MM-dd";

	public static final String DATE_FORMAT_IN_YYYYMMDD_NO_SPACE = "yyyyMMdd";

}
