package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMovies extends Movies{

	public StreamMovies(String movieName, int year) {
		super(movieName, year);
		
	}

	public static void main(String[] args) {
		
Movies movie1=new Movies("AAA",2020);
Movies movie2=new Movies("BBB",2025);
Movies movie3=new Movies("ABC",2022);

List<Movies> l=Arrays.asList(movie1,movie2,movie3);

List<String> MovieNames =l.stream()
.map(movieList->movieList.getMovieName())
//.forEach(System.out::println);
.collect(Collectors.toList());

System.out.println(MovieNames);
	}

}
