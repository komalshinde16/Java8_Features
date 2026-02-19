package com.itshaala.Java8Features;

public class Demo1 {
    public static void main(String[] args) {

        abstract class MessageService {
            public abstract void send(String message);
        }

        class WhatsApp extends MessageService {
            public void send(String message) {
                System.out.println("sending message using whatsApp : "+message);
            }
        }

        MessageService service = new WhatsApp();
        service.send("good morning");
    }

}
