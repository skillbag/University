import java.io.IOException;
import java.util.List;

public class Mn {

    public static void main(String[] args) throws IOException {
        List<University> universities =
                ReadXls.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        for (University university : universities) {
            System.out.println(university);
        }

        List<Student> students =
                ReadXls.readXlsStudents("src/main/resources/universityInfo.xlsx");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
