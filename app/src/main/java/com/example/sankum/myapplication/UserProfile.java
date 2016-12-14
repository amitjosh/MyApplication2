package com.example.sankum.myapplication;

import android.widget.RatingBar;

/**
 * Created by sankum on 12/12/2016.
 */

public class Userprofile {
    String name;
    String emailAddress;
    String zipcode;
    RatingBar hometime;
    RatingBar outdoor;
    public Userprofile(){

    }
    public Userprofile(String name, String emailAddress, String zipcode, RatingBar hometime, RatingBar outdoor){
        this.name=name;
        this.emailAddress=emailAddress;
        this.zipcode=zipcode;
        this.hometime=hometime;
        this.outdoor=outdoor;
    }
}
