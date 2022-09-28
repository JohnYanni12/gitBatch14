package gitClass01B14;

public class class01Codes {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 8; i++)
		{
			if (i == 0 || i == 8)
			{
				System.out.print("***************");
			}
			if (i == 8)
			{
				break;
			}
		}

		for (int x = 0; x <= 8; x++)
		{
			if (x == 0 || x == 8) 
			{
				System.out.print("*");

				if (x == 8)
				{

					System.out.println();
				}
			} 
			else
			{
				System.out.print(" ");
			}
		}
	}
}
		// y axis
	    for( int y = 0; y <= 8; y++ )
	    {
	        if( y == 0 || y == 8 )
	        {
	            System.out.print( "*********\n" );
	            if( y == 8 )
	            {
	                // Leave loop
	                break;
	            }
	        }

	        // x axis
	        for( int x = 0; x <= 8; x++ )
	        {
	            if( x == 0 || x == 8 )
	            {
	                System.out.print( "*" );
	                if( x == 8 )
	                {
	                    System.out.println();
	                }
	            }
	            else
	            {
	                System.out.print( " " );
	            }
	        }
	    }
	}
}
