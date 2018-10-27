package sha512;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha512 {

public static String get_SHA_512_SecurePassword(String passwordToHash, String  salt) throws UnsupportedEncodingException{
	String generatedPassword = null;
	    try {
	         MessageDigest md = MessageDigest.getInstance("SHA-512");

				md.update(salt.getBytes("UTF-8"));

	         byte[] bytes;
				bytes = md.digest(passwordToHash.getBytes("UTF-8"));
	         StringBuilder sb = new StringBuilder();
	         for(int i=0; i< bytes.length ;i++){
	            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
	         }
	         generatedPassword = sb.toString();
	        } 
	       catch (NoSuchAlgorithmException e){
	        e.printStackTrace();
	       }
	    return generatedPassword;
	}


public static void mostrarResultado() {
	try {
		System.out.println(get_SHA_512_SecurePassword("pass", "sal"));
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	
}

}