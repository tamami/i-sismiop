package lab.aikibo.viewmodel;

import java.util.LinkedList;
import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import lab.aikibo.manager.PembayaranManager;

public class CatatanPembayaranVM {
	
	private String nop;
	private String namaWp;
	private String alamatWp;
	private String alamatOp;
	private List<String> daftarPembayaran;
	private PembayaranManager pembayaranManager;
	
	@Init
	public void init() {
		namaWp = "";
		alamatWp = "";
		alamatOp = "";
		daftarPembayaran = new LinkedList<String>();
		
		pembayaranManager = new PembayaranManager();
	}
	
	@Command
	@NotifyChange({"namaWp", "alamatWp", "alamatOp", "daftarPembayaran"})
	public void cariClick() {
		
	}

	// ---| setter and getter
	
	public String getNop() {
		return nop;
	}

	public void setNop(String nop) {
		this.nop = nop;
	}

	public String getNamaWp() {
		return namaWp;
	}

	public void setNamaWp(String namaWp) {
		this.namaWp = namaWp;
	}

	public String getAlamatWp() {
		return alamatWp;
	}

	public void setAlamatWp(String alamatWp) {
		this.alamatWp = alamatWp;
	}

	public String getAlamatOp() {
		return alamatOp;
	}

	public void setAlamatOp(String alamatOp) {
		this.alamatOp = alamatOp;
	}

	public List<String> getDaftarPembayaran() {
		return daftarPembayaran;
	}

	public void setDaftarPembayaran(List<String> daftarPembayaran) {
		this.daftarPembayaran = daftarPembayaran;
	}	

}
