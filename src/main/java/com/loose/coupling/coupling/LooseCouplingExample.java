package com.loose.coupling.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWs = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWs.getUserInfo());

        UserDataProvider NewDataBaseProvider  = new NewDataBaseProvider();
        UserManager userManagerWithNewDB = new UserManager(NewDataBaseProvider );
        System.out.println(userManagerWithNewDB.getUserInfo());


    }
}
