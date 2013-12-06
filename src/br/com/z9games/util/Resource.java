package br.com.z9games.util;

public class Resource {

	private static String respath = "res";
	private static String imgpath = "images";
	
	public Resource() {
		// TODO Auto-generated constructor stub
	}
	
	public static String getImageResourcePath(){
		return respath+"/"+imgpath+"/";
	}

}
