package com.itshaala.Java8Features;

public class Demo5 {
    public static void main(String[] args) {
        interface UserService{
            public static void count(){
                System.out.println("counting");
            }
        }

        /// static method is called using interface name

        UserService.count();
    }


}
