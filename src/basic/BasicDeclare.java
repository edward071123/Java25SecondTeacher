package basic;
public class BasicDeclare {
    public static void main(String[] args) throws Exception {
        /* 基本型別介紹
         * int:     整數, 範圍: -2,147,483,648 ~ 2,147,483,647
         *
         * byte:    整數, 範圍: -128 ~ 127
         *
         * long:    整數, 範圍: -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
         *
         * float:   32位元浮點數, 需要加上F
         *
         * double:  64位元浮點數, 預設型別
         *
         * char:    字元, 1個字元, 單引號
         *
         * String:  文字, 多個字元, 雙引號
         *
         * boolean: 布林, true/false
         */
        // long age = 254646126L; 整數, 需要加上L
        // System.out.println(age);

        float weight1 = 49.4F;
        System.out.println(weight1);

        // double weight2 = 49.49;
        // System.out.println(weight2);
        
        // char c1 = 'Y';
        // System.out.println(c1);

        String name = "かなえさん";
        System.out.println(name);

        // boolean isStudent = true; // false
        // System.out.println(isStudent);


        /*
         * 陣列(Array)宣告
         * 陣列的長度是固定的, 不能改變
         * 陣列的長度是從0開始計算
         */
        int[] bingo = {7, 22, 89, 55, 33, 99};
        System.out.println(bingo[5]);
        System.out.println(bingo[2]);

        float[] weight2 ={288.3F,27.3F};
        boolean[] isStudent = {true, false, true};
        // String[] students = {"A1", "A2", "A3"};
        // System.out.println(students[1]);

    }
}
