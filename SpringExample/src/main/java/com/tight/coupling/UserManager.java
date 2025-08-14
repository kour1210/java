package com.tight.coupling;

public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();

    public String getUserInfo(){
        return userDatabase.getUserDetails();
    }
}

//UserManager: Internally tightly binds to a specific data provider.