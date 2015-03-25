package lab.aikibo.viewmodel;

import org.zkoss.bind.annotation.Init;

public class MenuVM {
	
	private boolean fileMn;
	private boolean admUserMn;
	private boolean bckDbSismiopMn;
	private boolean kalkulatorMn;
	
	private boolean pendataanMn;
	private boolean persiapanMn;
	private boolean pembuatanZntMn;
	private boolean pembuatanTblBlokMn;
	private boolean perubahanNirMn;
	private boolean pembuatanTblPetaZntMn;
	private boolean perubahanZntMassalMn;
	private boolean copyDbkbZntTpSpptMassalThnSebelumMn;
	private boolean pembuatanDbkbMn;
	private boolean dbkbStandardMn;
	private boolean dbkbFasilitasMn;
	private boolean dbkbNonStandardMn;
	private boolean dbkbJpb2Mn;
	private boolean dbkbJpb3Mn;
	private boolean dbkbJpb4Mn;
	private boolean dbkbJpb5Mn;
	private boolean dbkbJpb6Mn;
	private boolean dbkbJpb7Mn;
	private boolean dbkbJpb8AMn;
	private boolean dbkbJpb8BMn;
	private boolean dbkbJpb9Mn;
	private boolean dbkbJpb12Mn;
	private boolean dbkbJpb13Mn;
	private boolean dbkbJpb14Mn;
	private boolean dbkbJpb15Mn;
	private boolean dbkbJpb16Mn;
	private boolean dbkbMezzanin;
	private boolean pendataanOPMn;
	private boolean inputUpdateSpopLspopMn;
	private boolean updatingJlnStandardMn;
	private boolean rencanaPendataanMn;
	private boolean admOpBaruMutasiMn;
	private boolean laporanPendataanOpMn;
	private boolean laporanTblRefMn;
	private boolean laporanDataOpMn;
	private boolean laporanSkKanwilMn;
	private boolean pemekaranWilayahMn;
	private boolean reklasMn;
	private boolean hapusDataSistepMn;
	private boolean zntSistepMn;
	private boolean updateZntMassalMn;
	private boolean cetakRekapDataSistepMn;
	private boolean pemberianFlagNjoptkpMn;
	private boolean updateRtRwMassalMn;
	private boolean daftarFasumMn;
	private boolean daftarOpTnhKosongMn;
	private boolean daftarNilaiIndividuKDSistemMn;
	private boolean dataPendukungSigMn;
	private boolean dataKeluargaMn;
	private boolean dataKartuKreditMn;
	private boolean dataKendaraanMn;
	private boolean dataListrikMn;
	private boolean dataTeleponMn;
	private boolean dataSertifikatImbMn;
	private boolean sinMn;
	private boolean orgPribadiBadanMn;
	private boolean asetNegaraDaerahMn;
	
	private boolean penilaianMn;
	private boolean penilaianMassalMn;
	private boolean laporanPenilaianMn;
	
	private boolean penetapanMn;
	private boolean settingPencetakanMn;
	private boolean pbbMinimalMn;
	private boolean tempatPembayaranElektronikMn;
	private boolean penetapanPencetakanMassalMn;
	private boolean salinanMassalMn;
	private boolean rekamTransaksiJBMn;
	private boolean penetapanPencetakanSeleksiMn;
	private boolean informasiSpptSkpMn;
	private boolean infoRelasiOpDanSpMn;
	private boolean infoRinciSpptMn;
	private boolean infoRinciSkpSpopMn;
	private boolean infoRinciSkpKBMn;
	private boolean daftarPbbLebihKurangBayarMn;
	private boolean perubahanSpptSkpMn;
	private boolean pembetulanSpptSkpMn;
	private boolean inputSkPembetulanMn;
	private boolean prosesSkPembetulanMn;
	private boolean inputSkPembetulanKolektifMn;
	private boolean prosesSkPembetulanKolektifMn;
	private boolean pembetulanJabatanMn;
	private boolean prosesPembetulanJabatanMn;
	private boolean pembatalanSpptSkpMn;
	private boolean inputSkPembatalanMn;
	private boolean prosesSkPembatalanMn;
	private boolean inputSkPembatalanKolektifMn;
	private boolean prosesSkPembatalanKolektifMn;
	private boolean penundaanJatuhTempoMn;
	private boolean laporanDistribusiOpMn;
	private boolean opPerJpbMn;
	private boolean opPerKelasMn;
	private boolean perbandinganKelasPerDesaMn;
	private boolean opPerGroupMn;
	private boolean laporanHimpunanKetetapanPbbNjopMn;
	private boolean tandaTerimaSpptSkpStpMn;
	private boolean simulasiPenetapanMassalMn;
	
	private boolean penguranganMn;
	private boolean inputDataPenguranganMn;
	private boolean cetakSkPenguranganMn;
	private boolean bukuPenjagaanPenguranganMn;
	
	private boolean keberatanMn;
	private boolean penyelesaianKeberatanMn;
	private boolean inputSkKeberatanMn;
	private boolean cetakSkKeberatanMn;
	private boolean pembetulanSkKeberatanMn;
	private boolean inputPembetulanSkKeberatanMn;
	private boolean cetakPembetulanSkKeberatanMn;
	private boolean himpunanSkKeberatanMn;
	
	private boolean pembayaranMn;
	private boolean pencatatanPenerimaanMn;
	private boolean pencatatanPembayaranMn;
	private boolean catatTunggalMn;
	private boolean catatMassalMn;
	private boolean catatSspMn;
	private boolean cabutCetakSitaMn;
	private boolean batalLelangMn;
	private boolean laporanPembayaranMn;
	private boolean suketByrEMn;
	private boolean inputNopMn;
	private boolean pilihNopMn;
	
	private boolean penerimaanMn;
	private boolean inputPrognosaSemesterDuaMn;
	private boolean laporanPenerimaanMn;
	private boolean laporanRealisasiMn;
	private boolean restitusiKompensasiMn;
	private boolean inputSkRestitusiKompensasiMn;
	private boolean inputSuratPemberitaanMn;
	private boolean inputRestitusiKompensasiMn;
	private boolean inputSuratPencabutanSPMMn;
	private boolean laporanTriwulanRestitusiKompensasiMn;
	private boolean laporanEvaluasiMn;
	
	private boolean penagihanMn;
	private boolean daftarTunggakanMn;
	private boolean pengeluaranHimbauanMn;
	private boolean penerbitanStpMn;
	private boolean pembuatanDppStpMn;
	private boolean cetakStpMn;
	private boolean pembetulanStpMn;
	private boolean penerbitanTeguranMn;
	private boolean cetakDaftarStpMn;
	private boolean cetakTeguranMn;
	private boolean penerbitanPaksaMn;
	private boolean penyitaanMn;
	private boolean pembuatanSpmpMn;
	private boolean cabutBapSitaMn;
	private boolean pemberitahuanSitaMn;
	private boolean catatJadwalLelangMn;
	private boolean sppSekaligusMn;
	private boolean daftarPengawasanTindakanMn;
	private boolean laporanPenagihanMn;
	private boolean penghapusanPiutangMn;
	private boolean penyusunanDpMn;
	private boolean pembuatanDuppMn;
	private boolean catatSkSalinanMn;
	private boolean daftarTagihanTakSampaiMn;
	private boolean spptTidakSampaiMn;
	private boolean laporanTidakSampaiMn;
	private boolean catatTandaTerimaPenagihanMn;
	private boolean laporanOpTunggakanMn;
	
	private boolean pelayananMn;
	private boolean inputDataPermohonanMn;
	private boolean penyelesaianBerkasMn;
	private boolean penyerahanBerkasSelesaiMn;
	private boolean cetakSerahTerimaMn;
	private boolean lampSerahTerimaMn;
	private boolean cetakTandaTerimaMn;
	private boolean alurBerkasMn;
	private boolean rekamKirimBerkasMn;
	private boolean rekamTerimaBerkasMn;
	private boolean monitoringPelayananMn;
	private boolean monitoringBerkasMn;
	private boolean monitoringStatusBerkasMn;
	private boolean cetakFileKeluaranMn;
	private boolean parameterKeluaranMn;
	
	private boolean referensiMn;
	private boolean wilayahMn;
	private boolean kepegawaianMn;
	private boolean tempatPembayaranMn;
	private boolean tempatBayarMassalMn;
	private boolean resourceMn;
	private boolean hargaResourceMn;
	private boolean laporanResourceMn;
	private boolean kayuUlinMn;
	private boolean bukuNjoptkpTarifMn;
	private boolean penerimaMn;
	private boolean kantorLelangMn;
	private boolean pengaturanMenuMn;
	private boolean kodeMapMn;
	private boolean refUmumMn;
	
	private boolean lihatMn;
	private boolean dataOpMn;
	private boolean daftarSpopMn;
	private boolean daftarRingkasMn;
	private boolean daftarKeringananPermanenMn;
	private boolean daftarObjekBersamaMn;
	private boolean daftarNilaiIndividuMn;
	private boolean catatBayarMn;
	private boolean catatSejarahWpMn;
	private boolean catatSejarahOpMn;
	private boolean rekapOpMn;
	private boolean opPenguranganStimulusMn;
	private boolean opTanpaPetaMn;
	private boolean opTerhapusMn;
	private boolean opSinMn;
	private boolean berkasPstMn;
	private boolean pstBelumSelesaiMn;
	private boolean alurBerkasPstMn;
	private boolean detailAlurBerkasPstMn;
	private boolean tabelMn;
	private boolean pemakaiMn;
	private boolean kelasTanahMn;
	private boolean kelasBangunanMn;
	private boolean zntMn;
	private boolean volumePekerjaanMn;
	private boolean unitPekerjaanMn;
	private boolean penyesuaianDbkbMn;
	private boolean jalanStandardMn;
	private boolean tabelWilayahMn;
	private boolean tabelTempatPembayaranMn;
	private boolean suratKeputusanMn;
	private boolean penetapanPenerimaanMn;
	private boolean tagihanTidakSampaiMn;
	private boolean daftarTeguranMn;
	private boolean daftarPenerimaanMn;
	private boolean tunggakanMn;
	private boolean kinerjaOrganisasiMn;
	private boolean kinerjaMn;
	private boolean kinerjaPelayananMn;
	private boolean rinciPendataanLapanganMn;
	private boolean rinciRekamDataMn;
	private boolean rinciRekamSttsMn;
	private boolean rinciRekamTandaTerimaSpptMn;
	private boolean daftarPerubahanMn;
	private boolean perubahanOpMn;
	private boolean perubahanZntMn;
	private boolean perubahanSpptMn;
	private boolean sejarahOpMn;
	private boolean sejarahOp2Mn;
	private boolean sejarahSpptMn;
	private boolean nomorPelayananMn;
	private boolean nopTerbesarMn;
	private boolean nopTerbesarPelayananMn;
	private boolean perubahanNopMn;
	
	
	@Init
	public void init() {
		setAllTrue();
	}
	
