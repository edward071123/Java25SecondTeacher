package lesson2;

public class Dog extends Animal{
    public Dog(){
        // super();
        System.out.println("Dog建構子被呼叫");
    }

    public void bark() {
        System.out.println("狗在旺旺叫");
    }

    
    /*
    * 覆寫Override
    */
    @Override
    public void speak() {
        System.out.println("動物發出聲音:狗在叫");
    }
}
