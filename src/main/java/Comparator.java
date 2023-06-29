
public class Comparator {

    public static StudentComparator getStudentComparator(StudentEnum studentEnum) {

        switch (studentEnum) {

            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case COURSE:
                return new StudentCourseComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityEnum universityEnum) {

        switch (universityEnum) {

            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case PROFILE:
                return new UniversityProfileComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }
}
