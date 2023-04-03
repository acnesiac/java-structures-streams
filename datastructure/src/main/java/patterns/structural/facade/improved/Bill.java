package patterns.structural.facade.improved;

public class Bill {

	private final Integer amount;
	
	public Bill(Integer amount){
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	
}
