package patterns.casestudy.rendering;

import patterns.casestudy.documentstructure.improved.WorldObject;

public class RenderingSystem {

	private WorldObjectRenderer renderer;
	
	public void render(WorldObject object){
		renderer.render(object);
	}
	
	public void setWorldObjectRenderer(WorldObjectRenderer renderer){
		this.renderer = renderer;
	}
	
}
