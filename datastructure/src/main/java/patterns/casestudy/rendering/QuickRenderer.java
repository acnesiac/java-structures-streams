package patterns.casestudy.rendering;

import patterns.casestudy.documentstructure.improved.WorldObject;

public class QuickRenderer implements WorldObjectRenderer{

	@Override
	public void render(WorldObject object) {
		System.out.println("I'm rendering with the quick renderer");
		
	}

}
