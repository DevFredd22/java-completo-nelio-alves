package programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.A026_Comment;
import entidades.A026_Post;

public class A026_Program {
	
	public static void main(String[] args) throws ParseException {
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		A026_Comment c1 = new A026_Comment("Have a nice trip!");
		A026_Comment c2 = new A026_Comment("Wow that's awesome!");
		A026_Post p1 = new A026_Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		A026_Comment c3 = new A026_Comment("Good night");
		A026_Comment c4 = new A026_Comment("May the Force be with you");
		A026_Post p2 = new A026_Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
	

}
