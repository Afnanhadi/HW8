public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void Account(String id,String name){
      this.id=id;
      this.name=name;

   }public void Account(String id, String name ,int balance){
      this.id=id;
      this.name=name;
      this.balance=balance;

    }public void setBalance(int balance){
            this.balance=balance;

    }public int getBalance(){

        return balance;
    }
    public  int credit(int amount){
        balance=balance+amount;
        return balance;
    }
    public int debit(int amount){
       if(balance>amount){
        balance=balance-amount;
        System.out.println("The account has been debited: "+balance);}
           else {
        System.out.println("The balance is insufficient"+balance);
    }return balance;


    }public int transferTo( Account another,int amount){
     if(amount<=balance){
      this.balance=this.balance-amount;
       another.balance=another.balance+amount;
         System.out.println("The amount has been transferred successfully: "+balance);}
     else {
         System.out.println("Insufficient balance cannot be transferred: "+balance);
     }

       return this.balance;

    }public String toString(){
        return "ID: "+id+"\n"+"Name: " +name+ "\nBalance: "+balance;

    }
    public static void main(String[] args) {
        System.out.println("Welcome this program Account:");
        Account account = new Account();
        account.setName("Afnan");
        System.out.println("Name account:" + account.getName());
        account.setId("441678981");
        System.out.println("Id account: " + account.getId());
        System.out.println("Balance Account: " + account.getBalance());
        account.credit(22000);
        System.out.println("add credit: " + account.getBalance());
        account.debit(1);
        Account account1=new Account();
        Account account2=new Account();
        account2.Account("2467789F","Amjad",1000);
        account2.toString();
        account.transferTo(account2,200);
        System.out.println(account2.toString());






    }
}

