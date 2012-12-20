package com.seldemo.test;

import java.io.IOException;
import java.util.Properties;

/**
 * Parent test case for seledemo test
 *
 */
public class SelTestCase 
{
  
	private Properties properties = new Properties();
	
	public int MAXTIMEOUT=0;
	public int AVGTIMEOUT;
	public int MINTIMEOUT;
	
	
	//Suite level setup
	public void suiteSetup() throws IOException{
		
		//Init Global timeouts
		MAXTIMEOUT = 20;
		AVGTIMEOUT = 10;
		MINTIMEOUT = 5;
	}
	
	
	
	//Suite level cleanup
	
	
}
