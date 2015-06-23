package lab.aikibo.entity;

import java.io.Serializable;

public class RefSubSeksi implements Serializable {
	
	private static final long serialVersionUID = -6936127316382511155L;
	private String kdSeksi;
	private String kdSubSeksi;
	private String nmSubSeksi;
	
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

}
