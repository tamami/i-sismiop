package lab.aikibo.viewmodel;

import java.util.List;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

import lab.aikibo.entity.RefSubSeksi;
import lab.aikibo.manager.RefSeksiManager;
import lab.aikibo.manager.RefSubSeksiManager;

public class RefKepegawaianPanSubSeksiVM {
	
	private String kdSeksi;
	private String kdSubSeksi;
	private String nmSubSeksi;
	private List<RefSubSeksi> daftarSubSeksi;
	private List<String> daftarNamaSeksi;
	private RefSeksiManager rsm;
	private RefSubSeksiManager rssm;
	private RefSubSeksi currentSubSeksi;
	private String currentSeksi;
	private boolean disableKdSeksi;
	private boolean disableKdSubSeksi;
	private boolean disableNmSubSeksi;
	private boolean disableBtnSimpan;
	private boolean focusKdSeksi;
	
	@Init
	@NotifyChange({"kdSeksi","kdSubSeksi","nmSubSeksi","daftarSubSeksi","daftarNamaSeksi",
		"enableBtnSimpan"})
	public void init() {
		rssm = new RefSubSeksiManager();
		setRsm(new RefSeksiManager());
		initComponent();
	}
	
	private void initComponent() {
		kdSeksi = "";
		kdSubSeksi = "";
		nmSubSeksi = "";
		daftarSubSeksi = rssm.getDaftarAll();
		daftarNamaSeksi = rsm.getDaftarNamaSeksi();
		currentSubSeksi = new RefSubSeksi();
		disableBtnSimpan = false;
	}
	
	// setter and getter
	
	public String getKdSeksi() {
		return kdSeksi;
	}
	
	public void setKdSeksi(String kdSeksi) {
		this.kdSeksi = kdSeksi;
	}

	public String getKdSubSeksi() {
		return kdSubSeksi;
	}

	public void setKdSubSeksi(String kdSubSeksi) {
		this.kdSubSeksi = kdSubSeksi;
	}

	public String getNmSubSeksi() {
		return nmSubSeksi;
	}

	public void setNmSubSeksi(String nmSubSeksi) {
		this.nmSubSeksi = nmSubSeksi;
	}

	public List<RefSubSeksi> getDaftarSubSeksi() {
		return daftarSubSeksi;
	}

	public void setDaftarSubSeksi(List<RefSubSeksi> daftarSubSeksi) {
		this.daftarSubSeksi = daftarSubSeksi;
	}

	public RefSubSeksi getCurrentSubSeksi() {
		return currentSubSeksi;
	}

	public void setCurrentSubSeksi(RefSubSeksi currentSubSeksi) {
		this.currentSubSeksi = currentSubSeksi;
	}

	public List<String> getDaftarNamaSeksi() {
		return daftarNamaSeksi;
	}

	public void setDaftarNamaSeksi(List<String> daftarNamaSeksi) {
		this.daftarNamaSeksi = daftarNamaSeksi;
	}

	public RefSeksiManager getRsm() {
		return rsm;
	}

	public void setRsm(RefSeksiManager rsm) {
		this.rsm = rsm;
	}

	public String getCurrentSeksi() {
		return currentSeksi;
	}

	public void setCurrentSeksi(String currentSeksi) {
		this.currentSeksi = currentSeksi;
	}

	public boolean isDisableBtnSimpan() {
		return disableBtnSimpan;
	}

	public void setDisableBtnSimpan(boolean enableBtnSimpan) {
		this.disableBtnSimpan = enableBtnSimpan;
	}

	public boolean isFocusKdSeksi() {
		return focusKdSeksi;
	}

	public void setFocusKdSeksi(boolean focusKdSeksi) {
		this.focusKdSeksi = focusKdSeksi;
	}

	public boolean isDisableKdSubSeksi() {
		return disableKdSubSeksi;
	}

	public void setDisableKdSubSeksi(boolean disableKdSubSeksi) {
		this.disableKdSubSeksi = disableKdSubSeksi;
	}

	public boolean isDisableKdSeksi() {
		return disableKdSeksi;
	}

	public void setDisableKdSeksi(boolean disableKdSeksi) {
		this.disableKdSeksi = disableKdSeksi;
	}

	public boolean isDisableNmSubSeksi() {
		return disableNmSubSeksi;
	}

	public void setDisableNmSubSeksi(boolean disableNmSubSeksi) {
		this.disableNmSubSeksi = disableNmSubSeksi;
	}

}