	private void setAllTrue() {
		setFileMn(true);
		setAdmUserMn(true);
		setBckDbSismiopMn(true);
		setKalkulatorMn(true);
		
		setPendataanMn(true);
		setPersiapanMn(true);
		setPembuatanZntMn(true);
		setPembuatanTblBlokMn(true);
		setPerubahanNirMn(true);
		setPembuatanTblPetaZntMn(true);
		setPerubahanZntMassalMn(true);
		setCopyDbkbZntTpSpptMassalThnSebelumMn(true);
		setPembuatanDbkbMn(true);
		dbkbStandardMn = true;
		dbkbFasilitasMn = true;
		dbkbNonStandardMn = true;
		dbkbJpb2Mn = true;
		dbkbJpb3Mn = true;
		dbkbJpb4Mn = true;
		dbkbJpb5Mn = true;
		dbkbJpb6Mn = true;
		dbkbJpb7Mn = true;
		dbkbJpb8AMn = true;
		dbkbJpb8BMn = true;
		dbkbJpb9Mn = true;
		dbkbJpb12Mn = true;
		dbkbJpb13Mn = true;
		dbkbJpb14Mn = true;
		dbkbJpb15Mn = true;
		dbkbJpb16Mn = true;
		dbkbMezzanin = true;
		pendataanOPMn = true;
		inputUpdateSpopLspopMn = true;
		updatingJlnStandardMn = true;
		rencanaPendataanMn = true;
		admOpBaruMutasiMn = true;
		laporanPendataanOpMn = true;
		laporanTblRefMn = true;
		laporanDataOpMn = true;
		laporanSkKanwilMn = true;
		pemekaranWilayahMn = true;
		reklasMn = true;
		hapusDataSistepMn = true;
		zntSistepMn = true;
		updateZntMassalMn = true;
		cetakRekapDataSistepMn = true;
		pemberianFlagNjoptkpMn = true;
		updateRtRwMassalMn = true;
		daftarFasumMn = true;
		daftarOpTnhKosongMn = true;
		daftarNilaiIndividuKDSistemMn = true;
		dataPendukungSigMn = true;
		dataKeluargaMn = true;
		dataKartuKreditMn = true;
		dataKendaraanMn = true;
		dataListrikMn = true;
		dataTeleponMn = true;
		dataSertifikatImbMn = true;
		sinMn = true;
		orgPribadiBadanMn = true;
		asetNegaraDaerahMn = true;
		
		penilaianMn = true;
		penilaianMassalMn = true;
		laporanPenilaianMn = true;
		
		penetapanMn = true;
		settingPencetakanMn = true;
		pbbMinimalMn = true;
		tempatPembayaranElektronikMn = true;
		penetapanPencetakanMassalMn = true;
		salinanMassalMn = true;
		rekamTransaksiJBMn = true;
		penetapanPencetakanSeleksiMn = true;
		informasiSpptSkpMn = true;
		infoRelasiOpDanSpMn = true;
		infoRinciSpptMn = true;
		infoRinciSkpSpopMn = true;
		infoRinciSkpKBMn = true;
		daftarPbbLebihKurangBayarMn = true;
		perubahanSpptSkpMn = true;
		pembetulanSpptSkpMn = true;
		inputSkPembetulanMn = true;
		prosesSkPembetulanMn = true;
		inputSkPembetulanKolektifMn = true;
		prosesSkPembetulanKolektifMn = true;
		pembetulanJabatanMn = true;
		prosesPembetulanJabatanMn = true;
		pembatalanSpptSkpMn = true;
		inputSkPembatalanMn = true;
		prosesSkPembatalanMn = true;
		inputSkPembatalanKolektifMn = true;
		prosesSkPembatalanKolektifMn = true;
		penundaanJatuhTempoMn = true;
		laporanDistribusiOpMn = true;
		opPerJpbMn = true;
		opPerKelasMn = true;
		perbandinganKelasPerDesaMn = true;
		opPerGroupMn = true;
		laporanHimpunanKetetapanPbbNjopMn = true;
		tandaTerimaSpptSkpStpMn = true;
		simulasiPenetapanMassalMn = true;
		
		penguranganMn = true;
		inputDataPenguranganMn = true;
		cetakSkPenguranganMn = true;
		bukuPenjagaanPenguranganMn = true;
		
		keberatanMn = true;
		penyelesaianKeberatanMn = true;
		inputSkKeberatanMn = true;
		cetakSkKeberatanMn = true;
		pembetulanSkKeberatanMn = true;
		inputPembetulanSkKeberatanMn = true;
		cetakPembetulanSkKeberatanMn = true;
		himpunanSkKeberatanMn = true;
		
		pembayaranMn = true;
		pencatatanPenerimaanMn = true;
		pencatatanPembayaranMn = true;
		catatTunggalMn = true;
		catatMassalMn = true;
		catatSspMn = true;
		cabutCetakSitaMn = true;
		batalLelangMn = true;
		laporanPembayaranMn = true;
		suketByrEMn = true;
		inputNopMn = true;
		pilihNopMn = true;
		
		penerimaanMn = true;
		inputPrognosaSemesterDuaMn = true;
		laporanPenerimaanMn = true;
		laporanRealisasiMn = true;
		restitusiKompensasiMn = true;
		inputSkRestitusiKompensasiMn = true;
		inputSuratPemberitaanMn = true;
		inputRestitusiKompensasiMn = true;
		inputSuratPencabutanSPMMn = true;
		laporanTriwulanRestitusiKompensasiMn = true;
		laporanEvaluasiMn = true;
		
		penagihanMn = true;
		daftarTunggakanMn = true;
		pengeluaranHimbauanMn = true;
		penerbitanStpMn = true;
		pembuatanDppStpMn = true;
		cetakStpMn = true;
		pembetulanStpMn = true;
		penerbitanTeguranMn = true;
		cetakDaftarStpMn = true;
		cetakTeguranMn = true;
		penerbitanPaksaMn = true;
		penyitaanMn = true;
		pembuatanSpmpMn = true;
		cabutBapSitaMn = true;
		pemberitahuanSitaMn = true;
		catatJadwalLelangMn = true;
		sppSekaligusMn = true;
		daftarPengawasanTindakanMn = true;
		laporanPenagihanMn = true;
		penghapusanPiutangMn = true;
		penyusunanDpMn = true;
		pembuatanDuppMn = true;
		catatSkSalinanMn = true;
		daftarTagihanTakSampaiMn = true;
		spptTidakSampaiMn = true;
		laporanTidakSampaiMn = true;
		catatTandaTerimaPenagihanMn = true;
		laporanOpTunggakanMn = true;
		
		pelayananMn = true;
		inputDataPermohonanMn = true;
		penyelesaianBerkasMn = true;
		penyerahanBerkasSelesaiMn = true;
		cetakSerahTerimaMn = true;
		lampSerahTerimaMn = true;
		cetakTandaTerimaMn = true;
		alurBerkasMn = true;
		rekamKirimBerkasMn = true;
		rekamTerimaBerkasMn = true;
		monitoringPelayananMn = true;
		monitoringBerkasMn = true;
		monitoringStatusBerkasMn = true;
		cetakFileKeluaranMn = true;
		parameterKeluaranMn = true;
		
		referensiMn = true;
		wilayahMn = true;
		kepegawaianMn = true;
		tempatPembayaranMn = true;
		tempatBayarMassalMn = true;
		resourceMn = true;
		hargaResourceMn = true;
		laporanResourceMn = true;
		kayuUlinMn = true;
		bukuNjoptkpTarifMn = true;
		penerimaanMn = true;
		kantorLelangMn = true;
		pengaturanMenuMn = true;
		kodeMapMn = true;
		refUmumMn = true;
		
		lihatMn = true;
		dataOpMn = true;
		daftarSpopMn = true;
		daftarRingkasMn = true;
		daftarKeringananPermanenMn = true;
		daftarObjekBersamaMn = true;
		daftarNilaiIndividuMn = true;
		catatBayarMn = true;
		catatSejarahWpMn = true;
		catatSejarahOpMn = true;
		rekapOpMn = true;
		opPenguranganStimulusMn = true;
		opTanpaPetaMn = true;
		opTerhapusMn = true;
		opSinMn = true;
		berkasPstMn = true;
		pstBelumSelesaiMn = true;
		alurBerkasPstMn = true;
		detailAlurBerkasPstMn = true;
		tabelMn = true;
		pemakaiMn = true;
		kelasTanahMn = true;
		kelasBangunanMn = true;
		zntMn = true;
		volumePekerjaanMn = true;
		unitPekerjaanMn = true;
		penyesuaianDbkbMn = true;
		jalanStandardMn = true;
		tabelWilayahMn = true;
		tabelTempatPembayaranMn = true;
		suratKeputusanMn = true;
		penetapanPenerimaanMn = true;
		tagihanTidakSampaiMn = true;
		daftarTeguranMn = true;
		daftarPenerimaanMn = true;
		tunggakanMn = true;
		kinerjaOrganisasiMn = true;
		kinerjaMn = true;
		kinerjaPelayananMn = true;
		rinciPendataanLapanganMn = true;
		rinciRekamDataMn = true;
		rinciRekamSttsMn = true;
		rinciRekamTandaTerimaSpptMn = true;
		daftarPerubahanMn = true;
		perubahanOpMn = true;
		perubahanZntMn = true;
		perubahanSpptMn = true;
		sejarahOpMn = true;
		sejarahOp2Mn = true;
		sejarahSpptMn = true;
		nomorPelayananMn = true;
		nopTerbesarMn = true;
		nopTerbesarPelayananMn = true;
		perubahanNopMn = true;
	}

