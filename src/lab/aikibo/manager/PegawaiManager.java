package lab.aikibo.manager;

import java.util.List;

import lab.aikibo.entity.Pegawai;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.zkoss.zkplus.hibernate.HibernateUtil;

public class PegawaiManager {
	
	public String getNamaByNipLama(String nip) {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(Pegawai.class);
		criteria.add(Restrictions.eq("nip", nip));
		List<Pegawai> data = criteria.list();
		if(data.size() == 1) return data.get(0).getNmPegawai();
		else return "";
	}

}