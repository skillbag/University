import java.io.IOException;
import java.util.List;

public class Mn {


    public static void main(String[] args) throws IOException {
        List<University> universities =
                ReadXls.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator = Comparator.getUniversityComparator(UniversityEnum.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);
        String universitiesJson = JsonUtil.universityListToJson(universities);
        System.out.println(universitiesJson);
        List<University> universitiesFromJson = JsonUtil.jsonToUniversityList(universitiesJson);
        System.out.println(universities.size() == universitiesFromJson.size());
        universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            System.out.println(universityFromJson);
        });


        List<Student> students =
                ReadXls.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator = Comparator.getStudentComparator(StudentEnum.AVG_EXAM_SCORE);
        students.sort(studentComparator);
        String studentsJson = JsonUtil.studentListToJson(students);
        System.out.println(studentsJson);
        List<Student> studentsFromJson = JsonUtil.jsonToStudentList(studentsJson);
        System.out.println(students.size() == studentsFromJson.size());
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            System.out.println(studentFromJson);
        });
        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "statistics.xlsx");
    }
}