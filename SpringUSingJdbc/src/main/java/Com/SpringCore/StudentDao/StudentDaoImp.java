package Com.SpringCore.StudentDao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.entity.Student;


public class StudentDaoImp implements StudentDao {

	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String qry="insert into student (id,name,city)values(?,?,?)";
		this.jdbcTemplate.update(qry,student.getId(),student.getName(),student.getCity());
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int update(Student student) 
	{
		String qry="update  student set name=?,city=? where id=?";
		int update = this.jdbcTemplate.update(qry,student.getName(),student.getCity(),student.getId());
		
		return update;
		
		
		
	}
	public void delete(int id)
	{
		String sql = "DELETE FROM student WHERE id = ?";
		int update = this.jdbcTemplate.update(sql,id);
		System.out.println(update);
		
	}
	public List<Student> getStudents() {
	    String query = "SELECT * FROM student";
	    List<Student> students = jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Student.class));
	    return students;
	}

	

}
