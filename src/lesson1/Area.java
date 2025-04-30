package lesson1;
public class Area {
    public void cal(int buttom, int height) {
        if(buttom == 0 || height == 0) {
            System.out.println("底或高不能為0");
        } else {
            System.out.println("三角形面積為:" + (buttom * height / 2));
        }
        
    }

    public void cal(String shape, int length1, int length2) {
        if(length1 == 0 || length2 == 0) {
            System.out.println("長或寬不能為0");
        } else {
            System.out.println(shape + "方形面積為:" + (length1 * length2));
        }
       
    }

    public void cal(int r) {
        if(r == 0) {
            System.out.println("半徑不能為0");
        } else {
            System.out.println("圓面積為:" + (r * r * 3.14));
        }

    }
}
