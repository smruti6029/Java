package com.DAO.Student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.Entity.Student.Student;
import com.Entity.Student.Subject;

@Component("studentDao")
@Transactional
public class Student_DAO {

	@Autowired
	public HibernateTemplate hibernateTemplate;

	public int insert(Student student) {
		int i = (Integer) hibernateTemplate.save(student);

		return i;
	}

	public Student getBygmail(String gmail) {

		List<Student> students = (List<Student>) hibernateTemplate.findByNamedParam("from Student where email = :email",
				"email", gmail);

		return students.get(0);

	}

	public List<Student> getAll() {

		return hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
