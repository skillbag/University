public enum StudyProfile {
    MEDICINE("Медицина"),
    ECONOMY("Экономика"),
    HISTORY("История");
    private final String profileName;

    private StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}
