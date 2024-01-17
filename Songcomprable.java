package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Create a Song class that implements Comparable for sorting songs based on their play durations.
 */
class Song implements Comparable<Song>{
	private String song;
	private double duration;
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Song(String song, double duration) {
		super();
		this.song = song;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Song [song=" + song + ", duration=" + duration + "]";
	}
	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return (int) (this.duration-o.duration);
	}
	
}
public class Songcomprable {
	public static void main(String[] args) {
		List<Song> li=new ArrayList<>();
		li.add(new Song("Sunset Serenade", 153.3));
		li.add(new Song("Moonlight melody",146.7));
		li.add(new Song("Fearless", 122.3));
		li.add(new Song("All too well", 115.3));
		li.add(new Song("wildest dreams", 95.3));
		System.out.println("*****given data*****");
		System.out.println(li);
		System.out.println();
		System.out.println("*****sorted songs by their  play duration******");
		Collections.sort(li);
		System.out.println(li);
		
		
		
	}

}
