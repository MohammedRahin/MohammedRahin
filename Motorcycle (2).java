
public class Motorcycle extends Vehicle{

    private int numberModel;

    public Motorcycle(String b, int price, int number, int nm)
    {
        super(b,price,number); 
        numberModel = nm;      
    }
    public int getNumberModel()
    {
        return numberModel;
    }

    public void setNumber(int number)
    {
        numberModel = number;
    }
}



