package lab.aikibo.entity;

public class DatLogin {
	
	private String nmLogin;
	private String nip;
	private String password;
	
	public DatLogin() {}
	
	public DatLogin(String nmLogin, String nip, String password) {
		this.setNmLogin(nmLogin);
		this.setNip(nip);
		this.setPassword(password);
	}
	
	
	// -- setter and getter

	public String getNmLogin() {
		return nmLogin;
	}

	public void setNmLogin(String nmLogin) {
		this.nmLogin = nmLogin;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
