package Labs3;

public class CorporateClient extends Client
{
    private int companyRegistrationNumber;

    public CorporateClient(String name, int companyRegistrationNumber)
    {
        super(name);//gets client name
        this.companyRegistrationNumber = companyRegistrationNumber;
        // TODO Auto-generated constructor stub
    }

    public int getCompanyRegistrationNumber()
    {
        return companyRegistrationNumber;
    }
}
