package com.cg.rest.Springrest;

import java.util.HashMap;
import java.util.Map;

public class Databaseclass {
private static Map<Long,Message> messages=new HashMap<>();
private static Map<Long,Message> profiles=new HashMap<>();
public static Map<Long,Message> getMessages(){
	return messages;
	
}
public static Map<Long,Message> getProfiles(){
	return profiles ;
	
}
}
