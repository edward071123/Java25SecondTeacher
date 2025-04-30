public class Bank {
    private String account;
    private int balance1 = 0;

    public Bank(String registerAccount,int inputBalance) {
        this.account=registerAccount;
        this.balance1=inputBalance;
    }
    public void showBalance(){
        System.out.println("acc:"+this.account+"blance:"+ this.balance);
    }
    public String getAccount(){
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    //想像情境:回傳餘額
    public int getBalance1(){
        return this.balance1;
    }

    public void setBalance1(int balance1) {
        this.balance1 = this.balance1+balance1;
    }
    

}
