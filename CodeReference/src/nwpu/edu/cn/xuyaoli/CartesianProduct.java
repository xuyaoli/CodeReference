package nwpu.edu.cn.xuyaoli;
import java.util.Arrays;
public class CartesianProduct {
	private static String[] aa = { "aa1", "aa2" };  
    private static String[] bb = { "bb1", "bb2", "bb3" };  
    private static String[] cc = { "cc1", "cc2", "cc3", "cc4" };  
    private static String[][] xyz = { aa, bb, cc };  
    private static int counterIndex = xyz.length - 1;  
    private static int[] counter = { 0, 0, 0 };  
  
    public static void main(String[] args) throws Exception {  
  
        for (int i = 0; i < aa.length * bb.length * cc.length; i++) {  
//            System.out.print(aa[counter[0]]); 
        	System.out.print(xyz[0][counter[0]]);
            System.out.print("\t");  
            System.out.print(bb[counter[1]]);  
            System.out.print("\t");  
            System.out.print(cc[counter[2]]);  
            System.out.println();  
//            System.out.println("counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
            handle();  
        }
       
//        System.out.println("xyz.length:"+xyz.length+"xyz:"+Arrays.deepToString(xyz));
    }  
  
    public static void handle() {  
//        System.out.println("29 counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
        counter[counterIndex]++;  
//        System.out.println("31 counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
        if (counter[counterIndex] >= xyz[counterIndex].length) {  
            counter[counterIndex] = 0;  
            counterIndex--;  
//            System.out.println("33 counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
            if (counterIndex >= 0) {  
                handle();  
//                System.out.println("36 counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
            }  
            counterIndex = xyz.length - 1;
//            System.out.println("39 counterIndex:"+counterIndex+"\tcounter[counterIndex]:"+counter[counterIndex]+"\tcounter:"+Arrays.toString(counter));
        }  
    }  
}  
