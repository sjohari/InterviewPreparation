package structuralPatterns.compositePattern;

public class Song implements IMedia {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void play() {
		System.out.println(this.name + " started");
		stop();
	}

	@Override
	public void pause() {
		System.out.println("Song paused");
		
	}

	@Override
	public void stop() {
		System.out.println(this.name + " stopped");
		
	}

}
