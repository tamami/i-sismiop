package lab.aikibo.viewmodel;

import java.util.List;

import lab.aikibo.entity.RefSeksi;
import lab.aikibo.manager.RefSeksiManager;

import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.MouseEvent;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Messagebox;

public class RefKepegawaianPanSeksiVM {
	private String kdSeksi;
	private String nmSeksi;
	private String noSuratSeksi;
	private String kdSurat1;
	private String kdSurat2;
	private RefSeksiManager rsm;
	private List<RefSeksi> daftarRefSeksi;
	private boolean fokusKdSeksi;
	private boolean fokusNmSeksi;
	private boolean fokusNoSuratSeksi;
	private boolean fokusKdSurat1;
	private boolean fokusKdSurat2;
	private boolean aktifBtnSimpan;
	private boolean aktifBtnBatal;
	private boolean aktifBtnKeluar;
	
	@Init
	public void init() {
		rsm = new RefSeksiManager();
		
		setDaftarRefSeksi(rsm.getDaftarSeksi());
		setFokusKdSeksi(true);
		initButton();
	}
	
	private void initButton() {
		aktifBtnSimpan = true;
		aktifBtnBatal = false;
		aktifBtnKeluar = false;
	}
	
	public String getKdSeksi() {
		return kdSeksi;
	}
	
	@NotifyChange({"nmSeksi","fokusNoSuratSeksi"})
	public void setKdSeksi(String kdSeksi) {
		this.kdSeksi = kdSeksi;
		nmSeksi = rsm.getNamaSeksiByKode(kdSeksi);
		if(nmSeksi == null) {
			Messagebox.show("Ingin memasukkan data baru dengan kode " + kdSeksi + " ?", null,
					Messagebox.OK+Messagebox.NO, Messagebox.QUESTION,
					new EventListener<Event>() {
				
						@Override
						public void onEvent(Event event) throws Exception {
							if(Messagebox.ON_OK.equals(event.getName())) {
								setFokusNmSeksi(true);
							} else if(Messagebox.ON_NO.equals(event.getName())) {
								setFokusKdSeksi(true);
							}
						}
			});
		} else {
			Messagebox.show("Ingin mengubah data " + nmSeksi + " ?", null,
					Messagebox.OK+Messagebox.NO, Messagebox.QUESTION,
					new EventListener<Event>() {

						@Override
						public void onEvent(Event event) throws Exception {
							if(Messagebox.ON_OK.equals(event.getName())) {
								setFokusNoSuratSeksi(true);
							} else if(Messagebox.ON_NO.equals(event.getName())) {
								setKdSeksi("");
								setFokusKdSeksi(true);
							}
						}
				
			});
		}
			
	}

	public String getNmSeksi() {
		return nmSeksi;
	}

	public void setNmSeksi(String nmSeksi) {
		this.nmSeksi = nmSeksi;
	}

	public String getNoSuratSeksi() {
		return noSuratSeksi;
	}

	public void setNoSuratSeksi(String noSuratSeksi) {
		this.noSuratSeksi = noSuratSeksi;
	}

	public String getKdSurat1() {
		return kdSurat1;
	}

	public void setKdSurat1(String kdSurat1) {
		this.kdSurat1 = kdSurat1;
	}

	public String getKdSurat2() {
		return kdSurat2;
	}

	@NotifyChange("aktifBtnSimpan")
	public void setKdSurat2(String kdSurat2) {
		this.kdSurat2 = kdSurat2;
		
		aktifBtnSimpan = false;
	}

	public List<RefSeksi> getDaftarRefSeksi() {
		return daftarRefSeksi;
	}

	public void setDaftarRefSeksi(List<RefSeksi> daftarRefSeksi) {
		this.daftarRefSeksi = daftarRefSeksi;
	}

	public boolean isFokusKdSeksi() {
		return fokusKdSeksi;
	}

	public void setFokusKdSeksi(boolean fokusKdSeksi) {
		this.fokusKdSeksi = fokusKdSeksi;
	}

	public boolean isFokusNmSeksi() {
		return fokusNmSeksi;
	}

	public void setFokusNmSeksi(boolean fokusNmSeksi) {
		this.fokusNmSeksi = fokusNmSeksi;
	}

	public boolean isFokusNoSuratSeksi() {
		return fokusNoSuratSeksi;
	}

	public void setFokusNoSuratSeksi(boolean fokusNoSuratSeksi) {
		this.fokusNoSuratSeksi = fokusNoSuratSeksi;
	}

	public boolean isFokusKdSurat1() {
		return fokusKdSurat1;
	}

	public void setFokusKdSurat1(boolean fokusKdSurat1) {
		this.fokusKdSurat1 = fokusKdSurat1;
	}

	public boolean isFokusKdSurat2() {
		return fokusKdSurat2;
	}

	public void setFokusKdSurat2(boolean fokusKdSurat2) {
		this.fokusKdSurat2 = fokusKdSurat2;
	}

	public boolean isAktifBtnSimpan() {
		return aktifBtnSimpan;
	}

	public void setAktifBtnSimpan(boolean aktifBtnSimpan) {
		this.aktifBtnSimpan = aktifBtnSimpan;
	}

	public boolean isAktifBtnBatal() {
		return aktifBtnBatal;
	}

	public void setAktifBtnBatal(boolean aktifBtnBatal) {
		this.aktifBtnBatal = aktifBtnBatal;
	}

	public boolean isAktifBtnKeluar() {
		return aktifBtnKeluar;
	}

	public void setAktifBtnKeluar(boolean aktifBtnKeluar) {
		this.aktifBtnKeluar = aktifBtnKeluar;
	}
}
