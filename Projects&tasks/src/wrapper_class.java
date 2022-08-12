//wrapper class



public class wrapper_class {

	public static void main(String[] args) {
		//auto boxing =>primitive to objects 
      int a=100;
      Integer i=Integer.valueOf(a);
      System.out.println(i.max(80, 100));
      System.out.println(i.longValue());
      System.out.println(i.toString());
      System.out.println(i.bitCount(a));
      System.out.println(i.compare(80, 30));
      System.out.println(i.min(20, 100));
      System.out.println(i.max(100, 250));
      System.out.println(i.sum(500, 300));
      System.out.println(i.reverse(76));
      System.out.println(i.toBinaryString(22));
      System.out.println(i.toOctalString(a));
      //unboxing => objects is primitive
      Integer j=i.intValue();
      int b=j;
      System.out.println(b);
      
	}

}
