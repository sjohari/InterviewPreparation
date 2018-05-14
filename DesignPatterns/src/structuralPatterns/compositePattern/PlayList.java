package structuralPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class PlayList  implements IMedia{
	private List<IMedia> mediaList = new ArrayList<>();

	private String name;
	
	public List<IMedia> getMediaList() {
		return mediaList;
	}
	
	public void addMedia(IMedia song){
		mediaList.add(song);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void play() {
		for(IMedia media : this.mediaList){
			media.play();
		}
	}

	@Override
	public void pause() {
		System.out.println("Playlist paused");
		
	}

	@Override
	public void stop() {
		System.out.println("Playlist stopped");
		
	}

}
