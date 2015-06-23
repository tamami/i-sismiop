package lab.aikibo.test;

import static org.junit.Assert.*;

import java.util.List;

import lab.aikibo.entity.RefSubSeksi;
import lab.aikibo.manager.RefSubSeksiManager;

import org.junit.Before;
import org.junit.Test;

public class RefSubSeksiManagerTest {
	
	private RefSubSeksiManager rssm;
	
	@Before
	public void preTest() {
		rssm = new RefSubSeksiManager();
	}
	
	@Test
	public void test() {
		int jumlahData = 27;
		
		List<RefSubSeksi> data = rssm.getDaftarAll();
		assertEquals(jumlahData, data.size());
	}

}
