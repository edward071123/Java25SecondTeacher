package basic;
public class MethodInfo {
    public static void main(String[] args) throws Exception {
        // 沒有輸入參數 ＆ 沒有回傳值
        // sayHello1();

        // 有多個輸入參數 ＆ 沒有回傳值
        String inputName =  "David";
        int[] score = {55};
        sayHello2(inputName, 10, score);
        int[] score2 = {65};
        sayHello2("Tom", 20, score2);

        // 有輸入參數 ＆ 有回傳值
        // 需要用變數接回傳值
        // String result = ;
        // System.out.println(sayHello3("Jerry"));

        /*
         * 寫一個 成績判斷的 method 成績判斷的 checkScore
         * 輸入分數(int)
         * method內容
         * 用if elseif 判斷 學生分數  
         * 如果分數超過90分 印出(超棒)
         * 如果分數80~90分 印出(很好)
         * 如果分數60~80分 印出(好)
         * 其他 印出(ok)
         * 回傳結果 印出(String)
         */
        // String getResult = checkScore(55);
        // System.out.println(getResult);
        
    }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法)
     * 無回傳值: void
     * 方法名稱: sayHello1
     * 輸入參數: 無
     */
    public static void sayHello1() {
        System.out.println("Hi everyone");
        // void 可省略 return;
        return;
    }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法)
     * 無回傳值: void
     * 方法名稱: sayHello2
     * 輸入參數: String name, int age, int[] score
     */
    public static void sayHello2(String name, int age, int[] score) {
        System.out.println("Hi " + name);
        System.out.println("Age: " + age);
        System.out.println("Score[0]: " + score[0]);
        // void 可省略 return;
        return;
    }

    /*
     * 修飾 靜態? 回傳型態 方法名稱(輸入參數)
     * 
     * 修飾: public, private, protected
     * 靜態: static (靜態方法只能呼叫靜態方法)
     * 有回傳值: 型態為: String
     * 方法名稱: sayHello2
     * 輸入參數: String name
     */
    public static String sayHello3(String name) {
        return "Hi " + name;
    }


    public static String checkScore(int score) {
        String result = "";
        if(score >= 90) {
            result = "超棒";
        } else if(score >= 80 && score < 90) {
            result = "很好";
        } else if(score >= 60 && score < 80) {
            result = "好";
        } else {
            result = "ok";
        }

        return result;
    }

}
