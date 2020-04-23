public class Polymorph{
    public static class A{
        public void printHello(){
            System.out.println("A Hello");
        }
    }
    public static class B extends A{
        public void printHello(){
            System.out.println("B Hello");
        }
    }
    public static class C extends B{
        public void printHello(){
            System.out.println("C Hello");
        }
    }
    public static void main(String[] args){
        A aa = new A();
        A ab = (A) new B();
        A ac = (A) new C();
        B bc = (B) new C();
        aa.printHello();
        ab.printHello();
        ac.printHello();
        bc.printHello();
    }
}