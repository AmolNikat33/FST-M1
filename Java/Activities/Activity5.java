package com.example.fst_m1_java_03;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize title of the book
        String title = "Hover Car Racer dsd";
        //Create object for MyBook
        Book newNovel = new MyBook();
        //Set title
        newNovel.setTitle(title);
        
        //Print result
        System.out.println("The title is: " + newNovel.getTitle());
	}

}
