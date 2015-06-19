package lab.aikibo.viewmodel;

import java.util.List;

import lab.aikibo.entity.RefSeksi;
import lab.aikibo.manager.RefSeksiManager;

import org.zkoss.bind.annotation.Command;
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
	private boolean disableNmSeksi;
	private boolean disableNoSuratSeksi;
	private boolean disableKdSurat1;
	private boolean disableKdSurat2;
	private boolean disableBtnSimpan;
	private boolean disableBtnBatal;
	private boolean disableBtnVerifikasi;
	private boolean fokusBtnSimpan;
	private boolean disableKdSeksi;
	private int status;
	
	@Init
	public void init() {
		rsm = new RefSeksiManager();
		
		setDaftarRefSeksi(rsm.getDaftarSeksi());
		setFokusKdSeksi(true);
		initComponent();
	}
	
	private void initComponent() {
		kdSeksi = "";
		nmSeksi = "";
		noSuratSeksi = "";
		kdSurat1 = "";
		kdSurat2 = "";
		setDisableBtnSimpan(true);
		setDisableBtnBatal(false);
		setDisableBtnVerifikasi(false);
		setDisableNmSeksi(true);
		setDisableNoSuratSeksi(true);
		setDisableKdSurat1(true);
		setDisableKdSurat2(true);
	}
	
	@Command
	@NotifyChange({"kdSeksi", "nmSeksi", "fokusNmSeksi", "fokusKdSeksi", "noSuratSeksi", "kdSurat1",
		"kdSurat2", "disableNoSuratSeksi", "disableNmSeksi", "disableKdSurat1", "disableKdSurat2",
		"disableBtnVerifikasi"})
	public void verifikasi() {
		
		if(kdSeksi == null || kdSeksi == "") {
			Messagebox.show("Isikan dulu kode seksinya.");
			fokusKdSeksi = true;
			return;
		}
		
		RefSeksi data = rsm.getDataSeksiByKode(kdSeksi);
		if(data != null) {
			nmSeksi = data.getNmSeksi();
			noSuratSeksi = data.getNoSrtSeksi();
			kdSurat1 = data.getKodeSurat1();
			kdSurat2 = data.getKodeSurat2();
		}
		
		if(nmSeksi == null || nmSeksi == "") {
			Messagebox.show("Ingin memasukkan data baru dengan kode " + kdSeksi + " ?", null,
					Messagebox.OK+Messagebox.NO, Messagebox.QUESTION,
					new EventListener<Event>() {
				
						@Override
						public void onEvent(Event event) throws Exception {
							if(Messagebox.ON_OK.equals(event.getName())) {
								disableNmSeksi = false;
								disableNoSuratSeksi = false;
								disableKdSurat1 = false;
								disableKdSurat2 = false;
								fokusNmSeksi = true;
								disableBtnVerifikasi = true;
							} else if(Messagebox.ON_NO.equals(event.getName())) {
								kdSeksi = "";
								nmSeksi = "";
								noSuratSeksi = "";
								kdSurat1 = "";
								kdSurat2 = "";
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
								disableNmSeksi = false;
								disableNoSuratSeksi = false;
								disableKdSurat1 = false;
								disableKdSurat2 = false;
								fokusNmSeksi = true;
								disableBtnVerifikasi = true;
							} else if(Messagebox.ON_NO.equals(event.getName())) {
								initComponent();
								setFokusKdSeksi(true);
							}
						}
			});
		}
	}
	
	
	@Command
	@NotifyChange({"kdSeksi","nmSeksi","noSuratSeksi","kdSurat1","kdSurat","fokusKdSeksi",
		"daftarRefSeksi","disableNmSeksi","disableNoSuratSeksi","disableKdSurat1","disableKdSurat2",
		"disableBtnVerifikasi","disableBtnSimpan"})
	public void simpan() {
		Messagebox.show("Menyimpan data dengan kode " + kdSeksi + " ?", null,
			Messagebox.YES+Messagebox.NO, Messagebox.QUESTION,
			new EventListener<Event>() {
				@Override
				public void onEvent(Event event) throws Exception {
					if(Messagebox.ON_YES.equals(event.getName())) {
						saveOrUpdate();
						initComponent();
						fokusKdSeksi = true;
					}
					if(Messagebox.ON_NO.equals(event.getName())) {
						fokusKdSeksi = true;
						return;
					}
				}
			}
		);
	}
	
	public void saveOrUpdate() {
		RefSeksi rs = new RefSeksi();
		rs.setKdSeksi(kdSeksi);
		rs.setNmSeksi(nmSeksi);
		rs.setNoSrtSeksi(noSuratSeksi);
		rs.setKodeSurat1(kdSurat1);
		rs.setKodeSurat2(kdSurat2);
		if(rsm.saveOrUpdate(rs)) {
			Messagebox.show("Data telah tersimpan.");
		} else {
			Messagebox.show("Data gagal tersimpan.");
		}
	}
	
	// -- setter and getter
	
	@NotifyChange({"nmSeksi","fokusNoSuratSeksi","noSuratSeksi","kdSurat1","kdSurat2"})
	public String getKdSeksi() {
		return kdSeksi;
	}
	
	
	public void setKdSeksi(String kdSeksi) {
		this.kdSeksi = kdSeksi;	
	}

	public String getNmSeksi() {
		return nmSeksi;
	}

	@NotifyChange({"fokusNmSeksi","fokusNoSuratSeksi"})
	public void setNmSeksi(String nmSeksi) {
		this.nmSeksi = nmSeksi;
		
		if(nmSeksi.equals("")) {
			Messagebox.show("Nama Seksi tidak boleh kosong.", null, Messagebox.OK, 
				Messagebox.EXCLAMATION,
				new EventListener<Event>() {
					@Override
					public void onEvent(Event event) {
						if(Messagebox.ON_OK.equals(event.getName())) {
							fokusNmSeksi = true;
						}
					}
			}
			);
		} else {
			fokusNoSuratSeksi = true;
		}
	}

	public String getNoSuratSeksi() {
		return noSuratSeksi;
	}

	@NotifyChange({"fokusNoSuratSeksi","fokusKdSurat1"})
	public void setNoSuratSeksi(String noSuratSeksi) {
		this.noSuratSeksi = noSuratSeksi;
		
		if(noSuratSeksi.length() != 2) {
			Messagebox.show("Nomor Surat Seksi harus berisi 2 karakter", null, Messagebox.OK,
				Messagebox.EXCLAMATION,
				new EventListener<Event>() {
					@Override
					public void onEvent(Event event) {
						if(Messagebox.ON_OK.equals(event.getName())) {
							fokusNoSuratSeksi = true;
						}
					}
			});
		} else {
			fokusKdSurat1 = true;
		}
	}

	public String getKdSurat1() {
		return kdSurat1;
	}

	@NotifyChange({"fokusKdSurat1","fokusKdSurat2"})
	public void setKdSurat1(String kdSurat1) {
		this.kdSurat1 = kdSurat1;
		
		if(kdSurat1.equals("")) {
			Messagebox.show("Kode Surat 1 harus diisi", null, Messagebox.OK,
				Messagebox.EXCLAMATION,
				new EventListener<Event>() {
					@Override
					public void onEvent(Event event) {
						if(Messagebox.ON_OK.equals(event.getName())) {
							fokusKdSurat1 = true;
						}
					}
			});
		} else {
			fokusKdSurat2 = true;
		}
	}

	public String getKdSurat2() {
		return kdSurat2;
	}

	@NotifyChange({"disableBtnSimpan","fokusKdSurat2","fokusBtnSimpan"})
	public void setKdSurat2(String kdSurat2) {
		this.kdSurat2 = kdSurat2;
		
		if(kdSurat2.equals("")) {
			Messagebox.show("Kode Surat 2 harus diisi", null, Messagebox.OK,
				Messagebox.EXCLAMATION,
				new EventListener<Event>() {
					@Override
					public void onEvent(Event event) {
						fokusKdSurat2 = true;
					}
			});
		} else {
			setDisableBtnSimpan(false);
			setFokusBtnSimpan(true);
		}
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

	public boolean isAktifBtnBatal() {
		return isDisableBtnBatal();
	}

	public void setAktifBtnBatal(boolean aktifBtnBatal) {
		this.setDisableBtnBatal(aktifBtnBatal);
	}

	public boolean isDisableBtnSimpan() {
		return disableBtnSimpan;
	}

	public void setDisableBtnSimpan(boolean disableBtnSimpan) {
		this.disableBtnSimpan = disableBtnSimpan;
	}

	public boolean isDisableBtnBatal() {
		return disableBtnBatal;
	}

	public void setDisableBtnBatal(boolean disableBtnBatal) {
		this.disableBtnBatal = disableBtnBatal;
	}

	public boolean isFokusBtnSimpan() {
		return fokusBtnSimpan;
	}

	public void setFokusBtnSimpan(boolean fokusBtnSimpan) {
		this.fokusBtnSimpan = fokusBtnSimpan;
	}

	public boolean isDisableKdSeksi() {
		return disableKdSeksi;
	}

	public void setDisableKdSeksi(boolean disableKdSeksi) {
		this.disableKdSeksi = disableKdSeksi;
	}

	public boolean isDisableBtnVerifikasi() {
		return disableBtnVerifikasi;
	}

	public void setDisableBtnVerifikasi(boolean disableBtnVerifikasi) {
		this.disableBtnVerifikasi = disableBtnVerifikasi;
	}

	public boolean isDisableNmSeksi() {
		return disableNmSeksi;
	}

	public void setDisableNmSeksi(boolean disableNmSeksi) {
		this.disableNmSeksi = disableNmSeksi;
	}

	public boolean isDisableNoSuratSeksi() {
		return disableNoSuratSeksi;
	}

	public void setDisableNoSuratSeksi(boolean disableNoSuratSeksi) {
		this.disableNoSuratSeksi = disableNoSuratSeksi;
	}

	public boolean isDisableKdSurat1() {
		return disableKdSurat1;
	}

	public void setDisableKdSurat1(boolean disableKdSurat1) {
		this.disableKdSurat1 = disableKdSurat1;
	}

	public boolean isDisableKdSurat2() {
		return disableKdSurat2;
	}

	public void setDisableKdSurat2(boolean disableKdSurat2) {
		this.disableKdSurat2 = disableKdSurat2;
	}
}
