package lesson1;
public class Printer {
    
    public void show() {
        System.out.println("沒任何輸入");
    }

    public void show(String text) {
        System.out.println("單一文字輸入:" + text);
    }

    public void show(int number) {
        System.out.println("單一數字輸入:" + number);
    }

    public void show(String text, int number) {
        System.out.println("不同型別多個輸入: text: " + text + ", number:" + number);
    }

    public void show(String text1, String text2) {
        System.out.println("同型別多個輸入: text1: " + text1 + ", text2:" + text2);
    }
}
