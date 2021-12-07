package Grupp_inlämning_oop;

public abstract  class Person implements Comparable<Person> {

	String team_name ;
	
	Time t ;

	public Person(String team_name, Time t) {
		super();
		this.team_name = team_name;
		this.t = t;
	}
	
	public abstract void  display_players_time (Player p) ;
	
	
	
}
	
	class Player  extends Person {

		
		String name;
		
		int age ;

		public Player(String team_name, Time t, String name, int age) {
			super(team_name, t);
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Player [name=" + name + ", age=" + age + ", team_name=" + team_name + ", t=" + t + "]";
		}

		

		

		@Override
		public void display_players_time(Player p) {
         
			System.out.println( p.t.Total_Time());
			
		}

		@Override
		public int compareTo(Person o) {
		int x = (int) (this.t.Total_Time() - o.t.Total_Time()) ;
				
			return x;
		}

		
		

		
		
	}
	
	

