package lesson2;

public class Demo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speak();

        Dog d1 = new Dog();
        d1.speak();
        d1.bark();


        /*
         * 課堂練習
         * 新增Cat 類別 繼承Animal
         * 新增一個method:mia()
         * 印出 "貓在喵喵叫"
         */

        Cat c1 = new Cat();
        c1.speak();
        c1.mia();

    }
}