	public boolean isFileMn() {
		return fileMn;
	}

	public void setFileMn(boolean fileMn) {
		this.fileMn = fileMn;
	}

	public boolean isAdmUserMn() {
		return admUserMn;
	}

	public void setAdmUserMn(boolean admUserMn) {
		this.admUserMn = admUserMn;
	}

	public boolean isBckDbSismiopMn() {
		return bckDbSismiopMn;
	}

	public void setBckDbSismiopMn(boolean bckDbSismiopMn) {
		this.bckDbSismiopMn = bckDbSismiopMn;
	}

	public boolean isKalkulatorMn() {
		return kalkulatorMn;
	}

	public void setKalkulatorMn(boolean kalkulatorMn) {
		this.kalkulatorMn = kalkulatorMn;
	}

	public boolean isPendataanMn() {
		return pendataanMn;
	}

	public void setPendataanMn(boolean pendataanMn) {
		this.pendataanMn = pendataanMn;
	}

	public boolean isPersiapanMn() {
		return persiapanMn;
	}

	public void setPersiapanMn(boolean persiapanMn) {
		this.persiapanMn = persiapanMn;
	}

	public boolean isPembuatanZntMn() {
		return pembuatanZntMn;
	}

	public void setPembuatanZntMn(boolean pembuatanZntMn) {
		this.pembuatanZntMn = pembuatanZntMn;
	}

	public boolean isPembuatanTblBlokMn() {
		return pembuatanTblBlokMn;
	}

	public void setPembuatanTblBlokMn(boolean pembuatanTblBlokMn) {
		this.pembuatanTblBlokMn = pembuatanTblBlokMn;
	}

	public boolean isPerubahanNirMn() {
		return perubahanNirMn;
	}

	public void setPerubahanNirMn(boolean perubahanNirMn) {
		this.perubahanNirMn = perubahanNirMn;
	}

	public boolean isPembuatanTblPetaZntMn() {
		return pembuatanTblPetaZntMn;
	}

	public void setPembuatanTblPetaZntMn(boolean pembuatanTblPetaZntMn) {
		this.pembuatanTblPetaZntMn = pembuatanTblPetaZntMn;
	}

	public boolean isPerubahanZntMassalMn() {
		return perubahanZntMassalMn;
	}

	public void setPerubahanZntMassalMn(boolean perubahanZntMassalMn) {
		this.perubahanZntMassalMn = perubahanZntMassalMn;
	}

	public boolean isCopyDbkbZntTpSpptMassalThnSebelumMn() {
		return copyDbkbZntTpSpptMassalThnSebelumMn;
	}

	public void setCopyDbkbZntTpSpptMassalThnSebelumMn(
			boolean copyDbkbZntTpSpptMassalThnSebelumMn) {
		this.copyDbkbZntTpSpptMassalThnSebelumMn = copyDbkbZntTpSpptMassalThnSebelumMn;
	}

	public boolean isPembuatanDbkbMn() {
		return pembuatanDbkbMn;
	}

	public void setPembuatanDbkbMn(boolean pembuatanDbkbMn) {
		this.pembuatanDbkbMn = pembuatanDbkbMn;
	}

	public boolean isDbkbStandardMn() {
		return dbkbStandardMn;
	}

	public void setDbkbStandardMn(boolean dbkbStandardMn) {
		this.dbkbStandardMn = dbkbStandardMn;
	}

	public boolean isDbkbFasilitasMn() {
		return dbkbFasilitasMn;
	}

	public void setDbkbFasilitasMn(boolean dbkbFasilitasMn) {
		this.dbkbFasilitasMn = dbkbFasilitasMn;
	}

	public boolean isDbkbNonStandardMn() {
		return dbkbNonStandardMn;
	}

	public void setDbkbNonStandardMn(boolean dbkbNonStandardMn) {
		this.dbkbNonStandardMn = dbkbNonStandardMn;
	}

	public boolean isDbkbJpb2Mn() {
		return dbkbJpb2Mn;
	}

	public void setDbkbJpb2Mn(boolean dbkbJpb2Mn) {
		this.dbkbJpb2Mn = dbkbJpb2Mn;
	}

	public boolean isDbkbJpb3Mn() {
		return dbkbJpb3Mn;
	}

	public void setDbkbJpb3Mn(boolean dbkbJpb3Mn) {
		this.dbkbJpb3Mn = dbkbJpb3Mn;
	}

	public boolean isDbkbJpb4Mn() {
		return dbkbJpb4Mn;
	}

	public void setDbkbJpb4Mn(boolean dbkbJpb4Mn) {
		this.dbkbJpb4Mn = dbkbJpb4Mn;
	}

	public boolean isDbkbJpb5Mn() {
		return dbkbJpb5Mn;
	}

	public void setDbkbJpb5Mn(boolean dbkbJpb5Mn) {
		this.dbkbJpb5Mn = dbkbJpb5Mn;
	}

	public boolean isDbkbJpb6Mn() {
		return dbkbJpb6Mn;
	}

	public void setDbkbJpb6Mn(boolean dbkbJpb6Mn) {
		this.dbkbJpb6Mn = dbkbJpb6Mn;
	}

	public boolean isDbkbJpb7Mn() {
		return dbkbJpb7Mn;
	}

	public void setDbkbJpb7Mn(boolean dbkbJpb7Mn) {
		this.dbkbJpb7Mn = dbkbJpb7Mn;
	}

	public boolean isDbkbJpb8AMn() {
		return dbkbJpb8AMn;
	}

	public void setDbkbJpb8AMn(boolean dbkbJpb8AMn) {
		this.dbkbJpb8AMn = dbkbJpb8AMn;
	}

	public boolean isDbkbJpb8BMn() {
		return dbkbJpb8BMn;
	}

	public void setDbkbJpb8BMn(boolean dbkbJpb8BMn) {
		this.dbkbJpb8BMn = dbkbJpb8BMn;
	}

	public boolean isDbkbJpb9Mn() {
		return dbkbJpb9Mn;
	}

	public void setDbkbJpb9Mn(boolean dbkbJpb9Mn) {
		this.dbkbJpb9Mn = dbkbJpb9Mn;
	}

	public boolean isDbkbJpb12Mn() {
		return dbkbJpb12Mn;
	}

	public void setDbkbJpb12Mn(boolean dbkbJpb12Mn) {
		this.dbkbJpb12Mn = dbkbJpb12Mn;
	}

	public boolean isDbkbJpb13Mn() {
		return dbkbJpb13Mn;
	}

	public void setDbkbJpb13Mn(boolean dbkbJpb13Mn) {
		this.dbkbJpb13Mn = dbkbJpb13Mn;
	}

	public boolean isDbkbJpb14Mn() {
		return dbkbJpb14Mn;
	}

	public void setDbkbJpb14Mn(boolean dbkbJpb14Mn) {
		this.dbkbJpb14Mn = dbkbJpb14Mn;
	}

	public boolean isDbkbJpb15Mn() {
		return dbkbJpb15Mn;
	}

	public void setDbkbJpb15Mn(boolean dbkbJpb15Mn) {
		this.dbkbJpb15Mn = dbkbJpb15Mn;
	}

	public boolean isDbkbJpb16Mn() {
		return dbkbJpb16Mn;
	}

	public void setDbkbJpb16Mn(boolean dbkbJpb16Mn) {
		this.dbkbJpb16Mn = dbkbJpb16Mn;
	}

	public boolean isDbkbMezzanin() {
		return dbkbMezzanin;
	}

	public void setDbkbMezzanin(boolean dbkbMezzanin) {
		this.dbkbMezzanin = dbkbMezzanin;
	}

	public boolean isPendataanOPMn() {
		return pendataanOPMn;
	}

	public void setPendataanOPMn(boolean pendataanOPMn) {
		this.pendataanOPMn = pendataanOPMn;
	}

	public boolean isInputUpdateSpopLspopMn() {
		return inputUpdateSpopLspopMn;
	}

	public void setInputUpdateSpopLspopMn(boolean inputUpdateSpopLspopMn) {
		this.inputUpdateSpopLspopMn = inputUpdateSpopLspopMn;
	}

	public boolean isUpdatingJlnStandardMn() {
		return updatingJlnStandardMn;
	}

	public void setUpdatingJlnStandardMn(boolean updatingJlnStandardMn) {
		this.updatingJlnStandardMn = updatingJlnStandardMn;
	}

	public boolean isRencanaPendataanMn() {
		return rencanaPendataanMn;
	}

	public void setRencanaPendataanMn(boolean rencanaPendataanMn) {
		this.rencanaPendataanMn = rencanaPendataanMn;
	}

	public boolean isAdmOpBaruMutasiMn() {
		return admOpBaruMutasiMn;
	}

	public void setAdmOpBaruMutasiMn(boolean admOpBaruMutasiMn) {
		this.admOpBaruMutasiMn = admOpBaruMutasiMn;
	}

	public boolean isLaporanPendataanOpMn() {
		return laporanPendataanOpMn;
	}

	public void setLaporanPendataanOpMn(boolean laporanPendataanOpMn) {
		this.laporanPendataanOpMn = laporanPendataanOpMn;
	}

	public boolean isLaporanTblRefMn() {
		return laporanTblRefMn;
	}

	public void setLaporanTblRefMn(boolean laporanTblRefMn) {
		this.laporanTblRefMn = laporanTblRefMn;
	}

	public boolean isLaporanDataOpMn() {
		return laporanDataOpMn;
	}

	public void setLaporanDataOpMn(boolean laporanDataOpMn) {
		this.laporanDataOpMn = laporanDataOpMn;
	}

	public boolean isLaporanSkKanwilMn() {
		return laporanSkKanwilMn;
	}

	public void setLaporanSkKanwilMn(boolean laporanSkKanwilMn) {
		this.laporanSkKanwilMn = laporanSkKanwilMn;
	}

	public boolean isPemekaranWilayahMn() {
		return pemekaranWilayahMn;
	}

	public void setPemekaranWilayahMn(boolean pemekaranWilayahMn) {
		this.pemekaranWilayahMn = pemekaranWilayahMn;
	}

