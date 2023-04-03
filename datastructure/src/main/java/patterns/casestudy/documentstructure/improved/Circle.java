package patterns.casestudy.documentstructure.improved;

public class Circle extends WorldObject {

private final String specification;
	
	public Circle(String specification){
		this.specification = specification;
	}
	
	
	@Override
	public void print() {
		System.out.println(specification);
	}


	@Override
	public String getName() {
		return specification;
	}
	
	
}
