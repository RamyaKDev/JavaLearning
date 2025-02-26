package com.assignments;

public class Theater {
	 String movieName;
	int movieTime;
	Theater(String movieName,int movieTime){
		this.movieName=movieName;
		this.movieTime=movieTime;
	}
	public void watch_movie() {
		System.out.println("Movie Name :"+movieName+" Movie Time :"+movieTime);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater movie1=new Theater("Jailer",630);
		Theater movie2=new Theater("Leo",7);
		movie1.watch_movie();
		movie2.watch_movie();
	}

}
