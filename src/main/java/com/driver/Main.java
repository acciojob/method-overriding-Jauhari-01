package com.driver;
class A{
    public String meth(){
        return "Invoking method from class A" ;
    }
}
class B extends A{
    @Override
    public String meth(){
        return "Method is overridden in Extendend class B" ;
    }
}
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.meth());
        A b = new B();
        System.out.println(b.meth()); 
    }
}