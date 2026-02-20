package com.itshaala.Java8Features;

public class Demo2 {
    public static void main(String[] args) {

        abstract class MessageService{
            public abstract void send (String message);
        }
        MessageService messageService = new MessageService() {
            @Override
            public void send (String message){
                System.out.println("sending message using anonymous class" +message);

            }
        };
        messageService.send("Hello world!!");
    }
}
