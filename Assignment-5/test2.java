/*2. Create a class which contains an inner class. Show that inner class can use member 
of outer class directly, but Outer class can use member of Inner class only through its object.
Check the name of class file, you created.*/

class test2{
	int temp=5;
	class Inner{
		double temp2=23.35;
		System.out.println("Inner class memeber value is: "+temp2);
		System.out.println("Outer class memeber value is: "+temp);
	}
	Inner i = new Inner();
	System.out.println("Inner class memeber value from Outer Class is: "+i.temp2);
}