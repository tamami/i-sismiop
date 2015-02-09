package lab.aikibo.manager;

import java.util.Iterator;
import java.util.List;

import lab.aikibo.entity.DatLogin;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zkplus.hibernate.HibernateUtil;

@SuppressWarnings("deprecation")
public class UserManager {
	
	public UserManager() {
		init();
	}
	
	public void init() {
		//Koneksi.init();
	}
	
	public boolean isAnyUser(String username) {
		Session session = HibernateUtil.currentSession();
		String sql = "select nmLogin from DatLogin where nmLogin = :username";
		try {
			Query query = session.createQuery(sql);
			query.setString("username", username);
			Iterator iterator = query.iterate();
			while(iterator.hasNext()) {
				String user = (String) iterator.next();
				if(user.equalsIgnoreCase(username)) {					
					return true;
				}
			}
			return false;
		} catch(Exception e) {
			Clients.showNotification("Ada kesalahan sistem, hubungi Admin.");
			return false;
		}
	}
	
	public String getPassword(String username) {
		String password;
		if(isAnyUser(username)) {
			Session session = HibernateUtil.currentSession();
			String sql = "select password from DatLogin where nmLogin = :username";
			Query query = session.createQuery(sql);
			query.setString("username", username);
			Iterator iterator = query.iterate();
			password = (String) iterator.next();
			return password;
		} else {
			return null;
		}
	}
	
	public String getNip(String username) {
		String nip;
		if(isAnyUser(username)) {
			Session session = HibernateUtil.currentSession();
			String sql = "select nip from DatLogin where nmLogin = :username";
			Query query = session.createQuery(sql);
			query.setString("username", username);
			Iterator iterator = query.iterate();
			nip = (String) iterator.next();
			return nip;
		} else {
			return null;
		}
	}
	
	public List<DatLogin> getListUser() {
		List<DatLogin> list;
		Session session = HibernateUtil.currentSession();
		list = session.createQuery("from DatLogin").list();
		return list;
	}
	
	public DatLogin getUserByNip(String nip) {
		List<DatLogin> daftarData;
		Session session = HibernateUtil.currentSession();
		Criteria criteria = session.createCriteria(DatLogin.class);
		criteria.add(Restrictions.eq("nip", nip));
		daftarData = criteria.list();
		if(daftarData != null) {
			return daftarData.get(0);
		} else {
			return null;
		}
	}
	
	public void saveOrUpdate(DatLogin user) {
		Session session = HibernateUtil.currentSession();
		session.beginTransaction();
		session.saveOrUpdate(user);
		session.flush();
	}
	
}
