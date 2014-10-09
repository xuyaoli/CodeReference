package nwpu.edu.cn.xuyaoli;
public class myStringOP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myStringOP ms = new myStringOP();
		String s="abdcd,";
		s=s.substring(0,s.length()-1);
		System.out.println("s:"+s);
		String s1 = " dd ";
		String s2 = "dd";
		ms.isEquals(s1,s2);
	}
	public  Boolean isEquals(String s1,String s2){
		Boolean isEqual = false;
		if(s1.trim().equals(s2.trim())) {
			isEqual = true;
			System.out.println(s1+"||"+s2+"is equals?"+isEqual);
			}
		return isEqual;
	}
}
