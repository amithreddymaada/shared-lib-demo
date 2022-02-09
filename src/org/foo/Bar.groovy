package org.foo

public class Bar{
    def steps
    public Bar(steps){
        this.steps = steps
    }
    def sayHello(){
        steps.sh "echo Hello World from class Bar of src"
    }

    static void sayHelloStatic(){
        steps.sh "echo Static hello world from class Bar of src"
    }
}