package Labs3;

public class Client extends User
{
    private Account account;

    public Client(String name)
    {
        super(name);
        this.account = new Account(); //creates a new account

        // TODO Auto-generated constructor stub
    }


    public Account getAccount()
    {
        return this.account;
    }

    public void deposit(int amount)
    {
        this.account.deposit(amount);
    }

    public int getBalance()
    {
        return account.getBalance();
    }
}
