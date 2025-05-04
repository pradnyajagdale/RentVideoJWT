package com.rent.video.system.exchnage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rent.video.system.dto.Role;
import com.rent.video.system.dto.User;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserRegistrationRequest {
    @JsonProperty("ufirstname")
    String ufirstname;
    @JsonProperty("ulastname")
    String ulastname;
    @JsonProperty("uemail")
    String uemail;
    @JsonProperty("upassword")
    String upassword;
    @JsonProperty("urole")
    String urole;

    public GetUserRegistrationRequest()
    {

    }

    public GetUserRegistrationRequest( String ufirstname, String ulastname, String uemail, String upassword, String urole) {
        this.ufirstname = ufirstname;
        this.ulastname = ulastname;
        this.uemail = uemail;
        this.upassword = upassword;
        this.urole = urole;
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

    public String getUrole() {
        return urole;
    }

    public void setUrole(String urole) {
        this.urole = urole;
    }

    @Override
    public String toString() {
        return "GetUserRegistrationRequest{" +
                "ufirstname='" + ufirstname + '\'' +
                ", ulastname='" + ulastname + '\'' +
                ", uemail='" + uemail + '\'' +
                ", upassword='" + upassword + '\'' +
                ", urole='" + urole + '\'' +
                '}';
    }
}
