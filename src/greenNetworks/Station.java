package greenNetworks;

import java.awt.Point;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.math.*;

public class Station {
public static int userid;
public static int type;
public static int radius;
public static int xcod;
public static int ycod;
//public static float density;
//public static float area;
public static int user_count;
public static float user_energy_requirment;
public static float renewable_harvesting;
public static float battery_capacity;
public static Vector<Integer> uid_connected=new Vector<Integer>(30);

static int connected_uids;

	public static void main(String args[])
	{
		Station[] st=new Station[45];   // 7 Macro and 38 Pico
		Scanner in=new Scanner(System.in);
		Random r = new Random();
		for(int i=1;i<=7;i++)
		{
			st[i].userid=i; 
			 st[i].type=0;    //1-Pico   0-Macro
			st[i].radius=168;
			 int x=r.nextInt(1349);  // This will return a random int between 0 and 1349
			 int y=r.nextInt(1349);
			
			/*for(int j=1;j<i;j++)
			{
				while(Math.sqrt((x-st[j].xcod)^2+(y-st[j].ycod)^2)<1.75*radius)
				{
				x=r.nextInt(1349) + 0;  // This will return a random int between 0 and 1349
				y=r.nextInt(1349) + 0;
				}
			}*/
			st[i].xcod=x;
			st[i].ycod=y;
			System.out.println("User Id"+st[i].userid);
			System.out.println("X cod"+st[i].xcod);
			System.out.println("Y cod"+st[i].ycod);
			}
		
	}
	
}
	
