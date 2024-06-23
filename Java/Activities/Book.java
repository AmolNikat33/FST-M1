package com.example.fst_m1_java_03;

public abstract class Book {
	String title;
    //Abstract method
    abstract void setTitle(String s);
    
    //Concrete method
    String getTitle() {
        return title;
    }


}
