package Labs3;

public class Agent extends Client
{
    private static final int MAX_CLIENTS = 5;
    private int numClients;
    private Client[] clients = new Client[MAX_CLIENTS]; //creates new array of size 5

    public Agent(String name)
    {
        super(name);
        this.numClients = 0; //sets client to 0
    }

    public void addClient(Client client)
    {
        if (numClients <= 4)
        {
            clients[numClients] = client; //adds client to array
            numClients ++;
        }
    }

    public Client[] getClients()
    {
        for(int i =0; i<=numClients; i++) //loops through an array of clients
        {
            clients[i] = this.clients[i];
        }
        return clients; //returns client info

    }
}
