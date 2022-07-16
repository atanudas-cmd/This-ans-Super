/**

 * 2. Print the fields/instance members of the parent class using super
 * 5. Call constructor of the parent class using super()
 */

//SuperClass
class fun {
    String name = "Ramu";

    fun() {
        System.out.println("This is the parent class constructor: ");
    }
}

//SubClass

class Abc extends fun {
    String name = "Atanu";

    Abc() {

        //5. Calling constructor of the parent class using super()

        super();
        System.out.println("This is the  child class constructor");
    }

    void myMethod() {

        //Printing fields of the parent class using super

        System.out.println("My name is: " + super.name);
    }
}

public class CallUsingSuper {
    public static void main(String[] args) {
        Abc aa = new Abc();
        aa.myMethod();
    }
}