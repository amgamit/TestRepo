package org.quinnox;

import java.io.IOException;

public class ExtractJava {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Started");
		
		String fromLocation = "D:\\MuleTraining\\mule4-lab-docs-april2019\\mule4-lab-docs-april2019";
		
		String toDestination = "C:\\Users\\gamit\\Desktop\\Secure-Properties\\";
		
		String cmd = "java -jar "+fromLocation+"\\secure-properties-tool.jar"+" "+"file encrypt Blowfish CBC abcdefghijklmnop "+toDestination+"dev-credentials.yaml "+toDestination+"dev-secure-credentials.yaml";
		
		System.out.println(cmd);
			
		
		Runtime.getRuntime().exec(cmd);
		
		System.out.println("Exited");
		
	}

}
