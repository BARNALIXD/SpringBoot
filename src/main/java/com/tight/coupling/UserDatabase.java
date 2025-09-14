package com.tight.coupling;

//a- mysql
//b - webservices , mongodb

public class UserDatabase {
    public String getUserDetails() {
        //directly accessed database here
        return "user details from the user database";

    }
}
