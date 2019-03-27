package exercise;

/**
 * @program: Leetcode_1224
 * @author: Joseph_liujian
 * @create: 2019-03-25 20:52
 **/

class A {
    public A(){
        System.out.println("A gouzao");
    }
    private static A a = new A();
    static{
        System.out.println("static");
    }
    {
        System.out.println("A");
    }
}
public class B extends A {
    public B(){
        System.out.println("B");
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println("0000");
        B b = new B();
    }
}
