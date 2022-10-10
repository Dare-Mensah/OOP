package Labs3;

public class PremiumClient extends Client
{
    private static final double BONUS_RATE=0.001;
    private double bonus;

    public PremiumClient(String name)
    {
        super(name);
        this.bonus = 0; //sets bonus to 0
        // TODO Auto-generated constructor stub
    }


    public double getEarnedBonus()
    {
        return this.bonus;
    }

    public void deposit(int amount)
    {
        super.deposit(amount);
        this.bonus = amount * BONUS_RATE;
    }
}
