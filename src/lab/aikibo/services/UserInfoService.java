package lab.aikibo.services;

import lab.aikibo.entity.DatLogin;

public interface UserInfoService {
	
	// find user by username 
	public DatLogin findUser(String nip);
	
	// update user
	public DatLogin updateUser(DatLogin user);

}