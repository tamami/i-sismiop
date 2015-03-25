package lab.aikibo.viewmodel;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import lab.aikibo.constant.StatusEntry;
import lab.aikibo.entity.DatLogin;
import lab.aikibo.manager.PegawaiManager;
import lab.aikibo.manager.UserManager;
import lab.aikibo.services.UserCredential;
import lab.aikibo.util.Encrypt;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.util.Clients;

public class AdmUserVM {
	
	private int status; // lihat lab.aikibo.constant.StatusEntry
	private UserManager um;
	private PegawaiManager pm;
	private boolean roTbNip;
	private boolean roTbNamaPegawai;
	private boolean roTbNamaUser;
	private boolean roTbPassPengubah;
	private boolean roTbPassBaru;
	private boolean roTbPassBaruConfirm;
	private boolean enBtnUbah;
	private List<String> daftarLogin;
	private String currentLogin;
	private String currentNip;
	private String currentPegawai;
	private String currentPengguna;
	private String currentPassPengubah;
	private String currentPassBaru;
	private String currentPassBaruConfirm;
	
	
	@Init
	public void init() {
		um = new UserManager();
		pm = new PegawaiManager();
		
		clear();
	}
	
	private void clear() {
		setDaftarLogin(um.getListUserInString());
		roTbNip = true;
		roTbNamaPegawai = true;
		roTbNamaUser = true;
		roTbPassPengubah = true;
		roTbPassBaru = true;
		roTbPassBaruConfirm = true;
		currentLogin = new String();
		currentNip = new String();
		currentPegawai = new String();
		currentPengguna = new String();
		currentPassPengubah = new String();
		currentPassBaru = new String();
		currentPassBaruConfirm = new String();
	}

	public List<String> getDaftarLogin() {
		return daftarLogin;
	}

	public void setDaftarLogin(List<String> daftarLogin) {
		this.daftarLogin = daftarLogin;
	}

	public String getCurrentLogin() {
		return currentLogin;
	}

	@NotifyChange({"currentNip", "currentPegawai"})
	public void setCurrentLogin(String currentLogin) {
		this.currentLogin = currentLogin;
		currentNip = um.getNip(currentLogin);
		currentPegawai = pm.getNamaByNipLama(currentNip);
		//Session session = Sessions.getCurrent();
		//currentPengguna = ((UserCredential) session.getAttribute("userCredential")).getNama();
	}
	
	@Command
	@NotifyChange({"roTbNip","roTbNamaUser","roTbPassPengubah","roTbPassBaru",
		"roTbPassBaruConfirm"})
	public void baruClick() {
		roTbNip = false;
		roTbNamaUser = false;
		roTbPassPengubah = false;
		roTbPassBaru = false;
		roTbPassBaruConfirm = false;
		
		status = StatusEntry.DATA_BARU;
	}
	
	@Command
	@NotifyChange({"roTbNip","roTbNamaUser","roTbPassPengubah","roTbPassBaru",
		"roTbPassBaruConfirm"})
	public void ubahClick() {
		roTbNip = true;
		roTbNamaUser = true;
		roTbPassPengubah = false;
		roTbPassBaru = false;
		roTbPassBaruConfirm = false;
		
		status = StatusEntry.UBAH_DATA;
	}
	
	@Command
	@NotifyChange({"roTbNip","roTbNamaUser","roTbPassPengubah","roTbPassBaru",
		"roTbPassBaruConfirm"})
	public void hapusClick() {
		roTbNip = true;
		roTbNamaUser = true;
		roTbPassPengubah = false;
		roTbPassBaru = true;
		roTbPassBaruConfirm = true;
		
		status = StatusEntry.HAPUS_DATA;
	}
	
	@Command
	@NotifyChange({"roTbNip","roTbNamaUser","roTbPassPengubah","roTbPassBaru",
		"roTbPassBaruConfirm"})
	public void batalClick() {
		clear();
	}
	
	@Command
	@NotifyChange({"roTbNip","roTbNamaUser","roTbPassPengubah","roTbPassBaru",
			"roTbPassBaruConfirm","daftarLogin","currentLogin","currentNip",
			"currentPegawai","currentPengguna","currentPassPengubah",
			"currentPassBaru","currentPassBaruConfirm"})
	public void simpanClick() {
		if(verifikasiData()) {
			DatLogin data = um.getUserByNip(currentNip);
			try {
				data.setPassword(Encrypt.getEncrypted2(currentPassBaru));
			} catch (InvalidKeyException e) {
				getMessageForInvalidKeyError();
				e.printStackTrace();
				return;
			} catch (NoSuchAlgorithmException e) {
				getMessageForNoSuchAlgorithmError();
				e.printStackTrace();
				return;
			} catch (UnsupportedEncodingException e) {
				getMessageForUnsupportedEncodingError();
				e.printStackTrace();
				return;
			} catch (IllegalBlockSizeException e) {
				getMessageForIllegalBlockSizeError();
				e.printStackTrace();
				return;
			} catch (BadPaddingException e) {
				getMessageForBadPaddingError();
				e.printStackTrace();
				return;
			} catch (NoSuchPaddingException e) {
				getMessageForNoSuchPaddingError();
				e.printStackTrace();
				return;
			} catch (InvalidAlgorithmParameterException e) {
				getMessageForInvalidAlgorithmParameterError();
				e.printStackTrace();
				return;
			}
			um.saveOrUpdate(data);
			Clients.showNotification("Data telah disimpan");
			clear();
		}
	}
	
