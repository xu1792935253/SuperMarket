package com.java.util;
/**
 * ×Ö·û´®ÅÐ¿Õ
 * @author 86184
 *
 */
public class StringIsEmpty {
	/**
	 * ÅÐ¶ÏÊÇ·ñÎª¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str==null ||"".equals(str.trim())) {
			return true;
		}else
		{
			return false;
		}
	}
	/**
	 * ÅÐ¶ÏÊÇ·ñ²»ÊÇ¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		if(str!=null && !"".equals(str.trim())) {
			return true;
		}else
		{
			return false;
		}
	}

	
}
