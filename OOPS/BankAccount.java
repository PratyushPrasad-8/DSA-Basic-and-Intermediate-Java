package OOPS;

public class BankAccount{
    //protected
    String userName;
    //private 
    int accountNo;
    //private 
    String passWord;
    
    void setUserName(String username){
        this.userName=username;
    }
    
    void getUserName(){
        System.out.println(userName);
    }
    
    void setPassWord(String passWord){
        this.passWord=passWord;
    }
    
    private String getPassWord(){
        return passWord;
    }
}