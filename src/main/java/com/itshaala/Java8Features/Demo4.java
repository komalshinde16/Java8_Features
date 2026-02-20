package com.itshaala.Java8Features;

public class Demo4 {
    public static void main(String[] args) {
        abstract class UserService {
            public abstract void sayHello();
        }

        class UserServiceImpl extends UserService {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        }

        UserService userService = new UserServiceImpl();
        userService.sayHello();

        UserService anonymousService = new UserService() {
            @Override
            public void sayHello() {
                System.out.println("Hello Anonymous");
            }
        };
        anonymousService.sayHello();
    }
}
