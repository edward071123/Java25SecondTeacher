public class DemoClass {
    public static void main(String[] args) {
        int number =10;
        /*
         * 類別實作
         * car1是實作的物件 型別為Car型別為Car
         * 
         */

        Car car1 = new Car("001","red");
        car1.showCarInfo();
        Car car2 = new Car("002","blue");
        car2.showCarInfo();
        new Car("null", "null").showCarInfo();
        /*
        * 課間練習
        * 建立類別Person
        * 屬性: showName(),showAge()
        * 實作兩個Person物件
        */
        // Person person1= new Person();
        // person1.age= 25;
        // person1.name="毛毛";
        // person1.showName();
        // person1.showAge();
        // Cloth c1 = new Cloth("02","yellow","XXL");
        // c1.ShowInfo();
        // c1.size="XL";
        // c1.ShowInfo();
        // c1.color="red";
        // c1.ShowInfo();
        Bank b1 = new Bank("nanachan", 0);
        b1.showBalance();

    }
}
