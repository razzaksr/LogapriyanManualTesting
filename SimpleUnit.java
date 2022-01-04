class SimpleUnit
{
	static double[] many={3.4,9.9,12.7,4.5,11.0,45.8,8.9,12.6};// storage
	
	// unit>> module
	public static void show(int user)
	{
		for(int pos=user;pos<many.length;pos++)
		{
			System.out.println(many[pos]);
		}
		update(5,2); // top down incremental integration
	}

	// unit
	public static void update(int pos,int qty)
	{
		if(pos<many.length)
		{
			double tmp=many[pos];
			tmp=tmp*qty;
			many[pos]=tmp;
			System.out.println(many[pos]+" has updated with quantity of "+qty);
			//show(0);// bottom up incremental integration
		}
		else
		{
			System.out.println(pos+" doesn't updated");
		}
	}

	public static void main(String[] yet)
	{
		/*
		unit test
		SimpleUnit.show(7);
		SimpleUnit.show(0);
		SimpleUnit.show(2);
		//SimpleUnit.show(-1);
		*/
		/* unit
		SimpleUnit.update(3,4);
		SimpleUnit.update(9,2);
		*/

		// integration top down
		//SimpleUnit.show(0);

		// integration bottom up
		//SimpleUnit.update(3,8);

		// hybrid incremental integration
		SimpleUnit.show(0);				
		//SimpleUnit.update(3,8);
	}
}