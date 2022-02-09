package org.foo

public class Bar{
    String name="demoText";
    public Bar(String name){
        this.name = name;
    }
    def sayHello(){
        sh "echo Hello World from class Bar of src"
    }

    static void sayHelloStatic(){
        sh "echo Static hello world from class Bar of src"
    }
}