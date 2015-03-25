package lab.aikibo.test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import lab.aikibo.entity.DatLogin;
import lab.aikibo.manager.UserManager;
import lab.aikibo.util.Encrypt;

public class UserManagerTest {
	
	public static void main(String args[]) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, InvalidAlgorithmParameterException {
		UserManager um = new UserManager();
		//DatLogin data = um.getUserByNip("060000000");
		DatLogin data = new DatLogin();
		data.setNip("060000000");
		data.setNmLogin("ADMIN");
		data.setPassword("RAHASIAADMIN");
		
		System.out.println("NIP : " + data.getNip());
		System.out.println("NAMA : " + data.getNmLogin());
		System.out.println("PASSWORD : " + data.getPassword());
		
		data.setPassword(Encrypt.getEncrypted2("RAHASIA"));
		
		System.out.println("NIP : " + data.getNip());
		System.out.println("NAMA : " + data.getNmLogin());
		System.out.println("PASSWORD : " + data.getPassword());
		
		um.savePojo(data);
		System.out.println("Data berhasil disimpan");
		
		String password = um.getPassword("ADMIN");
		System.out.println("Password : " + password);
		System.out.println("Decode : " + Encrypt.getDecrypted2(password));
	}

}