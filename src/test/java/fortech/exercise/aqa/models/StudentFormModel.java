package fortech.exercise.aqa.models;

public class StudentFormModel {

    private String name;
    private String lastName;
    private String userEmail;
    private String genderMale;
    private String genderFemale;
    private String genderOther;
    private String mobilePhone;
    private String dateOfBirth;
    private String subjects;
    private String hobbiesSports;
    private String hobbiesReading;
    private String hobbiesMusic;
    private  String uploadPicture;
    private String currentAddress;
    private String state;
    private String city;
    private String submit;

    public StudentFormModel(String name, String lastName, String userEmail, String genderMale, String genderFemale,
                            String genderOther, String mobilePhone, String dateOfBirth, String subjects, String hobbiesSports,
                            String hobbiesReading, String hobbiesMusic, String uploadPicture, String currentAddress, String state, String city, String submit) {
        this.name = name;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.genderMale = genderMale;
        this.genderFemale = genderFemale;
        this.genderOther = genderOther;
        this.mobilePhone = mobilePhone;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
        this.hobbiesSports = hobbiesSports;
        this.hobbiesReading = hobbiesReading;
        this.hobbiesMusic = hobbiesMusic;
        this.uploadPicture = uploadPicture;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getGenderMale() {
        return genderMale;
    }

    public String getGenderFemale() {
        return genderFemale;
    }

    public String getGenderOther() {
        return genderOther;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getHobbiesSports() {
        return hobbiesSports;
    }

    public String getHobbiesReading() {
        return hobbiesReading;
    }

    public String getHobbiesMusic() {
        return hobbiesMusic;
    }

    public String getUploadPicture() {
        return uploadPicture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getSubmit() {
        return submit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setGenderMale(String genderMale) {
        this.genderMale = genderMale;
    }

    public void setGenderFemale(String genderFemale) {
        this.genderFemale = genderFemale;
    }

    public void setGenderOther(String genderOther) {
        this.genderOther = genderOther;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public void setHobbiesSports(String hobbiesSports) {
        this.hobbiesSports = hobbiesSports;
    }

    public void setHobbiesReading(String hobbiesReading) {
        this.hobbiesReading = hobbiesReading;
    }

    public void setHobbiesMusic(String hobbiesMusic) {
        this.hobbiesMusic = hobbiesMusic;
    }

    public void setUploadPicture(String uploadPicture) {
        this.uploadPicture = uploadPicture;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
}
