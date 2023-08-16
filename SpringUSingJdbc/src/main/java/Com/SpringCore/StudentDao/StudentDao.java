package Com.SpringCore.StudentDao;

import java.util.List;

import com.entity.Student;

public interface StudentDao {
			public int insert(Student student);
			public int update(Student student);
			public void delete(int id);
			public List<Student> getStudents();
			
}
