package com.azizul.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.azizul.model.Model;

@Repository
@Transactional
public class DaoImp implements Dao {

	@Autowired
	SessionFactory session;

	@SuppressWarnings("unchecked")
	@Override
	public List<Model> getList() {
		List<Model> lst = new ArrayList<Model>();
		lst = (List<Model>) session.getCurrentSession().createCriteria(Model.class).list();
		

		return lst;
	}

	@Override
	public Model save(Model college) {
		session.getCurrentSession().saveOrUpdate(college);
		return college;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Model> getObject(String name, String roll) {
		
		return (List<Model>) session.getCurrentSession().createQuery("from Model m where m.name "
				+ "LIKE '%"+name+"' or m.roll LIKE '%"+roll+"'").list();
	}

	@Override
	public void delete(Model id) {
		// TODO Auto-generated method stub
		session.getCurrentSession().createQuery("DELETE FROM Model WHERE id = "+id.getId()).executeUpdate();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Model getObject(Integer id) {
		// TODO Auto-generated method stub
		return (Model) session.getCurrentSession().get(Model.class, id);
	}

}
