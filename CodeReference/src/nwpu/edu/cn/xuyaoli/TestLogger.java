package nwpu.edu.cn.xuyaoli;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger { 
        public static void main(String[] args) { 
                Logger log = Logger.getLogger("lavasoft"); 
                log.setLevel(Level.INFO); 
                Logger log1 = Logger.getLogger("lavasoft"); 
                System.out.println(log==log1);     //true 
                Logger log2 = Logger.getLogger("lavasoft.blog"); 
               // log2.setLevel(Level.WARNING); 

                ConsoleHandler consoleHandler =new ConsoleHandler(); 
                consoleHandler.setLevel(Level.ALL); 
                log.addHandler(consoleHandler); 
                FileHandler fileHandler;
				try {
					fileHandler = new FileHandler("C:/testlog%g.log");
					fileHandler.setLevel(Level.INFO); 
	                log.addHandler(fileHandler); 
	                log.info("aaa"); 
	                log2.info("bbb"); 
	                log2.fine("fine");
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
                
        } 
}