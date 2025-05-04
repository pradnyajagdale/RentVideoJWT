package com.rent.video.system.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    int userid;
     String ufirstname;
    String ulastname;
    String uemail;
    String upassword;
    Role role;
    public User()
    {

    }

    public User(int userid, String ufirstname, String ulastname, String uemail, String upassword, Role role) {
        this.userid = userid;
        this.ufirstname = ufirstname;
        this.ulastname = ulastname;
        this.uemail = uemail;
        this.upassword = upassword;
        this.role = role;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUfirstname() {
        return ufirstname;
    }

    public void setUfirstname(String ufirstname) {
        this.ufirstname = ufirstname;
    }

    public String getUlastname() {
        return ulastname;
    }

    public void setUlastname(String ulastname) {
        this.ulastname = ulastname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                ", ufirstname='" + ufirstname + '\'' +
                ", ulastname='" + ulastname + '\'' +
                ", uemail='" + uemail + '\'' +
                ", upassword='" + upassword + '\'' +
                ", role=" + role +
                '}';
    }
}
