package com.rent.video.system.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;


@Entity
@Table(name="roleinfo")
@Access(value= AccessType.FIELD)
public class RoleEntity {
    @Id
    @Nonnull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    int roleid;

    @Column(name="rolename")
    String rolename;

    public RoleEntity()
    {

    }
    public RoleEntity(int roleid, String rolename) {
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "RoleEntity{" + "roleid=" + roleid + ", rolename='" + rolename + '\'' + '}';
    }
}
