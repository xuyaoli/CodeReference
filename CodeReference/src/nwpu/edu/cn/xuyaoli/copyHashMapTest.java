package nwpu.edu.cn.xuyaoli;
import java.util.HashMap;
import java.util.*;


public class copyHashMapTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"11");
		m.put(2,"22");
		Map<Integer,String> cm = new HashMap<Integer,String>(m);
		cm.put(3, "33");
		System.out.println("cm:"+cm+"\nm:"+m); //verify that cm and m is dependent.
	}

}