	public boolean isReklasMn() {
		return reklasMn;
	}

	public void setReklasMn(boolean reklasMn) {
		this.reklasMn = reklasMn;
	}

	public boolean isHapusDataSistepMn() {
		return hapusDataSistepMn;
	}

	public void setHapusDataSistepMn(boolean hapusDataSistepMn) {
		this.hapusDataSistepMn = hapusDataSistepMn;
	}

	public boolean isZntSistepMn() {
		return zntSistepMn;
	}

	public void setZntSistepMn(boolean zntSistepMn) {
		this.zntSistepMn = zntSistepMn;
	}

	public boolean isUpdateZntMassalMn() {
		return updateZntMassalMn;
	}

	public void setUpdateZntMassalMn(boolean updateZntMassalMn) {
		this.updateZntMassalMn = updateZntMassalMn;
	}

	public boolean isCetakRekapDataSistepMn() {
		return cetakRekapDataSistepMn;
	}

	public void setCetakRekapDataSistepMn(boolean cetakRekapDataSistepMn) {
		this.cetakRekapDataSistepMn = cetakRekapDataSistepMn;
	}

	public boolean isPemberianFlagNjoptkpMn() {
		return pemberianFlagNjoptkpMn;
	}

	public void setPemberianFlagNjoptkpMn(boolean pemberianFlagNjoptkpMn) {
		this.pemberianFlagNjoptkpMn = pemberianFlagNjoptkpMn;
	}

	public boolean isUpdateRtRwMassalMn() {
		return updateRtRwMassalMn;
	}

	public void setUpdateRtRwMassalMn(boolean updateRtRwMassalMn) {
		this.updateRtRwMassalMn = updateRtRwMassalMn;
	}

	public boolean isDaftarFasumMn() {
		return daftarFasumMn;
	}

	public void setDaftarFasumMn(boolean daftarFasumMn) {
		this.daftarFasumMn = daftarFasumMn;
	}

	public boolean isDaftarOpTnhKosongMn() {
		return daftarOpTnhKosongMn;
	}

	public void setDaftarOpTnhKosongMn(boolean daftarOpTnhKosongMn) {
		this.daftarOpTnhKosongMn = daftarOpTnhKosongMn;
	}

	public boolean isDaftarNilaiIndividuKDSistemMn() {
		return daftarNilaiIndividuKDSistemMn;
	}

	public void setDaftarNilaiIndividuKDSistemMn(
			boolean daftarNilaiIndividuKDSistemMn) {
		this.daftarNilaiIndividuKDSistemMn = daftarNilaiIndividuKDSistemMn;
	}

	public boolean isDataPendukungSigMn() {
		return dataPendukungSigMn;
	}

	public void setDataPendukungSigMn(boolean dataPendukungSigMn) {
		this.dataPendukungSigMn = dataPendukungSigMn;
	}

	public boolean isDataKeluargaMn() {
		return dataKeluargaMn;
	}

	public void setDataKeluargaMn(boolean dataKeluargaMn) {
		this.dataKeluargaMn = dataKeluargaMn;
	}

	public boolean isDataKartuKreditMn() {
		return dataKartuKreditMn;
	}

	public void setDataKartuKreditMn(boolean dataKartuKreditMn) {
		this.dataKartuKreditMn = dataKartuKreditMn;
	}

	public boolean isDataKendaraanMn() {
		return dataKendaraanMn;
	}

	public void setDataKendaraanMn(boolean dataKendaraanMn) {
		this.dataKendaraanMn = dataKendaraanMn;
	}

	public boolean isDataListrikMn() {
		return dataListrikMn;
	}

	public void setDataListrikMn(boolean dataListrikMn) {
		this.dataListrikMn = dataListrikMn;
	}

	public boolean isDataTeleponMn() {
		return dataTeleponMn;
	}

	public void setDataTeleponMn(boolean dataTeleponMn) {
		this.dataTeleponMn = dataTeleponMn;
	}

	public boolean isDataSertifikatImbMn() {
		return dataSertifikatImbMn;
	}

	public void setDataSertifikatImbMn(boolean dataSertifikatImbMn) {
		this.dataSertifikatImbMn = dataSertifikatImbMn;
	}

	public boolean isSinMn() {
		return sinMn;
	}

	public void setSinMn(boolean sinMn) {
		this.sinMn = sinMn;
	}

	public boolean isOrgPribadiBadanMn() {
		return orgPribadiBadanMn;
	}

	public void setOrgPribadiBadanMn(boolean orgPribadiBadanMn) {
		this.orgPribadiBadanMn = orgPribadiBadanMn;
	}

	public boolean isAsetNegaraDaerahMn() {
		return asetNegaraDaerahMn;
	}

	public void setAsetNegaraDaerahMn(boolean asetNegaraDaerahMn) {
		this.asetNegaraDaerahMn = asetNegaraDaerahMn;
	}

	public boolean isPenilaianMn() {
		return penilaianMn;
	}

	public void setPenilaianMn(boolean penilaianMn) {
		this.penilaianMn = penilaianMn;
	}

	public boolean isPenilaianMassalMn() {
		return penilaianMassalMn;
	}

	public void setPenilaianMassalMn(boolean penilaianMassalMn) {
		this.penilaianMassalMn = penilaianMassalMn;
	}

	public boolean isLaporanPenilaianMn() {
		return laporanPenilaianMn;
	}

	public void setLaporanPenilaianMn(boolean laporanPenilaianMn) {
		this.laporanPenilaianMn = laporanPenilaianMn;
	}

	public boolean isPenetapanMn() {
		return penetapanMn;
	}

	public void setPenetapanMn(boolean penetapanMn) {
		this.penetapanMn = penetapanMn;
	}

	public boolean isSettingPencetakanMn() {
		return settingPencetakanMn;
	}

	public void setSettingPencetakanMn(boolean settingPencetakanMn) {
		this.settingPencetakanMn = settingPencetakanMn;
	}

	public boolean isPbbMinimalMn() {
		return pbbMinimalMn;
	}

	public void setPbbMinimalMn(boolean pbbMinimalMn) {
		this.pbbMinimalMn = pbbMinimalMn;
	}

	public boolean isTempatPembayaranElektronikMn() {
		return tempatPembayaranElektronikMn;
	}

	public void setTempatPembayaranElektronikMn(boolean tempatPembayaranElektronikMn) {
		this.tempatPembayaranElektronikMn = tempatPembayaranElektronikMn;
	}

	public boolean isPenetapanPencetakanMassalMn() {
		return penetapanPencetakanMassalMn;
	}

	public void setPenetapanPencetakanMassalMn(boolean penetapanPencetakanMassalMn) {
		this.penetapanPencetakanMassalMn = penetapanPencetakanMassalMn;
	}

	public boolean isSalinanMassalMn() {
		return salinanMassalMn;
	}

	public void setSalinanMassalMn(boolean salinanMassalMn) {
		this.salinanMassalMn = salinanMassalMn;
	}

	public boolean isRekamTransaksiJBMn() {
		return rekamTransaksiJBMn;
	}

	public void setRekamTransaksiJBMn(boolean rekamTransaksiJBMn) {
		this.rekamTransaksiJBMn = rekamTransaksiJBMn;
	}

	public boolean isPenetapanPencetakanSeleksiMn() {
		return penetapanPencetakanSeleksiMn;
	}

	public void setPenetapanPencetakanSeleksiMn(boolean penetapanPencetakanSeleksiMn) {
		this.penetapanPencetakanSeleksiMn = penetapanPencetakanSeleksiMn;
	}

	public boolean isInformasiSpptSkpMn() {
		return informasiSpptSkpMn;
	}

	public void setInformasiSpptSkpMn(boolean informasiSpptSkpMn) {
		this.informasiSpptSkpMn = informasiSpptSkpMn;
	}

	public boolean isInfoRelasiOpDanSpMn() {
		return infoRelasiOpDanSpMn;
	}

	public void setInfoRelasiOpDanSpMn(boolean infoRelasiOpDanSpMn) {
		this.infoRelasiOpDanSpMn = infoRelasiOpDanSpMn;
	}

	public boolean isInfoRinciSpptMn() {
		return infoRinciSpptMn;
	}

	public void setInfoRinciSpptMn(boolean infoRinciSpptMn) {
		this.infoRinciSpptMn = infoRinciSpptMn;
	}

	public boolean isInfoRinciSkpSpopMn() {
		return infoRinciSkpSpopMn;
	}

	public void setInfoRinciSkpSpopMn(boolean infoRinciSkpSpopMn) {
		this.infoRinciSkpSpopMn = infoRinciSkpSpopMn;
	}

	public boolean isInfoRinciSkpKBMn() {
		return infoRinciSkpKBMn;
	}

	public void setInfoRinciSkpKBMn(boolean infoRinciSkpKBMn) {
		this.infoRinciSkpKBMn = infoRinciSkpKBMn;
	}

	public boolean isDaftarPbbLebihKurangBayarMn() {
		return daftarPbbLebihKurangBayarMn;
	}

	public void setDaftarPbbLebihKurangBayarMn(boolean daftarPbbLebihKurangBayarMn) {
		this.daftarPbbLebihKurangBayarMn = daftarPbbLebihKurangBayarMn;
	}

	public boolean isPerubahanSpptSkpMn() {
		return perubahanSpptSkpMn;
	}

	public void setPerubahanSpptSkpMn(boolean perubahanSpptSkpMn) {
		this.perubahanSpptSkpMn = perubahanSpptSkpMn;
	}

	public boolean isPembetulanSpptSkpMn() {
		return pembetulanSpptSkpMn;
	}

	public void setPembetulanSpptSkpMn(boolean pembetulanSpptSkpMn) {
		this.pembetulanSpptSkpMn = pembetulanSpptSkpMn;
	}

	public boolean isInputSkPembetulanMn() {
		return inputSkPembetulanMn;
	}

	public void setInputSkPembetulanMn(boolean inputSkPembetulanMn) {
		this.inputSkPembetulanMn = inputSkPembetulanMn;
	}

	public boolean isProsesSkPembetulanMn() {
		return prosesSkPembetulanMn;
	}

	public void setProsesSkPembetulanMn(boolean prosesSkPembetulanMn) {
		this.prosesSkPembetulanMn = prosesSkPembetulanMn;
	}

