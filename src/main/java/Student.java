import com.google.gson.annotations.SerializedName;

public class Student {
    @SerializedName("StudentName")
    String fullName;
    @SerializedName("UniversityId")
    String universityId;
    @SerializedName("CourseNumber")
    int currentCourseNumber;
    @SerializedName("AvgScore")
    float avgExamScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(StringBuilder fullName) {
        this.fullName = String.valueOf(fullName);
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(StringBuilder universityId) {
        this.universityId = String.valueOf(universityId);
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }
    @Override
    public String toString(){
        return getUniversityId() + getAvgExamScore() + getCurrentCourseNumber() + getFullName();
    }
}
