public class StatePair <Type1 extends Comparable<Type1>, Type2 extends Comparable<Type2>> {
    private Type1 value1;
    private Type2 value2;

   public StatePair(Type1 val1, Type2 val2){
        value1 = val1;
        value2 = val2;
   }
   public void printInfo(){
       System.out.print("Hello");
   }
    // TODO: Define a constructor, mutators, and accessors
    //       for StatePair

    // TODO: Define printInfo() method
}