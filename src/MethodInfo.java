public class MethodInfo {
    public static void main(String[] args) throws Exception {
        // 沒有輸入參數 ＆ 沒有回傳值
        sayHello1();

        // 有輸入參數 ＆ 沒有回傳值
        String inputName = "David";

        sayHello2("Tom");

        // 有輸入參數 ＆ 有回傳值
        // 需要用變數接回傳值
        String result = sayHello3("Jerry");
        System.out.println(result);

        String getRsult = checkScore(88);
        System.out.println(getRsult);
        
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
     * 輸入參數: String name
     */
    public static void sayHello2(String name) {
        System.out.println("Hi " + name);
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
    /*
     *寫一個成績判斷的metohd 成績判斷的checkScore 
     * 輸入分數(int)
     * method內容 
     * 用if elseif 判斷學生分數
     * 如果分數超過90分 印出(超棒)
     * 如果分數80~89分 印出(很好)
     * 如果分數60~79分 印出(好)
     * 其他 印出(ok)
     * 回傳結果 印出(String)
     */
    public static String checkScore(int score) {
        String result = "";
        if (score >= 90 && score <= 100) {
            result = "超棒";
        } else if (score >= 80 && score <= 89) {
            result = "很好";
        } else if (score >= 60 && score <= 79) {
            result = "好";
        } else if (score >= 0 && score <= 59) {
            result = "你好爛";
        }
        return result; // 確保回傳結果
    }



}
