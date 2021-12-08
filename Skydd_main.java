package Grupp_inlämning_oop;

import java.util.Arrays;

public class Skydd_main {

	public static void main(String[] args) {
		
		
		

		Player p1 = new Player( "Stockholm " ,new Time  (10 , 15) , "Ali" , 35) ;
		Player p2 = new Player( "Malmö " ,new Time  (12, 16) , "Anas" , 40) ;
		Player p3 = new Player( "umeå " ,new Time  (14 , 20) , "Jens" , 30) ;
		Player p4 = new Player( "Göteborg  " ,new Time  (16, 19) , "Fatina" , 25) ;
		
           System.out.println(p1.toString());	 p1.display_players_time(p1);
           System.out.println(p2.toString());	 p1.display_players_time(p2);
           System.out.println(p3.toString());	 p1.display_players_time(p3);
           System.out.println(p4.toString());	 p1.display_players_time(p4);
       System.out.println("======================================================================="); 
       
       
       Player [] players = new Player [] { p1 , p2 , p3 , p4 } ;
       
       for (int i = 0; i < players.length; i++) {
		
    	   System.out.println(players [i]);
	}
		System.out.println("#####################################################################");
       Arrays.sort(players);
       
       for (int i = 0; i < players.length; i++) {
		System.out.println(players [i]);
	}
       // hai 
	}

}
