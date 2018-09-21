package java1.Day2;

public class Song {
	
	private String title = "";
	private String artist = "";
	private String album = "";
	private String composer = "";
	private int year = 0;
	private int track = 0;
	
	
	public Song() {
		
		this("종은날", "아이유");
	}
	
	public Song(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void Show()
	{
		System.out.println(artist);
		System.out.println(title);
		System.out.println(album);
		System.out.println(composer);
		System.out.println(year);
		System.out.println(track);
	}
	
}
