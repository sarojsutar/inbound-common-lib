package com.sahyog.app.inbound.common.utils;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.sahyog.app.inbound.common.dto.RequestDTO;
import com.sahyog.app.inbound.common.dto.ResponseDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommonUtil {

	public static RequestDTO getRequestDTO(String requestData) {
		return new Gson().fromJson(getDecryptedData(requestData), RequestDTO.class);
	}

	public static String getEncryptedResponseMessage(ResponseDTO obj) {
		final String responseString = new Gson().toJson(obj);
//		try {
//			return AESEncryption.encryptData(responseString, AESEncryption.KEY);
//		} catch (Exception e) {
//			log.error("Getting error while for encrypt response  data ", e);
//		}
		return responseString;
	}
	
	public static String getTestEncryptedResponseMessage(ResponseDTO obj) {
		final String responseString = new Gson().toJson(obj);
		try {
			return AESEncryption.encryptData(responseString, AESEncryption.KEY);
		} catch (Exception e) {
			log.error("Getting error while for encrypt response  data ", e);
		}
		return responseString;
	}

	public JSONObject getDecryptedJson(String requestData) throws JSONException {
		JSONObject obj = new JSONObject(getDecryptedData(requestData));
		return obj;
	}

	private static String getDecryptedData(String requestData) {
		//try {
		//	return AESEncryption.decryptData(requestData, AESEncryption.KEY);
		//} catch (Exception e) {
		//	log.error("Getting error while for decrypt request  data ",e);
		//}
		return requestData;
	}
	//for testing util methods
	public static String getTestEncryptedData(String requestData) {
		try {
			return AESEncryption.encryptData(requestData, AESEncryption.KEY);
		} catch (Exception e) {
			log.error("Getting error while for decrypt request  data ",e);
		}
		return requestData;
	}
	public static String getTestDecryptedData(String requestData) {
		try {
			return AESEncryption.decryptData(requestData, AESEncryption.KEY);
		} catch (Exception e) {
			log.error("Getting error while for decrypt request  data ",e);
		}
		return requestData;
	}
	
	public static <T> Object getTestServiceDTO(String requestData, Class<T> classOfT) throws JSONException {
		JSONObject obj = new JSONObject(getTestDecryptedData(requestData));
		return new Gson().fromJson(obj.get("serviceDTO").toString(), (Type) classOfT);

	}

	public static <T> Object getServiceDTO(String requestData, Class<T> classOfT) throws JSONException {
		JSONObject obj = new JSONObject(getDecryptedData(requestData));
		return new Gson().fromJson(obj.get("serviceDTO").toString(), (Type) classOfT);

	}
	
	
	public static boolean verifyUser(String driverMobileNum, String userMobileNo) {
	    //It check userName of Header and payload driverMobileNum is same or not.
		return userMobileNo.equals(driverMobileNum);
	}
	
	public static String dateFormat(Date date) {
		String outPutDate=null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("d-MMM hh:mm a");
             outPutDate = sdf.format(date);
            log.info(String.format("Successfull formatted date - Input date : %s - Output date : %s",date,outPutDate));
        } catch (Exception e) {
            e.printStackTrace();
        };
        return outPutDate;
    }
	
	public <T> List<List<T>>  getChunkedList(List<T> list,Integer chunkSize){
		return Lists.partition(list, chunkSize);
	}

}