	public boolean isInputSkPembetulanKolektifMn() {
		return inputSkPembetulanKolektifMn;
	}

	public void setInputSkPembetulanKolektifMn(boolean inputSkPembetulanKolektifMn) {
		this.inputSkPembetulanKolektifMn = inputSkPembetulanKolektifMn;
	}

	public boolean isProsesSkPembetulanKolektifMn() {
		return prosesSkPembetulanKolektifMn;
	}

	public void setProsesSkPembetulanKolektifMn(boolean prosesSkPembetulanKolektifMn) {
		this.prosesSkPembetulanKolektifMn = prosesSkPembetulanKolektifMn;
	}

	public boolean isPembetulanJabatanMn() {
		return pembetulanJabatanMn;
	}

	public void setPembetulanJabatanMn(boolean pembetulanJabatanMn) {
		this.pembetulanJabatanMn = pembetulanJabatanMn;
	}

	public boolean isProsesPembetulanJabatanMn() {
		return prosesPembetulanJabatanMn;
	}

	public void setProsesPembetulanJabatanMn(boolean prosesPembetulanJabatanMn) {
		this.prosesPembetulanJabatanMn = prosesPembetulanJabatanMn;
	}

	public boolean isPembatalanSpptSkpMn() {
		return pembatalanSpptSkpMn;
	}

	public void setPembatalanSpptSkpMn(boolean pembatalanSpptSkpMn) {
		this.pembatalanSpptSkpMn = pembatalanSpptSkpMn;
	}

	public boolean isInputSkPembatalanMn() {
		return inputSkPembatalanMn;
	}

	public void setInputSkPembatalanMn(boolean inputSkPembatalanMn) {
		this.inputSkPembatalanMn = inputSkPembatalanMn;
	}

	public boolean isProsesSkPembatalanMn() {
		return prosesSkPembatalanMn;
	}

	public void setProsesSkPembatalanMn(boolean prosesSkPembatalanMn) {
		this.prosesSkPembatalanMn = prosesSkPembatalanMn;
	}

	public boolean isInputSkPembatalanKolektifMn() {
		return inputSkPembatalanKolektifMn;
	}

	public void setInputSkPembatalanKolektifMn(boolean inputSkPembatalanKolektifMn) {
		this.inputSkPembatalanKolektifMn = inputSkPembatalanKolektifMn;
	}

	public boolean isProsesSkPembatalanKolektifMn() {
		return prosesSkPembatalanKolektifMn;
	}

	public void setProsesSkPembatalanKolektifMn(boolean prosesSkPembatalanKolektifMn) {
		this.prosesSkPembatalanKolektifMn = prosesSkPembatalanKolektifMn;
	}

	public boolean isPenundaanJatuhTempoMn() {
		return penundaanJatuhTempoMn;
	}

	public void setPenundaanJatuhTempoMn(boolean penundaanJatuhTempoMn) {
		this.penundaanJatuhTempoMn = penundaanJatuhTempoMn;
	}

	public boolean isLaporanDistribusiOpMn() {
		return laporanDistribusiOpMn;
	}

	public void setLaporanDistribusiOpMn(boolean laporanDistribusiOpMn) {
		this.laporanDistribusiOpMn = laporanDistribusiOpMn;
	}

	public boolean isOpPerJpbMn() {
		return opPerJpbMn;
	}

	public void setOpPerJpbMn(boolean opPerJpbMn) {
		this.opPerJpbMn = opPerJpbMn;
	}

	public boolean isOpPerKelasMn() {
		return opPerKelasMn;
	}

	public void setOpPerKelasMn(boolean opPerKelasMn) {
		this.opPerKelasMn = opPerKelasMn;
	}

	public boolean isPerbandinganKelasPerDesaMn() {
		return perbandinganKelasPerDesaMn;
	}

	public void setPerbandinganKelasPerDesaMn(boolean perbandinganKelasPerDesaMn) {
		this.perbandinganKelasPerDesaMn = perbandinganKelasPerDesaMn;
	}

	public boolean isOpPerGroupMn() {
		return opPerGroupMn;
	}

	public void setOpPerGroupMn(boolean opPerGroupMn) {
		this.opPerGroupMn = opPerGroupMn;
	}

	public boolean isLaporanHimpunanKetetapanPbbNjopMn() {
		return laporanHimpunanKetetapanPbbNjopMn;
	}

	public void setLaporanHimpunanKetetapanPbbNjopMn(
			boolean laporanHimpunanKetetapanPbbNjopMn) {
		this.laporanHimpunanKetetapanPbbNjopMn = laporanHimpunanKetetapanPbbNjopMn;
	}

	public boolean isTandaTerimaSpptSkpStpMn() {
		return tandaTerimaSpptSkpStpMn;
	}

	public void setTandaTerimaSpptSkpStpMn(boolean tandaTerimaSpptSkpStpMn) {
		this.tandaTerimaSpptSkpStpMn = tandaTerimaSpptSkpStpMn;
	}

	public boolean isSimulasiPenetapanMassalMn() {
		return simulasiPenetapanMassalMn;
	}

	public void setSimulasiPenetapanMassalMn(boolean simulasiPenetapanMassalMn) {
		this.simulasiPenetapanMassalMn = simulasiPenetapanMassalMn;
	}

	public boolean isPenguranganMn() {
		return penguranganMn;
	}

	public void setPenguranganMn(boolean penguranganMn) {
		this.penguranganMn = penguranganMn;
	}

	public boolean isInputDataPenguranganMn() {
		return inputDataPenguranganMn;
	}

	public void setInputDataPenguranganMn(boolean inputDataPenguranganMn) {
		this.inputDataPenguranganMn = inputDataPenguranganMn;
	}

	public boolean isCetakSkPenguranganMn() {
		return cetakSkPenguranganMn;
	}

	public void setCetakSkPenguranganMn(boolean cetakSkPenguranganMn) {
		this.cetakSkPenguranganMn = cetakSkPenguranganMn;
	}

	public boolean isBukuPenjagaanPenguranganMn() {
		return bukuPenjagaanPenguranganMn;
	}

	public void setBukuPenjagaanPenguranganMn(boolean bukuPenjagaanPenguranganMn) {
		this.bukuPenjagaanPenguranganMn = bukuPenjagaanPenguranganMn;
	}

	public boolean isKeberatanMn() {
		return keberatanMn;
	}

	public void setKeberatanMn(boolean keberatanMn) {
		this.keberatanMn = keberatanMn;
	}

	public boolean isPenyelesaianKeberatanMn() {
		return penyelesaianKeberatanMn;
	}

	public void setPenyelesaianKeberatanMn(boolean penyelesaianKeberatanMn) {
		this.penyelesaianKeberatanMn = penyelesaianKeberatanMn;
	}

	public boolean isInputSkKeberatanMn() {
		return inputSkKeberatanMn;
	}

	public void setInputSkKeberatanMn(boolean inputSkKeberatanMn) {
		this.inputSkKeberatanMn = inputSkKeberatanMn;
	}

	public boolean isCetakSkKeberatanMn() {
		return cetakSkKeberatanMn;
	}

	public void setCetakSkKeberatanMn(boolean cetakSkKeberatanMn) {
		this.cetakSkKeberatanMn = cetakSkKeberatanMn;
	}

	public boolean isPembetulanSkKeberatanMn() {
		return pembetulanSkKeberatanMn;
	}

	public void setPembetulanSkKeberatanMn(boolean pembetulanSkKeberatanMn) {
		this.pembetulanSkKeberatanMn = pembetulanSkKeberatanMn;
	}

	public boolean isInputPembetulanSkKeberatanMn() {
		return inputPembetulanSkKeberatanMn;
	}

	public void setInputPembetulanSkKeberatanMn(boolean inputPembetulanSkKeberatanMn) {
		this.inputPembetulanSkKeberatanMn = inputPembetulanSkKeberatanMn;
	}

	public boolean isCetakPembetulanSkKeberatanMn() {
		return cetakPembetulanSkKeberatanMn;
	}

	public void setCetakPembetulanSkKeberatanMn(boolean cetakPembetulanSkKeberatanMn) {
		this.cetakPembetulanSkKeberatanMn = cetakPembetulanSkKeberatanMn;
	}

	public boolean isHimpunanSkKeberatanMn() {
		return himpunanSkKeberatanMn;
	}

	public void setHimpunanSkKeberatanMn(boolean himpunanSkKeberatanMn) {
		this.himpunanSkKeberatanMn = himpunanSkKeberatanMn;
	}

	public boolean isPembayaranMn() {
		return pembayaranMn;
	}

	public void setPembayaranMn(boolean pembayaranMn) {
		this.pembayaranMn = pembayaranMn;
	}

	public boolean isPencatatanPenerimaanMn() {
		return pencatatanPenerimaanMn;
	}

	public void setPencatatanPenerimaanMn(boolean pencatatanPenerimaanMn) {
		this.pencatatanPenerimaanMn = pencatatanPenerimaanMn;
	}

	public boolean isPencatatanPembayaranMn() {
		return pencatatanPembayaranMn;
	}

	public void setPencatatanPembayaranMn(boolean pencatatanPembayaranMn) {
		this.pencatatanPembayaranMn = pencatatanPembayaranMn;
	}

	public boolean isCatatTunggalMn() {
		return catatTunggalMn;
	}

	public void setCatatTunggalMn(boolean catatTunggalMn) {
		this.catatTunggalMn = catatTunggalMn;
	}

	public boolean isCatatMassalMn() {
		return catatMassalMn;
	}

	public void setCatatMassalMn(boolean catatMassalMn) {
		this.catatMassalMn = catatMassalMn;
	}

	public boolean isCatatSspMn() {
		return catatSspMn;
	}

	public void setCatatSspMn(boolean catatSspMn) {
		this.catatSspMn = catatSspMn;
	}

	public boolean isCabutCetakSitaMn() {
		return cabutCetakSitaMn;
	}

	public void setCabutCetakSitaMn(boolean cabutCetakSitaMn) {
		this.cabutCetakSitaMn = cabutCetakSitaMn;
	}

	public boolean isBatalLelangMn() {
		return batalLelangMn;
	}

