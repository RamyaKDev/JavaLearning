package com.first;

public class Project {
	
	public static String[] toolsUsed() {
        return new String[] { "maven","git","Junit" };
    }
	void printTopics(String[] topicName) {		
		for(String topic:topicName){
			System.out.println(topic);
		}
	}
}
