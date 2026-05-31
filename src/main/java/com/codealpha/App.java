package com.codealpha;

public class App {
    public String getGreeting() {
        return "Hello DevOps World from CodeAlpha Java-Gradle Application!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}