package com.kb.list;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class User implements Parcelable{
    private String firstName;
    private String lastName;
    private String age;

    public User(String firstName, String lastName, String age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age= age;
    }

    protected User(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        age = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(age);
    }
}
