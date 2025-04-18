package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getter and setter
    public String getPassword(){
    return this.password;
}
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class Bank{
    public static void main(String args[]){
        Account account1=new Account();
        account1.name="Hii";
        account1.email="mahi@gmail.com";
        account1.setPassword("mahi");
        System.out.println(account1.getPassword());
    }
}
/*
E:\java_apna_clg\a\Object_oriented_prog\Bank\bank>javac Bank.java

E:\java_apna_clg\a\Object_oriented_prog\Bank\bank>cd..

E:\java_apna_clg\a\Object_oriented_prog\Bank>java bank.Bank  
mahi

*/