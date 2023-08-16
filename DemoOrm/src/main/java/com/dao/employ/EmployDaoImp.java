package com.dao.employ;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Entity.Employ;

@Transactional
public class EmployDaoImp implements EmployDao {

	public HibernateTemplate hibernateTemplate;

	public int insert(Employ employ) {
		int i = (Integer) hibernateTemplate.save(employ);

		return i;
	}
	public int update(Employ employ) {
		hibernateTemplate.update(employ);
			return 1;
		}
	
	public Employ getId(int id)
	{
		Employ employ = hibernateTemplate.get(Employ.class,id);
		return employ;
	}
	
	public int delete(int id)
	{
		
		Employ employ = hibernateTemplate.get(Employ.class,id);
		hibernateTemplate.delete(employ);
		return 0;
	}
	public List<Employ> getAll() {
        
        return hibernateTemplate.loadAll( Employ.class);
    }

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	

}
