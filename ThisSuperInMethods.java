/**

 *
 * 6. Use this() and super() in methods not in constructor
 */


//SuperClass

class Abc {
    void method1() {
        System.out.println("Used this() and super() in methods");
    }

    void method2() {
        //using this() to call method1
        this.method1();
    }
}
//SubClass
class Abc1 extends Abc {
    void method3() {
        //using super() to call parent method
        super.method2();
    }
}

public class ThisSuperInMethods {
    public static void main(String[] args) {
       Abc1 c1 = new Abc1();
        //Calling method3
        c1.method3();
    }
}
