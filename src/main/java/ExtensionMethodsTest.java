package main.java;

import java.awt.event.MouseEvent;

public class ExtensionMethodsTest implements Bar {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("In test");
		
	}
	
	public static void main(String ar[]){
		
		ExtensionMethodsTest t = new ExtensionMethodsTest();
		t.mouseClicked(null);
		
	}

	

	

}