	public void setBatalLelangMn(boolean batalLelangMn) {
		this.batalLelangMn = batalLelangMn;
	}

	public boolean isLaporanPembayaranMn() {
		return laporanPembayaranMn;
	}

	public void setLaporanPembayaranMn(boolean laporanPembayaranMn) {
		this.laporanPembayaranMn = laporanPembayaranMn;
	}

	public boolean isSuketByrEMn() {
		return suketByrEMn;
	}

	public void setSuketByrEMn(boolean suketByrEMn) {
		this.suketByrEMn = suketByrEMn;
	}

	public boolean isInputNopMn() {
		return inputNopMn;
	}

	public void setInputNopMn(boolean inputNopMn) {
		this.inputNopMn = inputNopMn;
	}

	public boolean isPilihNopMn() {
		return pilihNopMn;
	}

	public void setPilihNopMn(boolean pilihNopMn) {
		this.pilihNopMn = pilihNopMn;
	}

	public boolean isPenerimaanMn() {
		return penerimaanMn;
	}

	public void setPenerimaanMn(boolean penerimaanMn) {
		this.penerimaanMn = penerimaanMn;
	}

	public boolean isInputPrognosaSemesterDuaMn() {
		return inputPrognosaSemesterDuaMn;
	}

	public void setInputPrognosaSemesterDuaMn(boolean inputPrognosaSemesterDuaMn) {
		this.inputPrognosaSemesterDuaMn = inputPrognosaSemesterDuaMn;
	}

	public boolean isLaporanPenerimaanMn() {
		return laporanPenerimaanMn;
	}

	public void setLaporanPenerimaanMn(boolean laporanPenerimaanMn) {
		this.laporanPenerimaanMn = laporanPenerimaanMn;
	}

	public boolean isLaporanRealisasiMn() {
		return laporanRealisasiMn;
	}

	public void setLaporanRealisasiMn(boolean laporanRealisasiMn) {
		this.laporanRealisasiMn = laporanRealisasiMn;
	}

	public boolean isRestitusiKompensasiMn() {
		return restitusiKompensasiMn;
	}

	public void setRestitusiKompensasiMn(boolean restitusiKompensasiMn) {
		this.restitusiKompensasiMn = restitusiKompensasiMn;
	}

	public boolean isInputSkRestitusiKompensasiMn() {
		return inputSkRestitusiKompensasiMn;
	}

	public void setInputSkRestitusiKompensasiMn(boolean inputSkRestitusiKompensasiMn) {
		this.inputSkRestitusiKompensasiMn = inputSkRestitusiKompensasiMn;
	}

	public boolean isInputSuratPemberitaanMn() {
		return inputSuratPemberitaanMn;
	}

	public void setInputSuratPemberitaanMn(boolean inputSuratPemberitaanMn) {
		this.inputSuratPemberitaanMn = inputSuratPemberitaanMn;
	}

	public boolean isInputRestitusiKompensasiMn() {
		return inputRestitusiKompensasiMn;
	}

	public void setInputRestitusiKompensasiMn(boolean inputRestitusiKompensasiMn) {
		this.inputRestitusiKompensasiMn = inputRestitusiKompensasiMn;
	}

	public boolean isInputSuratPencabutanSPMMn() {
		return inputSuratPencabutanSPMMn;
	}

	public void setInputSuratPencabutanSPMMn(boolean inputSuratPencabutanSPMMn) {
		this.inputSuratPencabutanSPMMn = inputSuratPencabutanSPMMn;
	}

	public boolean isLaporanTriwulanRestitusiKompensasiMn() {
		return laporanTriwulanRestitusiKompensasiMn;
	}

	public void setLaporanTriwulanRestitusiKompensasiMn(
			boolean laporanTriwulanRestitusiKompensasiMn) {
		this.laporanTriwulanRestitusiKompensasiMn = laporanTriwulanRestitusiKompensasiMn;
	}

	public boolean isLaporanEvaluasiMn() {
		return laporanEvaluasiMn;
	}

	public void setLaporanEvaluasiMn(boolean laporanEvaluasiMn) {
		this.laporanEvaluasiMn = laporanEvaluasiMn;
	}

	public boolean isPenagihanMn() {
		return penagihanMn;
	}

	public void setPenagihanMn(boolean penagihanMn) {
		this.penagihanMn = penagihanMn;
	}

	public boolean isDaftarTunggakanMn() {
		return daftarTunggakanMn;
	}

	public void setDaftarTunggakanMn(boolean daftarTunggakanMn) {
		this.daftarTunggakanMn = daftarTunggakanMn;
	}

	public boolean isPengeluaranHimbauanMn() {
		return pengeluaranHimbauanMn;
	}

	public void setPengeluaranHimbauanMn(boolean pengeluaranHimbauanMn) {
		this.pengeluaranHimbauanMn = pengeluaranHimbauanMn;
	}

	public boolean isPenerbitanStpMn() {
		return penerbitanStpMn;
	}

	public void setPenerbitanStpMn(boolean penerbitanStpMn) {
		this.penerbitanStpMn = penerbitanStpMn;
	}

	public boolean isPembuatanDppStpMn() {
		return pembuatanDppStpMn;
	}

	public void setPembuatanDppStpMn(boolean pembuatanDppStpMn) {
		this.pembuatanDppStpMn = pembuatanDppStpMn;
	}

	public boolean isCetakStpMn() {
		return cetakStpMn;
	}

	public void setCetakStpMn(boolean cetakStpMn) {
		this.cetakStpMn = cetakStpMn;
	}

	public boolean isPembetulanStpMn() {
		return pembetulanStpMn;
	}

	public void setPembetulanStpMn(boolean pembetulanStpMn) {
		this.pembetulanStpMn = pembetulanStpMn;
	}

	public boolean isPenerbitanTeguranMn() {
		return penerbitanTeguranMn;
	}

	public void setPenerbitanTeguranMn(boolean penerbitanTeguranMn) {
		this.penerbitanTeguranMn = penerbitanTeguranMn;
	}

	public boolean isCetakDaftarStpMn() {
		return cetakDaftarStpMn;
	}

	public void setCetakDaftarStpMn(boolean cetakDaftarStpMn) {
		this.cetakDaftarStpMn = cetakDaftarStpMn;
	}

	public boolean isCetakTeguranMn() {
		return cetakTeguranMn;
	}

	public void setCetakTeguranMn(boolean cetakTeguranMn) {
		this.cetakTeguranMn = cetakTeguranMn;
	}

	public boolean isPenerbitanPaksaMn() {
		return penerbitanPaksaMn;
	}

	public void setPenerbitanPaksaMn(boolean penerbitanPaksaMn) {
		this.penerbitanPaksaMn = penerbitanPaksaMn;
	}

	public boolean isPenyitaanMn() {
		return penyitaanMn;
	}

	public void setPenyitaanMn(boolean penyitaanMn) {
		this.penyitaanMn = penyitaanMn;
	}

	public boolean isPembuatanSpmpMn() {
		return pembuatanSpmpMn;
	}

	public void setPembuatanSpmpMn(boolean pembuatanSpmpMn) {
		this.pembuatanSpmpMn = pembuatanSpmpMn;
	}

	public boolean isCabutBapSitaMn() {
		return cabutBapSitaMn;
	}

	public void setCabutBapSitaMn(boolean cabutBapSitaMn) {
		this.cabutBapSitaMn = cabutBapSitaMn;
	}

	public boolean isPemberitahuanSitaMn() {
		return pemberitahuanSitaMn;
	}

	public void setPemberitahuanSitaMn(boolean pemberitahuanSitaMn) {
		this.pemberitahuanSitaMn = pemberitahuanSitaMn;
	}

	public boolean isCatatJadwalLelangMn() {
		return catatJadwalLelangMn;
	}

	public void setCatatJadwalLelangMn(boolean catatJadwalLelangMn) {
		this.catatJadwalLelangMn = catatJadwalLelangMn;
	}

	public boolean isSppSekaligusMn() {
		return sppSekaligusMn;
	}

	public void setSppSekaligusMn(boolean sppSekaligusMn) {
		this.sppSekaligusMn = sppSekaligusMn;
	}

	public boolean isDaftarPengawasanTindakanMn() {
		return daftarPengawasanTindakanMn;
	}

	public void setDaftarPengawasanTindakanMn(boolean daftarPengawasanTindakanMn) {
		this.daftarPengawasanTindakanMn = daftarPengawasanTindakanMn;
	}

	public boolean isLaporanPenagihanMn() {
		return laporanPenagihanMn;
	}

	public void setLaporanPenagihanMn(boolean laporanPenagihanMn) {
		this.laporanPenagihanMn = laporanPenagihanMn;
	}

	public boolean isPenghapusanPiutangMn() {
		return penghapusanPiutangMn;
	}

	public void setPenghapusanPiutangMn(boolean penghapusanPiutangMn) {
		this.penghapusanPiutangMn = penghapusanPiutangMn;
	}

	public boolean isPenyusunanDpMn() {
		return penyusunanDpMn;
	}

	public void setPenyusunanDpMn(boolean penyusunanDpMn) {
		this.penyusunanDpMn = penyusunanDpMn;
	}

	public boolean isPembuatanDuppMn() {
		return pembuatanDuppMn;
	}

	public void setPembuatanDuppMn(boolean pembuatanDuppMn) {
		this.pembuatanDuppMn = pembuatanDuppMn;
	}

	public boolean isCatatSkSalinanMn() {
		return catatSkSalinanMn;
	}

	public void setCatatSkSalinanMn(boolean catatSkSalinanMn) {
		this.catatSkSalinanMn = catatSkSalinanMn;
	}

	public boolean isDaftarTagihanTakSampaiMn() {
		return daftarTagihanTakSampaiMn;
	}

	public void setDaftarTagihanTakSampaiMn(boolean daftarTagihanTakSampaiMn) {
		this.daftarTagihanTakSampaiMn = daftarTagihanTakSampaiMn;
	}

	public boolean isSpptTidakSampaiMn() {
		return spptTidakSampaiMn;
	}

	public void setSpptTidakSampaiMn(boolean spptTidakSampaiMn) {
		this.spptTidakSampaiMn = spptTidakSampaiMn;
	}

