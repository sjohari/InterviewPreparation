package structuralPatterns.compositePattern;

public class MediaPlayer {
	public static void main(String args[]){
		PlayList playList =  new PlayList();
		playList.setName("myList");
		Song song1 = new Song();
		song1.setName("song1");
		playList.addMedia(song1);
		Song song2 = new Song();
		song2.setName("song2");
		playList.addMedia(song2);
		playList.play();
	}
}
