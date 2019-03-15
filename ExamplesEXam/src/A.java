
public class A {
	public void doA(int k) throws Exception
	{
	for(int i=0;i<10;i++)
	{
		if(i==k) throw new Exception("index of k is" +i);
	}}
	
	public void doB(boolean f)
	{
		if(f)
		{
			doA(15);
			
		}
		else
			return;
	}
	public static void main(String args[])
	{
		A a=new A();
		a.doB(args.length>0);
	}
}
