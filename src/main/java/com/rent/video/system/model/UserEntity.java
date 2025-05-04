package com.rent.video.system.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
@Table(name="userdetails")
@Access(value= AccessType.FIELD)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nonnull
    @Column(name = "userid")
    int userid;

    @Column(name = "ufirstname")
    String ufirstname;

    @Column(name = "ulastname")
    String ulastname;

    @Column(name = "uemail")
    String uemail;

    @Column(name = "upassword")
    String upassword;

    @ManyToOne
    @JoinColumn(name = "roleid", referencedColumnName = "roleid")
    private RoleEntity role;

    public UserEntity() {

    }
    public UserEntity(String ufirstname, String ulastname, String uemail, String upassword, RoleEntity role) {
        this.ufirstname = ufirstname;
        this.ulastname = ulastname;
        this.uemail = uemail;
        this.upassword = upassword;
        this.role=role;
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

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userid=" + userid +
                ", ufirstname='" + ufirstname + '\'' +
                ", ulastname='" + ulastname + '\'' +
                ", uemail='" + uemail + '\'' +
                ", upassword='" + upassword + '\'' +
                ", role=" + role +
                '}';
    }
}