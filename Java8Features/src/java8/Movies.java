package java8;

public class Movies {
String movieName;
int Year;
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public int getYear() {
	return Year;
}
public void setYear(int year) {
	Year = year;
}
public Movies(String movieName, int year) {
	super();
	this.movieName = movieName;
	Year = year;
}

}
