package utils;

import java.security.MessageDigest;
import java.util.Base64;

public class Encrypt {
	public static String toSHA1(String str) {
		String salt = "fgfauwfvn/fah@qirttrg;=";
		String result = null;
		str = str + salt;
		try {
			byte[] data = str.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			result = Base64.getEncoder().encodeToString(md.digest(data));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(toSHA1("123456"));
	}
}
