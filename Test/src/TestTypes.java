
public class TestTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte byteVar = 1;
		short shortVar = 11;
		int intVar = 10;
		long longVar = 100;
		float floatVar = 1.9f;
		double doubleVar = 10000.323;
		char charVar = 'a';
		boolean bolVar = true;
		
		
		intVar = (int) byteVar;
		System.out.println(" intVar = (int) byteVar "+intVar);
		intVar = (int) shortVar;
		System.out.println(" intVar = (int) shortVar "+intVar);
		intVar = (int) longVar;
		System.out.println(" intVar = (int) longVar "+intVar);
		intVar = (int) floatVar;
		System.out.println(" intVar = (int) floatVar "+intVar);
		intVar = (int) doubleVar;
		System.out.println(" intVar = (int) doubleVar "+intVar);
		intVar = (int) charVar;
		System.out.println(" intVar = (int) charVar "+intVar);
		
		
		byteVar = 1;
		shortVar = 11;
		intVar = 10;
		longVar = 100;
		floatVar = 1.9f;
		doubleVar = 10000.323;
		charVar = 'a';
		bolVar = true;
		
		byteVar = (byte) shortVar;
		System.out.println(" byteVar = (byte) shortVar "+byteVar);
		byteVar = (byte) intVar;
		System.out.println(" byteVar = (byte) intVar "+byteVar);
		byteVar = (byte) longVar;
		System.out.println(" byteVar = (byte) longtVar "+byteVar);
		byteVar = (byte) floatVar;
		System.out.println(" byteVar = (byte) floatVar "+byteVar);
		byteVar = (byte) doubleVar;
		System.out.println(" byteVar = (byte) doubleVar "+byteVar);
		byteVar = (byte) charVar;
		System.out.println(" byteVar = (byte) charVar "+byteVar);

		
		
		 int i=1;
		 switch (i) {
		 case 0:
		 System.out.println("zero");
		 break;
		 case 1:
		 System.out.println("one");
		 case 2:
		 System.out.println("two");
		 default:
		 System.out.println("default");
		 }
		 
		 int ii=1;
		 int j=2;
		 if(ii==1  & j==2)
		  System.out.println("OK");
		
		//test to check if the following will work

		//if(ii==1 &| j==2)
		//System.out.println("worked");
		
	}

}
