import java.util.*;
public class bianli {
	
	private int order;
	
    bianli(int order){
    	 this.order = order;
    }
     
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();

		  for(int i=0;i<100;i++)
		  {
		   set .add(i);
		  }

		for(Iterator it=set.iterator();it.hasNext();)
		  {
			Integer s = (Integer) it.next();
			System.out.println(s);
//		   System.out.println(it.next());
		  }
		
		Set<bianli> blSet = new HashSet<bianli>();
		for(int i=0;i<100;i++)
		  {
		   set .add(new bianli(i));
		  }
		
	}
	

}
