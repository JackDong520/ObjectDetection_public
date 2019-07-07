package temptable.temp;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "http_email", schema = "objectdetect", catalog = "")
public class HttpEmailEntity {
    private int id;
    private String value;
    private String type;
    private String firstName;
    private String lastName;
    private String position;
    private String seniority;
    private String department;
    private String linkedin;
    private String twitter;
    private String phoneNumber;

    public HttpEmailEntity() {
    }

    public HttpEmailEntity(int id, String value, String type, String firstName, String lastName, String position, String seniority, String department, String linkedin, String twitter, String phoneNumber) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.seniority = seniority;
        this.department = department;
        this.linkedin = linkedin;
        this.twitter = twitter;
        this.phoneNumber = phoneNumber;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "seniority")
    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    @Basic
    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    @Basic
    @Column(name = "twitter")
    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpEmailEntity that = (HttpEmailEntity) o;
        return id == that.id &&
                Objects.equals(value, that.value) &&
                Objects.equals(type, that.type) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(position, that.position) &&
                Objects.equals(seniority, that.seniority) &&
                Objects.equals(department, that.department) &&
                Objects.equals(linkedin, that.linkedin) &&
                Objects.equals(twitter, that.twitter) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, type, firstName, lastName, position, seniority, department, linkedin, twitter, phoneNumber);
    }
}
