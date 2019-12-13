package com.saurabh.retrofitexample.model;

import java.util.ArrayList;

public class UserDataList {

    public ArrayList<UserData> userDataArrayList = new ArrayList<>();

    public ArrayList<UserData> getUserDataArrayList() {
        return userDataArrayList;
    }

    public void setUserDataArrayList(ArrayList<UserData> userDataArrayList) {
        this.userDataArrayList = userDataArrayList;
    }
}
