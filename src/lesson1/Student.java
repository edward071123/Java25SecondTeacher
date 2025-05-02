package lesson1;
public class Student {
    private String teacherAccount;
    private int score1;
    private int score2;

    public Student(String teacherAccount) {
        this.teacherAccount = teacherAccount;
    }

    public int getScore1(String teacherAccount) {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號錯誤");
            return -1;
        } else {
            // 老師帳號比對成功
            return this.score1;
        }
    }

    public void setScore1(String teacherAccount,int score1) {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號錯誤");
        } else {
            // 老師帳號比對成功
            // 比對分數是否為 0 ~ 100 之間
            if((score1 >= 0) && (score1<=100)){
                this.score1 = score1;
            }
            else{
                System.out.println("分數需在0~100之間");
            }
            
        }
    }
    

    public int getScore2() {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號錯誤");
            return -1;
        } else {
            // 老師帳號比對成功
            return this.score2;
        }

    }

    public void setScore2(String teacherAccount,int score2) {
        if (teacherAccount != this.teacherAccount) {
            // 老師帳號比對失敗
            System.out.println("老師帳號錯誤");
        } else {
            // 老師帳號比對成功
            // 比對分數是否為 0 ~ 100 之間
            if((score2 >= 0) && (score2<=100)){
                this.score2 = score2;
            }
            else{
                System.out.println("分數需在0~100之間");
            }
            
        }
    }
}
