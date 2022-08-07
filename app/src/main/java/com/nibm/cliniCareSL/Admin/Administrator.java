package com.nibm.cliniCareSL.Admin;

import com.nibm.cliniCareSL.User;

public class Administrator extends User {
    // instance variable
    int adminId = 0000;

    // a constructor
    public Administrator(String firstName, String lastName, String email, String password) { super(firstName, lastName, email, password); }

    Administrator(){};

    // returns id of the Administrator
    public int getAdminId() { return this.adminId; }

    // changes id of the Administrator
    public void setAdminId(int adminId) { this.adminId = adminId; }
}