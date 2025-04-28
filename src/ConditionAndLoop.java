public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         * 條件成立時執行的程式碼
         * } else {
         * 條件不成立時執行的程式碼
         * }
         */
        // int a = 2;
        // int b = 3;

        // if(!(a <= b)) {
        // System.out.println("a 的確 <= b");
        // } else {
        // System.out.println("a 沒有 <= b");
        // }
        // if ((a == 2) || (b == 3 )){
        // System.out.println("a="+a+" or b="+b);
        // } else {
        // System.out.println("a="+a+"沒有 b="+b);
        // }

        /*
         * else if
         * 
         * if (條件1) {
         * 條件1成立時執行的程式碼
         * } else if (條件2) {
         * 條件2成立時執行的程式碼
         * } else {
         * 條件1跟條件2都不成立時執行的程式碼
         * }
         */
        // int a = 2;

        // if(a == 2) {
        // System.out.println("a : 2");
        // } else if(a == 3) {
        // System.out.println("a : 3");
        // } else if(a == 4) {
        // System.out.println("a : 4");
        // } else {
        // System.out.println("a 為2,3,4以外的數字");
        // }
        // int grade = 50;
        // if ((grade >= 90 && grade <= 100)){
        // System.out.println("超棒");
        // }
        // else if ((grade >= 80 && grade <= 89)){
        // System.out.println("很好");
        // }
        // else if ((grade >= 60 && grade <= 79)){
        // System.out.println("好");
        // }
        // else if ((grade >= 0 && grade <= 59)){
        // System.out.println("你好爛");
        // }

        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        // int a = 2;
        // int b = 3;

        // String min = (a < b) ? "A < B" : "B > A";
        // int min = (a>b)? 2 : 3;
        // System.out.println(min);

        /*
         * 53,54 這兩行 效果等於以下寫法
         */
        // if(a < b) {
        // System.out.println("A < B");
        // } else {
        // System.out.println("B > A");
        // }

        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         * 條件成立時執行的程式碼
         * }
         */
        // for(int index = 0; index <= 10; index ++) {
        // System.out.println(index);
        // }
        // for (int i = 1 ; i<=9; i++){
        // //不換行
        // //System.out.print("");
        // //換行
        // //System.out.println("");
        // for (int j = 1 ; j<=9; j++){
        // if (i!=j){
        // System.out.print(i+"*"+j+"="+i*j+" ");
        // }
        // }
        // System.out.println();
        // }

        // int ln = 7;
        // for (int x=1; x <=ln; x++){
        // //System.out.println("*");
        // for (int blank=1;blank <= ln-x;blank++){//先印空白
        // System.out.print(" ");
        // }
        // for (int star=1;star <= (2*x)-1;star++){//在印星星
        // System.out.print("*");
        // }
        // System.out.println(" ");
        // }
        /*
         * 課間練習題3
         * 印 1 ~ 100
         * 是15的倍數印出Fizzbuzz
         * 是5的倍數印出buzz
         * 是3的倍數印出fizz
         * 其他印出正常數
         * /
         * for(int i = 1;i<=100;i++){
         * if(i % 15==0){
         * System.out.println("Fizzbuzz");
         * }
         * else if(i % 5==0){
         * System.out.println("buzz");
         * }
         * else if(i % 3==0){
         * System.out.println("fizz");
         * }
         * else {
         * System.out.println(i);
         * }
         * 
         * }
         * 
         * 
         * 
         * 
         * 
         * /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         * 課間練習題4 把bingo Array的陣列加總起來
         * 課間練習題5 把bingo Array的最大值顯示出來
         */

        int[] bingo = { 7, 22, 89, 55 };// java索引值是從0
        int k = bingo.length;
        int sum = 0;
        int big = 0;
        // System.out.println(k);
        // // for(int index = 0; index < bingo.length; index ++) {
        // for(int index = 0; index <= bingo.length-1; index ++) {
        // System.out.println(bingo[index]);
        // }

        // 課間練習題4 把bingo Array的陣列加總起來
        // for(int index = 0; index <= bingo.length-1; index ++) {
        // sum=sum+(bingo[index]);
        // }
        // System.out.println(sum);
        // 課間練習題5 把bingo Array的最大值顯示出來
        // for (int index = 0; index <= bingo.length - 1; index++) {
        //     if (bingo[index] > big) {
        //         big = bingo[index];
        //     }
        // }
        // System.out.println(big);

        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        // System.out.println(index);
        // }

        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         * 條件成立時執行的程式碼
         * }
         */
        String[] students = { "A1", "A2", "A3" };
        for (String stu : students) {
        System.out.println(stu);
        }

        /*
         * 105 ~ 108 這幾行 效果等於以下寫法
         */
        String[] students2 = { "A11", "A22", "A33" };
        for (int index = 0; index <= students2.length - 1; index++) {
        System.out.println(students2[index]);
        }

    }
}
