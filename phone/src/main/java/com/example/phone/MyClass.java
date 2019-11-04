package com.example.phone;

import java.util.Scanner;

public class MyClass {
    public static   void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        phone phone1=new phone(1,"µØºÓ","Zenfone5","2018¦~","$1000");
        phone phone2=new phone(2,"oppo","a3","2018","10990");
        phone phone3=new phone(3,"apple","iPhoneX","2017","35900");
        phone phone4=new phone(4,"¤p¦Ì","mi6","2017","13900");
        phone phone5=new phone(5,"Huawei","P30","2019","15398");

        phone1.dataprint();
        phone2.dataprint();
        phone3.dataprint();
        phone4.dataprint();
        phone5.dataprint();
    }
}
