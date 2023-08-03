package Com.SpringCode;

public class Student {

	
		private int studentId;
		private String studentName;
		
		private String Subject;

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getSubject() {
			return Subject;
		}

		public void setSubject(String subject) {
			Subject = subject;
		}

		public Student(int studentId, String studentName, String subject) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			Subject = subject;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Subject=" + Subject + "]";
		}
		
		
		
}
