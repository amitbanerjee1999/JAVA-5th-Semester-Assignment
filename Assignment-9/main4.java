class main4{
	public static void main (String[] args)
    {
        String st = null;
        try
        {
            System.out.println(st.length());
        }
        catch(NullPointerException noe)
        {
            System.out.print("NullPointerException Caught");
        }
    }
}