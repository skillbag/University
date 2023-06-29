import java.io.IOException;
import java.util.List;

public class Mn {



    public static void main(String[] args) throws IOException {
        List<University> universities =
                ReadXls.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Comparator.getUniversityComparator(UniversityEnum.YEAR_OF_FOUNDATION);
        universities.stream().sorted(universityComparator).forEach(System.out::println);


        List<Student> students =
                ReadXls.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Comparator.getStudentComparator(StudentEnum.AVG_EXAM_SCORE);
        students.stream().sorted(studentComparator).forEach(System.out::println);
    }
}