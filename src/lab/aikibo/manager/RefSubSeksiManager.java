package lab.aikibo.manager;

import java.util.List;

import org.hibernate.Session;
import org.zkoss.zkplus.hibernate.HibernateUtil;

import lab.aikibo.entity.RefSubSeksi;

public class RefSubSeksiManager {
	
	public List<RefSubSeksi> getDaftarAll() {
		Session session = HibernateUtil.currentSession();
		List<RefSubSeksi> result = null;
		
		session.beginTransaction();
		result = (List<RefSubSeksi>) session.createQuery("from RefSubSeksi").list();
		
		return result;
	}

}
