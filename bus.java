
public class bus extends Vehicle{
	

	    private String type;

	    public bus(String b, int year, int price, String type)
	    {
	    	super(b,year,price);
	    	this.type=type;
	             
	    }
	    public String getType()
	    {
	        return type;
	    }

	    public void setType(String carBrand)
	    {
	        type = carBrand;
	    }
	   
}
