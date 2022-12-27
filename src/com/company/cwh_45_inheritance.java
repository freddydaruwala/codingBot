package com.company;
class Base {
    Base1() {
        System.out.println("I am a construtor");
    }
    Base1(int a) {
        System.out.println("I am a construtor with value a as:" + a);
    }
    }
    class Derived1 extends Base1 {
    Derived1(){
        super(x);
            System.out.println("I am derived class constructor");
        }
    }

    public class cwh_45_inheritance {
        public static void main(String[] args) {
          //  Base1 b = new Base1();
            Derived d = new Derived1();
        }
    }
}



