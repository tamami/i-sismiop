package lab.aikibo.services;

import java.io.Serializable;

import lab.aikibo.entity.DatLogin;

public class UserInfoServiceImpl implements UserInfoService, Serializable {

	private static final long serialVersionUID = -6863663601439075742L;

	@Override
	public DatLogin findUser(String nip) {
		// nothing todo, because was handled by authentication
		return null;
	}

	@Override
	public DatLogin updateUser(DatLogin user) {
		// nothing todo, because was handled by authentication
		return null;
	}

}