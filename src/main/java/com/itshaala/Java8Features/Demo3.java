package com.itshaala.Java8Features;

public class Demo3 {
    public static void main(String[] args) {
        class A {}
        class B extends A {}
        A a = new B();

        A a2 = new A(){};    ///new A(){} ---- anonymous class

        interface MessageService {

            public abstract void send(String message);
        }
        class WhatsApp implements MessageService {
            public void send(String message) {
                System.out.println(message);
            }
        }
        MessageService whatsAppService = new WhatsApp();

        /////subclass creation using anonymous way
        MessageService messageService = new MessageService() {
            @Override
            public void send(String message) {
                System.out.println("sending message using anonymous class : " + message);
            }

            void m1() {
            }
        };
        messageService.send("Hello World");
    }
}
