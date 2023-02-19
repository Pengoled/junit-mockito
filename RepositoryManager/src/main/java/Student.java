import jakarta.persistence.*;

@Entity
@Table(name = "student_table")
public class Student {

    private int studentId;
    private String name;

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStudentId() {
        return studentId;
    }

    @Column(name = "student_name")
    public String getName() {
        return name;
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}
