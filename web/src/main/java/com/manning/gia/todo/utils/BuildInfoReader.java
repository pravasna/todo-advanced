package com.manning.gia.todo.utils;

import java.util.Properties;

public class BuildInfoReader {
	public BuildInfo read() {
		Properties props = new Properties(); 
		
		try {
           	props.load(getClass().getResourceAsStream("/build-info.properties"));
			BuildInfo buildInfo = new BuildInfo();
			buildInfo.setVersion(props.getProperty("version"));
			return buildInfo;
        } 
  	    catch(Exception e) {
		   // Ignore it
		}
		
		return null;
	}
}