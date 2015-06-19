package lab.aikibo.manager;

import java.util.List;

import lab.aikibo.entity.RefSeksi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.zkoss.zkplus.hibernate.HibernateUtil;

public class RefSeksiManager {
	
	public String getNamaSeksiByKode(String kode) {
		Session session = HibernateUtil.currentSession();
		String result = null;
		
		session.beginTransaction();
		Criteria criteria = session.createCriteria(RefSeksi.class);
		criteria.add(Restrictions.eq("kdSeksi", kode));
		List<RefSeksi> data = (List<RefSeksi>)criteria.list();
		if(data.size() > 0) {
			result = data.get(0).getNmSeksi();
		}
		return result;
	}
	
	public List<RefSeksi> getDaftarSeksi() {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		List<RefSeksi> data = (List<RefSeksi>) session.createQuery("from RefSeksi").list();
		return data;
	}
	
	public RefSeksi getDataSeksiByKode(String kode) {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		
		RefSeksi result = null;
		Criteria criteria = session.createCriteria(RefSeksi.class);
		criteria.add(Restrictions.eq("kdSeksi", kode));
		List<RefSeksi> data = (List<RefSeksi>) criteria.list();
		if(!data.isEmpty()) {
			result = data.get(0);
		}
		
		return result;
	}
	
	public boolean saveOrUpdate(RefSeksi data) {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		
		session.saveOrUpdate(data);
		session.flush();
		return true;
	}

}
