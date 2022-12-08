package dev.levi.webclient.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;


public class Contact {
    @Id
    Integer id;
    String firstName;
    String email;
    String mobile;
    String phone;
    String lastName;
    String linkedIn;
    String facebook;
    String website;

    public Contact(String firstName, String email, String mobile, String phone, String lastName, String linkedIn, String facebook, String website) {
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
        this.phone = phone;
        this.lastName = lastName;
        this.linkedIn = linkedIn;
        this.facebook = facebook;
        this.website = website;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                ", linkedIn='" + linkedIn + '\'' +
                ", facebook='" + facebook + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
