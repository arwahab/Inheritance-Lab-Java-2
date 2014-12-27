package lab.pkg3;

// Lab 3 //
// Abdul Wahab //

public class MainClass {

    static void method(BaseClass b) {
        System.out.println(b.Only());

    }

    public static void main(String[] args) {

        BaseClass fobj = new FirstBase();
        BaseClass sobj = new SecondBase();
        BaseClass bobj = new BaseClass();

        method(fobj);
        method(sobj);
        method(bobj);

    }
}
