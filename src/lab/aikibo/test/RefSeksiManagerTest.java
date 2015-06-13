package lab.aikibo.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import lab.aikibo.entity.RefSeksi;
import lab.aikibo.manager.RefSeksiManager;

public class RefSeksiManagerTest {
	
	private RefSeksiManager rsm;
	
	@Before
	public void init() {
		rsm = new RefSeksiManager();
	}
	
	@Test
	public void testGetDataByKode() {
		RefSeksi rs = rsm.getDataSeksiByKode("10");
		assertEquals("10", rs.getKdSeksi());
		assertEquals("SUB BAGIAN TATA USAHA", rs.getNmSeksi());
		assertEquals("01", rs.getNoSrtSeksi());
		assertEquals("WPJ", rs.getKodeSurat1());
		assertEquals("KB", rs.getKodeSurat2());
	}

}