	public boolean isLaporanTidakSampaiMn() {
		return laporanTidakSampaiMn;
	}

	public void setLaporanTidakSampaiMn(boolean laporanTidakSampaiMn) {
		this.laporanTidakSampaiMn = laporanTidakSampaiMn;
	}

	public boolean isCatatTandaTerimaPenagihanMn() {
		return catatTandaTerimaPenagihanMn;
	}

	public void setCatatTandaTerimaPenagihanMn(boolean catatTandaTerimaPenagihanMn) {
		this.catatTandaTerimaPenagihanMn = catatTandaTerimaPenagihanMn;
	}

	public boolean isLaporanOpTunggakanMn() {
		return laporanOpTunggakanMn;
	}

	public void setLaporanOpTunggakanMn(boolean laporanOpTunggakanMn) {
		this.laporanOpTunggakanMn = laporanOpTunggakanMn;
	}

	public boolean isPelayananMn() {
		return pelayananMn;
	}

	public void setPelayananMn(boolean pelayananMn) {
		this.pelayananMn = pelayananMn;
	}

	public boolean isInputDataPermohonanMn() {
		return inputDataPermohonanMn;
	}

	public void setInputDataPermohonanMn(boolean inputDataPermohonanMn) {
		this.inputDataPermohonanMn = inputDataPermohonanMn;
	}

	public boolean isPenyelesaianBerkasMn() {
		return penyelesaianBerkasMn;
	}

	public void setPenyelesaianBerkasMn(boolean penyelesaianBerkasMn) {
		this.penyelesaianBerkasMn = penyelesaianBerkasMn;
	}

	public boolean isPenyerahanBerkasSelesaiMn() {
		return penyerahanBerkasSelesaiMn;
	}

	public void setPenyerahanBerkasSelesaiMn(boolean penyerahanBerkasSelesaiMn) {
		this.penyerahanBerkasSelesaiMn = penyerahanBerkasSelesaiMn;
	}

	public boolean isCetakSerahTerimaMn() {
		return cetakSerahTerimaMn;
	}

	public void setCetakSerahTerimaMn(boolean cetakSerahTerimaMn) {
		this.cetakSerahTerimaMn = cetakSerahTerimaMn;
	}

	public boolean isLampSerahTerimaMn() {
		return lampSerahTerimaMn;
	}

	public void setLampSerahTerimaMn(boolean lampSerahTerimaMn) {
		this.lampSerahTerimaMn = lampSerahTerimaMn;
	}

	public boolean isCetakTandaTerimaMn() {
		return cetakTandaTerimaMn;
	}

	public void setCetakTandaTerimaMn(boolean cetakTandaTerimaMn) {
		this.cetakTandaTerimaMn = cetakTandaTerimaMn;
	}

	public boolean isAlurBerkasMn() {
		return alurBerkasMn;
	}

	public void setAlurBerkasMn(boolean alurBerkasMn) {
		this.alurBerkasMn = alurBerkasMn;
	}

	public boolean isRekamKirimBerkasMn() {
		return rekamKirimBerkasMn;
	}

	public void setRekamKirimBerkasMn(boolean rekamKirimBerkasMn) {
		this.rekamKirimBerkasMn = rekamKirimBerkasMn;
	}

	public boolean isRekamTerimaBerkasMn() {
		return rekamTerimaBerkasMn;
	}

	public void setRekamTerimaBerkasMn(boolean rekamTerimaBerkasMn) {
		this.rekamTerimaBerkasMn = rekamTerimaBerkasMn;
	}

	public boolean isMonitoringPelayananMn() {
		return monitoringPelayananMn;
	}

	public void setMonitoringPelayananMn(boolean monitoringPelayananMn) {
		this.monitoringPelayananMn = monitoringPelayananMn;
	}

	public boolean isMonitoringBerkasMn() {
		return monitoringBerkasMn;
	}

	public void setMonitoringBerkasMn(boolean monitoringBerkasMn) {
		this.monitoringBerkasMn = monitoringBerkasMn;
	}

	public boolean isMonitoringStatusBerkasMn() {
		return monitoringStatusBerkasMn;
	}

	public void setMonitoringStatusBerkasMn(boolean monitoringStatusBerkasMn) {
		this.monitoringStatusBerkasMn = monitoringStatusBerkasMn;
	}

	public boolean isCetakFileKeluaranMn() {
		return cetakFileKeluaranMn;
	}

	public void setCetakFileKeluaranMn(boolean cetakFileKeluaranMn) {
		this.cetakFileKeluaranMn = cetakFileKeluaranMn;
	}

	public boolean isParameterKeluaranMn() {
		return parameterKeluaranMn;
	}

	public void setParameterKeluaranMn(boolean parameterKeluaranMn) {
		this.parameterKeluaranMn = parameterKeluaranMn;
	}

	public boolean isReferensiMn() {
		return referensiMn;
	}

	public void setReferensiMn(boolean referensiMn) {
		this.referensiMn = referensiMn;
	}

	public boolean isWilayahMn() {
		return wilayahMn;
	}

	public void setWilayahMn(boolean wilayahMn) {
		this.wilayahMn = wilayahMn;
	}

	public boolean isKepegawaianMn() {
		return kepegawaianMn;
	}

	public void setKepegawaianMn(boolean kepegawaianMn) {
		this.kepegawaianMn = kepegawaianMn;
	}

	public boolean isTempatPembayaranMn() {
		return tempatPembayaranMn;
	}

	public void setTempatPembayaranMn(boolean tempatPembayaranMn) {
		this.tempatPembayaranMn = tempatPembayaranMn;
	}

	public boolean isTempatBayarMassalMn() {
		return tempatBayarMassalMn;
	}

	public void setTempatBayarMassalMn(boolean tempatBayarMassalMn) {
		this.tempatBayarMassalMn = tempatBayarMassalMn;
	}

	public boolean isResourceMn() {
		return resourceMn;
	}

	public void setResourceMn(boolean resourceMn) {
		this.resourceMn = resourceMn;
	}

	public boolean isHargaResourceMn() {
		return hargaResourceMn;
	}

	public void setHargaResourceMn(boolean hargaResourceMn) {
		this.hargaResourceMn = hargaResourceMn;
	}

	public boolean isLaporanResourceMn() {
		return laporanResourceMn;
	}

	public void setLaporanResourceMn(boolean laporanResourceMn) {
		this.laporanResourceMn = laporanResourceMn;
	}

	public boolean isKayuUlinMn() {
		return kayuUlinMn;
	}

	public void setKayuUlinMn(boolean kayuUlinMn) {
		this.kayuUlinMn = kayuUlinMn;
	}

	public boolean isBukuNjoptkpTarifMn() {
		return bukuNjoptkpTarifMn;
	}

	public void setBukuNjoptkpTarifMn(boolean bukuNjoptkpTarifMn) {
		this.bukuNjoptkpTarifMn = bukuNjoptkpTarifMn;
	}

	public boolean isPenerimaMn() {
		return penerimaMn;
	}

	public void setPenerimaMn(boolean penerimaMn) {
		this.penerimaMn = penerimaMn;
	}

	public boolean isKantorLelangMn() {
		return kantorLelangMn;
	}

	public void setKantorLelangMn(boolean kantorLelangMn) {
		this.kantorLelangMn = kantorLelangMn;
	}

	public boolean isPengaturanMenuMn() {
		return pengaturanMenuMn;
	}

	public void setPengaturanMenuMn(boolean pengaturanMenuMn) {
		this.pengaturanMenuMn = pengaturanMenuMn;
	}

	public boolean isKodeMapMn() {
		return kodeMapMn;
	}

	public void setKodeMapMn(boolean kodeMapMn) {
		this.kodeMapMn = kodeMapMn;
	}

	public boolean isRefUmumMn() {
		return refUmumMn;
	}

	public void setRefUmumMn(boolean refUmumMn) {
		this.refUmumMn = refUmumMn;
	}

	public boolean isLihatMn() {
		return lihatMn;
	}

	public void setLihatMn(boolean lihatMn) {
		this.lihatMn = lihatMn;
	}

	public boolean isDataOpMn() {
		return dataOpMn;
	}

	public void setDataOpMn(boolean dataOpMn) {
		this.dataOpMn = dataOpMn;
	}

	public boolean isDaftarSpopMn() {
		return daftarSpopMn;
	}

	public void setDaftarSpopMn(boolean daftarSpopMn) {
		this.daftarSpopMn = daftarSpopMn;
	}

	public boolean isDaftarRingkasMn() {
		return daftarRingkasMn;
	}

	public void setDaftarRingkasMn(boolean daftarRingkasMn) {
		this.daftarRingkasMn = daftarRingkasMn;
	}

	public boolean isDaftarKeringananPermanenMn() {
		return daftarKeringananPermanenMn;
	}

	public void setDaftarKeringananPermanenMn(boolean daftarKeringananPermanenMn) {
		this.daftarKeringananPermanenMn = daftarKeringananPermanenMn;
	}

	public boolean isDaftarObjekBersamaMn() {
		return daftarObjekBersamaMn;
	}

	public void setDaftarObjekBersamaMn(boolean daftarObjekBersamaMn) {
		this.daftarObjekBersamaMn = daftarObjekBersamaMn;
	}

	public boolean isDaftarNilaiIndividuMn() {
		return daftarNilaiIndividuMn;
	}

	public void setDaftarNilaiIndividuMn(boolean daftarNilaiIndividuMn) {
		this.daftarNilaiIndividuMn = daftarNilaiIndividuMn;
	}

	public boolean isCatatBayarMn() {
		return catatBayarMn;
	}

	public void setCatatBayarMn(boolean catatBayarMn) {
		this.catatBayarMn = catatBayarMn;
	}

	public boolean isCatatSejarahWpMn() {
		return catatSejarahWpMn;
	}

	public void setCatatSejarahWpMn(boolean catatSejarahWpMn) {
		this.catatSejarahWpMn = catatSejarahWpMn;
	}

	public boolean isCatatSejarahOpMn() {
		return catatSejarahOpMn;
	}

	public void setCatatSejarahOpMn(boolean catatSejarahOpMn) {
		this.catatSejarahOpMn = catatSejarahOpMn;
	}

	public boolean isRekapOpMn() {
		return rekapOpMn;
	}

