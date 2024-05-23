package com.javaprograms.packages;
import java.awt.*;    

  
public class buildinpackage extends Frame  {    

// initializing using constructor  
	buildinpackage(){  

   // creating a button   
   Button b = new Button("Click Me!!");  
  
   b.setBounds(30,100,80,30);  
    
   add(b);  

   // frame size 300 width and 300 height    
   setSize(300,300);  

   // setting the title of Frame  
   setTitle("This is our basic AWT example");   
       
  
   setLayout(null);   

   
   setVisible(true);  
}    

//main method  
public static void main(String args[]) {   

//creating instance of Frame class   
buildinpackage f = new buildinpackage();    

}  

} 


