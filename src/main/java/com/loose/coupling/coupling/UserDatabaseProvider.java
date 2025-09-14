package com.loose.coupling.coupling;

//a- mysql
//b - webservices , mongodb

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails() {
        //directly accessed database here
        return "User details from the  database";

    }
}
