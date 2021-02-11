package co.com.choucair.certification.utestuser.model;

public class UtestUserData {

    private String srtFirstName;
    private String srtLastName;
    private String srtEmail;
    private String srtMonthOfBirth;
    private String srtDayOfBirth;
    private String srtYearOfBirth;
    private String srtPassword;

    public UtestUserData(String srtFirstName, String srtLastName, String srtEmail, String srtMonthOfBirth, String srtDayOfBirth, String srtYearOfBirth, String srtPassword) {
        this.srtFirstName = srtFirstName;
        this.srtLastName = srtLastName;
        this.srtEmail = srtEmail;
        this.srtMonthOfBirth = srtMonthOfBirth;
        this.srtDayOfBirth = srtDayOfBirth;
        this.srtYearOfBirth = srtYearOfBirth;
        this.srtPassword = srtPassword;
    }

    public String getSrtFirstName() {
        return srtFirstName;
    }

    public void setSrtFirstName(String srtFirstName) {
        this.srtFirstName = srtFirstName;
    }

    public String getSrtLastName() {
        return srtLastName;
    }

    public void setSrtLastName(String srtLastName) {
        this.srtLastName = srtLastName;
    }

    public String getSrtEmail() {
        return srtEmail;
    }

    public void setSrtEmail(String srtEmail) {
        this.srtEmail = srtEmail;
    }

    public String getSrtMonthOfBirth() {
        return srtMonthOfBirth;
    }

    public void setSrtMonthOfBirth(String srtMonthOfBirth) {
        this.srtMonthOfBirth = srtMonthOfBirth;
    }

    public String getSrtDayOfBirth() {
        return srtDayOfBirth;
    }

    public void setSrtDayOfBirth(String srtDayOfBirth) {
        this.srtDayOfBirth = srtDayOfBirth;
    }

    public String getSrtYearOfBirth() {
        return srtYearOfBirth;
    }

    public void setSrtYearOfBirth(String srtYearOfBirth) {
        this.srtYearOfBirth = srtYearOfBirth;
    }

    public String getSrtPassword() {
        return srtPassword;
    }

    public void setSrtPassword(String srtPassword) {
        this.srtPassword = srtPassword;
    }
}
