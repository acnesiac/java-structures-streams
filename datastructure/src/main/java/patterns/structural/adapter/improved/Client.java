package patterns.structural.adapter.improved;

public class Client {

	public static void main(String [] args){
		Client client = new Client();

        LegacyRectangle legacyRectangle = new LegacyRectangle();

        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);

        client.calculateRectangleSize(adapter);

		
	}
	
	
	public void calculateRectangleSize(Rectangle rectangle){
		System.out.println("Rectangle Size: "+rectangle.determineSize());
	}
	
	
}