	public void setRekapOpMn(boolean rekapOpMn) {
		this.rekapOpMn = rekapOpMn;
	}

	public boolean isOpPenguranganStimulusMn() {
		return opPenguranganStimulusMn;
	}

	public void setOpPenguranganStimulusMn(boolean opPenguranganStimulusMn) {
		this.opPenguranganStimulusMn = opPenguranganStimulusMn;
	}

	public boolean isOpTanpaPetaMn() {
		return opTanpaPetaMn;
	}

	public void setOpTanpaPetaMn(boolean opTanpaPetaMn) {
		this.opTanpaPetaMn = opTanpaPetaMn;
	}

	public boolean isOpTerhapusMn() {
		return opTerhapusMn;
	}

	public void setOpTerhapusMn(boolean opTerhapusMn) {
		this.opTerhapusMn = opTerhapusMn;
	}

	public boolean isOpSinMn() {
		return opSinMn;
	}

	public void setOpSinMn(boolean opSinMn) {
		this.opSinMn = opSinMn;
	}

	public boolean isBerkasPstMn() {
		return berkasPstMn;
	}

	public void setBerkasPstMn(boolean berkasPstMn) {
		this.berkasPstMn = berkasPstMn;
	}

	public boolean isPstBelumSelesaiMn() {
		return pstBelumSelesaiMn;
	}

	public void setPstBelumSelesaiMn(boolean pstBelumSelesaiMn) {
		this.pstBelumSelesaiMn = pstBelumSelesaiMn;
	}

	public boolean isAlurBerkasPstMn() {
		return alurBerkasPstMn;
	}

	public void setAlurBerkasPstMn(boolean alurBerkasPstMn) {
		this.alurBerkasPstMn = alurBerkasPstMn;
	}

	public boolean isDetailAlurBerkasPstMn() {
		return detailAlurBerkasPstMn;
	}

	public void setDetailAlurBerkasPstMn(boolean detailAlurBerkasPstMn) {
		this.detailAlurBerkasPstMn = detailAlurBerkasPstMn;
	}

	public boolean isTabelMn() {
		return tabelMn;
	}

	public void setTabelMn(boolean tabelMn) {
		this.tabelMn = tabelMn;
	}

	public boolean isPemakaiMn() {
		return pemakaiMn;
	}

	public void setPemakaiMn(boolean pemakaiMn) {
		this.pemakaiMn = pemakaiMn;
	}

	public boolean isKelasTanahMn() {
		return kelasTanahMn;
	}

	public void setKelasTanahMn(boolean kelasTanahMn) {
		this.kelasTanahMn = kelasTanahMn;
	}

	public boolean isKelasBangunanMn() {
		return kelasBangunanMn;
	}

	public void setKelasBangunanMn(boolean kelasBangunanMn) {
		this.kelasBangunanMn = kelasBangunanMn;
	}

	public boolean isZntMn() {
		return zntMn;
	}

	public void setZntMn(boolean zntMn) {
		this.zntMn = zntMn;
	}

	public boolean isVolumePekerjaanMn() {
		return volumePekerjaanMn;
	}

	public void setVolumePekerjaanMn(boolean volumePekerjaanMn) {
		this.volumePekerjaanMn = volumePekerjaanMn;
	}

	public boolean isUnitPekerjaanMn() {
		return unitPekerjaanMn;
	}

	public void setUnitPekerjaanMn(boolean unitPekerjaanMn) {
		this.unitPekerjaanMn = unitPekerjaanMn;
	}

	public boolean isPenyesuaianDbkbMn() {
		return penyesuaianDbkbMn;
	}

	public void setPenyesuaianDbkbMn(boolean penyesuaianDbkbMn) {
		this.penyesuaianDbkbMn = penyesuaianDbkbMn;
	}

	public boolean isJalanStandardMn() {
		return jalanStandardMn;
	}

	public void setJalanStandardMn(boolean jalanStandardMn) {
		this.jalanStandardMn = jalanStandardMn;
	}

	public boolean isTabelWilayahMn() {
		return tabelWilayahMn;
	}

	public void setTabelWilayahMn(boolean tabelWilayahMn) {
		this.tabelWilayahMn = tabelWilayahMn;
	}

	public boolean isTabelTempatPembayaranMn() {
		return tabelTempatPembayaranMn;
	}

	public void setTabelTempatPembayaranMn(boolean tabelTempatPembayaranMn) {
		this.tabelTempatPembayaranMn = tabelTempatPembayaranMn;
	}

	public boolean isSuratKeputusanMn() {
		return suratKeputusanMn;
	}

	public void setSuratKeputusanMn(boolean suratKeputusanMn) {
		this.suratKeputusanMn = suratKeputusanMn;
	}

	public boolean isPenetapanPenerimaanMn() {
		return penetapanPenerimaanMn;
	}

	public void setPenetapanPenerimaanMn(boolean penetapanPenerimaanMn) {
		this.penetapanPenerimaanMn = penetapanPenerimaanMn;
	}

	public boolean isTagihanTidakSampaiMn() {
		return tagihanTidakSampaiMn;
	}

	public void setTagihanTidakSampaiMn(boolean tagihanTidakSampaiMn) {
		this.tagihanTidakSampaiMn = tagihanTidakSampaiMn;
	}

	public boolean isDaftarTeguranMn() {
		return daftarTeguranMn;
	}

	public void setDaftarTeguranMn(boolean daftarTeguranMn) {
		this.daftarTeguranMn = daftarTeguranMn;
	}

	public boolean isDaftarPenerimaanMn() {
		return daftarPenerimaanMn;
	}

	public void setDaftarPenerimaanMn(boolean daftarPenerimaanMn) {
		this.daftarPenerimaanMn = daftarPenerimaanMn;
	}

	public boolean isTunggakanMn() {
		return tunggakanMn;
	}

	public void setTunggakanMn(boolean tunggakanMn) {
		this.tunggakanMn = tunggakanMn;
	}

	public boolean isKinerjaOrganisasiMn() {
		return kinerjaOrganisasiMn;
	}

	public void setKinerjaOrganisasiMn(boolean kinerjaOrganisasiMn) {
		this.kinerjaOrganisasiMn = kinerjaOrganisasiMn;
	}

	public boolean isKinerjaMn() {
		return kinerjaMn;
	}

	public void setKinerjaMn(boolean kinerjaMn) {
		this.kinerjaMn = kinerjaMn;
	}

	public boolean isKinerjaPelayananMn() {
		return kinerjaPelayananMn;
	}

	public void setKinerjaPelayananMn(boolean kinerjaPelayananMn) {
		this.kinerjaPelayananMn = kinerjaPelayananMn;
	}

	public boolean isRinciPendataanLapanganMn() {
		return rinciPendataanLapanganMn;
	}

	public void setRinciPendataanLapanganMn(boolean rinciPendataanLapanganMn) {
		this.rinciPendataanLapanganMn = rinciPendataanLapanganMn;
	}

	public boolean isRinciRekamDataMn() {
		return rinciRekamDataMn;
	}

	public void setRinciRekamDataMn(boolean rinciRekamDataMn) {
		this.rinciRekamDataMn = rinciRekamDataMn;
	}

	public boolean isRinciRekamSttsMn() {
		return rinciRekamSttsMn;
	}

	public void setRinciRekamSttsMn(boolean rinciRekamSttsMn) {
		this.rinciRekamSttsMn = rinciRekamSttsMn;
	}

	public boolean isRinciRekamTandaTerimaSpptMn() {
		return rinciRekamTandaTerimaSpptMn;
	}

	public void setRinciRekamTandaTerimaSpptMn(boolean rinciRekamTandaTerimaSpptMn) {
		this.rinciRekamTandaTerimaSpptMn = rinciRekamTandaTerimaSpptMn;
	}

	public boolean isDaftarPerubahanMn() {
		return daftarPerubahanMn;
	}

	public void setDaftarPerubahanMn(boolean daftarPerubahanMn) {
		this.daftarPerubahanMn = daftarPerubahanMn;
	}

	public boolean isPerubahanOpMn() {
		return perubahanOpMn;
	}

	public void setPerubahanOpMn(boolean perubahanOpMn) {
		this.perubahanOpMn = perubahanOpMn;
	}

	public boolean isPerubahanZntMn() {
		return perubahanZntMn;
	}

	public void setPerubahanZntMn(boolean perubahanZntMn) {
		this.perubahanZntMn = perubahanZntMn;
	}

	public boolean isPerubahanSpptMn() {
		return perubahanSpptMn;
	}

	public void setPerubahanSpptMn(boolean perubahanSpptMn) {
		this.perubahanSpptMn = perubahanSpptMn;
	}

	public boolean isSejarahOpMn() {
		return sejarahOpMn;
	}

	public void setSejarahOpMn(boolean sejarahOpMn) {
		this.sejarahOpMn = sejarahOpMn;
	}

	public boolean isSejarahOp2Mn() {
		return sejarahOp2Mn;
	}

	public void setSejarahOp2Mn(boolean sejarahOp2Mn) {
		this.sejarahOp2Mn = sejarahOp2Mn;
	}

	public boolean isSejarahSpptMn() {
		return sejarahSpptMn;
	}

	public void setSejarahSpptMn(boolean sejarahSpptMn) {
		this.sejarahSpptMn = sejarahSpptMn;
	}

	public boolean isNomorPelayananMn() {
		return nomorPelayananMn;
	}

	public void setNomorPelayananMn(boolean nomorPelayananMn) {
		this.nomorPelayananMn = nomorPelayananMn;
	}

	public boolean isNopTerbesarMn() {
		return nopTerbesarMn;
	}

	public void setNopTerbesarMn(boolean nopTerbesarMn) {
		this.nopTerbesarMn = nopTerbesarMn;
	}

	public boolean isNopTerbesarPelayananMn() {
		return nopTerbesarPelayananMn;
	}

	public void setNopTerbesarPelayananMn(boolean nopTerbesarPelayananMn) {
		this.nopTerbesarPelayananMn = nopTerbesarPelayananMn;
	}

	public boolean isPerubahanNopMn() {
		return perubahanNopMn;
	}

	public void setPerubahanNopMn(boolean perubahanNopMn) {
		this.perubahanNopMn = perubahanNopMn;
	}

}