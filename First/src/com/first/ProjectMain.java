package com.first;

public class ProjectMain {

	public static void main(String[] args) {
		System.out.println("Tools");
		String[] tools = Project.toolsUsed();
        for (String tool : tools) {
            System.out.println(tool);
        }
        System.out.println();
        System.out.println("Topics");
		Project project=new Project();
		String[] topics= {"Spring","Java","React"};
		project.printTopics(topics);
		
		
	}

}
