
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telephoneconnection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author www.ThePCWizard.in
 */



public class Telephoneconnection {
public static SplashScreen loadingScreen;
public static Rectangle2D.Double loadingTextArea;
public static Rectangle2D.Double loadingProgressArea;
public static Graphics2D loadingGraphics;
public static Font myfont;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
        
        Run();
    }
    public static void Run() {
        loadingMethod();
        mainMethod();
        
        if (loadingScreen != null) {
            loadingScreen.close();
        }
    }
    public static void loadingMethod() {
        loadingScreen = SplashScreen.getSplashScreen();
        if (loadingScreen !=null){
            // if there are any problems displaying the splash this will be null
            
            //Dimension of your image
            Dimension dim = loadingScreen.getSize();
            int ht = dim.height;
            int wd = dim.width;            
            //Placing textArea and progressArea
            loadingTextArea = new Rectangle2D.Double((wd-(wd*0.9))/2, ht*0.75, wd*0.9, 13);
            loadingProgressArea = new Rectangle2D.Double((wd-(wd*0.9))/2, ht*0.8, wd*0.9, 20);
            // create the Graphics environment for drawing status info
            loadingGraphics = loadingScreen.createGraphics();
            //Setting font for text in status info
            myfont = new Font("TimesRoman", Font.BOLD, 13);
            loadingGraphics.setFont(myfont);
            
            
        }
    }
           public static void loadingText(String string) {
               if (loadingScreen!=null){
                   float alpha = 0.0f;
                   Color color = new Color(1, 0, 0, alpha); 
                   loadingGraphics.setPaint(color);
                   loadingGraphics.fill(loadingTextArea);
                   
                   loadingGraphics.setPaint(Color.blue); //Color of the text
                   loadingGraphics.drawString(string, (int) loadingTextArea.getX(), (int) loadingTextArea.getY()+10);
                   
                   loadingScreen.update();
               }
           }
           
           public static void loadingProgress(int prog) {
               if (loadingScreen != null){
                   float alpha = 0.0f;
                   Color color = new Color(1, 0, 0, alpha); 
                   loadingGraphics.setPaint(color);
                   loadingGraphics.fill(loadingProgressArea);
                   //Color for the border of progressArea
                   loadingGraphics.setPaint(Color.BLUE);
                   loadingGraphics.draw(loadingProgressArea);
                   
                   int x = (int) loadingProgressArea.getMinX();
                   int y = (int) loadingProgressArea.getMinY();
                   
                   int width = (int) loadingProgressArea.getWidth();
                   int height = (int) loadingProgressArea.getHeight();
                   //Dividing by 50 because I would update the progress five times
                   int doneProg = (prog*width/50)-5;
                   
                   loadingGraphics.setPaint(Color.green);//Color for the total progress done
                   loadingGraphics.fillRect(x+3, y+3, doneProg, height-5);
                   
                   loadingScreen.update();
               }
           }
           
           public static void mainMethod() {
               for (int i=1;i<=50;i++){
                   if(i<=10)
                   {loadingText("Loading.");}
                   else if(i<=20)
                   {loadingText("Loading..");}
                   else if(i<=30)
                   {loadingText("Loading...");}
                   else if(i<=40)
                   {loadingText("Loading....");}
                   else if(i<=50)
                   {loadingText("Loading.....");}
                   loadingProgress(i*1);
                   
                   try
                   {
                       Thread.sleep(50);
                   }
                   catch (InterruptedException ex)
                   {
                       // ignore it
                   }
           }
               java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new loginform().setVisible(true);
            }
        });
      }
}
