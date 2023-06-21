
public class University {
    String id;
    String fullName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;


    public String getId() {
        return id;
    }

    public void setId(StringBuilder id) {
        this.id= String.valueOf(id);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(StringBuilder fullName) {
        this.fullName = String.valueOf(fullName);
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(StringBuilder shortName) {
        this.shortName = String.valueOf(shortName);
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString(){
        return  getId() + getFullName() + getShortName() + getYearOfFoundation() + getMainProfile();
    }

}