	private boolean verifikasiData() {
		if(currentNip.equals("") || currentNip == null) {
			Clients.showNotification("NIP wajib diisi");
			return false;
		}	
		try {
			if(status == StatusEntry.UBAH_DATA &&
				!Encrypt.getEncrypted2(currentPassPengubah).equals(um.getPassword(currentPengguna))
						&& currentPassPengubah != null) {
				  Clients.showNotification("Password Pengubah salah");
				  return false;
			}
		} catch (InvalidKeyException e) {
			getMessageForInvalidKeyError();
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			getMessageForNoSuchAlgorithmError();
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			getMessageForUnsupportedEncodingError();
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			getMessageForIllegalBlockSizeError();
			e.printStackTrace();
		} catch (BadPaddingException e) {
			getMessageForBadPaddingError();
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			getMessageForNoSuchPaddingError();
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			getMessageForInvalidAlgorithmParameterError();
			e.printStackTrace();
		}
		if(!currentPassBaru.equals(currentPassBaruConfirm)) {
			Clients.showNotification("Password Konfirmasi tidak sama");
			return false;
		}
		String nmLogin = getNamaLoginByNip();
		if(status == StatusEntry.DATA_BARU && (!nmLogin.isEmpty() || nmLogin != null)) {
			Clients.showNotification("Pengguna untuk NIP : " + currentNip + " sudah terdaftar " +
					"dengan nama " + nmLogin);
			return false;
		}
		
		String nipTemp = getNipFromNmLogin();
		if(status == StatusEntry.UBAH_DATA && (!nipTemp.isEmpty() || nipTemp != null)) {
			Clients.showNotification("Nama Pengguna " + currentPengguna + " sudah " +
					"terdaftar milik NIP " + nipTemp);
			return false;
		}
			
		return true;
	}
	
	private String getNamaLoginByNip() {
		DatLogin data = um.getUserByNip(currentNip);
		if(data.getNmLogin().isEmpty()) return null; // data ga ada 
		else return data.getNmLogin();
	}
	
	private String getNipFromNmLogin() {
		String data = um.getNip(currentPengguna);
		if(data.isEmpty() || data == null) return null;
		else return data;
	}
	
	private void getMessageForInvalidKeyError() {
		Clients.showNotification("Kesalahan kunci enkripsi, hubungi developer");
	}
	
	private void getMessageForNoSuchAlgorithmError() {
		Clients.showNotification("Kesalahan algoritma enkripsi, hubungi developer");
	}
	
	private void getMessageForUnsupportedEncodingError() {
		Clients.showNotification("Penkodean enkripsi tidak didukung, hubungi developer");
	}
	
	private void getMessageForIllegalBlockSizeError() {
		Clients.showNotification("Ukuran Blok Enkripsi salah, hubungi developer");
	}
	
	private void getMessageForBadPaddingError() {
		Clients.showNotification("Padding enkripsi rusak, hubungi developer");
	}
	
	private void getMessageForNoSuchPaddingError() {
		Clients.showNotification("Padding enkripsi tidak ada, hubungi developer");
	}
	
	private void getMessageForInvalidAlgorithmParameterError() {
		Clients.showNotification("Kesalahan parameter algoritma enkripsi, hubungi developer");
	}
	
	
	// -- setter and getter

	public String getCurrentNip() {
		return currentNip;
	}

	public void setCurrentNip(String currentNip) {
		this.currentNip = currentNip;
	}

	public String getCurrentPegawai() {
		return currentPegawai;
	}

	public void setCurrentPegawai(String currentPegawai) {
		this.currentPegawai = currentPegawai;
	}

	public boolean isRoTbNip() {
		return roTbNip;
	}

	public void setRoTbNip(boolean roTbNip) {
		this.roTbNip = roTbNip;
	}

	public boolean isRoTbNamaPegawai() {
		return roTbNamaPegawai;
	}

	public void setRoTbNamaPegawai(boolean roTbNamaPegawai) {
		this.roTbNamaPegawai = roTbNamaPegawai;
	}

	public boolean isRoTbPassPengubah() {
		return roTbPassPengubah;
	}

	public void setRoTbPassPengubah(boolean roTbPassPengubah) {
		this.roTbPassPengubah = roTbPassPengubah;
	}

	public boolean isRoTbPassBaru() {
		return roTbPassBaru;
	}

	public void setRoTbPassBaru(boolean roTbPassBaru) {
		this.roTbPassBaru = roTbPassBaru;
	}

	public boolean isRoTbPassBaruConfirm() {
		return roTbPassBaruConfirm;
	}

	public void setRoTbPassBaruConfirm(boolean roTbPassBaruConfirm) {
		this.roTbPassBaruConfirm = roTbPassBaruConfirm;
	}

	public String getCurrentPengguna() {
		return currentPengguna;
	}

	public void setCurrentPengguna(String currentPengguna) {
		this.currentPengguna = currentPengguna;
	}

	public boolean isRoTbNamaUser() {
		return roTbNamaUser;
	}

	public void setRoTbNamaUser(boolean roTbNamaUser) {
		this.roTbNamaUser = roTbNamaUser;
	}

	public String getCurrentPassPengubah() {
		return currentPassPengubah;
	}

	public void setCurrentPassPengubah(String currentPassPengubah) {
		this.currentPassPengubah = currentPassPengubah;
	}

	public String getCurrentPassBaru() {
		return currentPassBaru;
	}

	public void setCurrentPassBaru(String currentPassBaru) {
		this.currentPassBaru = currentPassBaru;
	}

	public String getCurrentPassBaruConfirm() {
		return currentPassBaruConfirm;
	}

	public void setCurrentPassBaruConfirm(String currentPassBaruConfirm) {
		this.currentPassBaruConfirm = currentPassBaruConfirm;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isEnBtnUbah() {
		return enBtnUbah;
	}

	public void setEnBtnUbah(boolean enBtnUbah) {
		this.enBtnUbah = enBtnUbah;
	}

}