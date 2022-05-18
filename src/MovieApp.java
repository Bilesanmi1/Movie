import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class MovieApp {
	public static void main(String[]args) {
		char choice = 'y';
		Scanner input = new Scanner(System.in);
		String cate  = "";
		boolean cateValid = false;
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("The Exorcist", "Horror"));
		movieList.add(new Movie("The Ring", "Horror"));
		movieList.add(new Movie("Citizen Kane", "Drama"));
		movieList.add(new Movie("The Godfather", "Drama"));
		movieList.add(new Movie("Star Wars" , "Scifi"));
		movieList.add(new Movie("Blade Runner", "Scifi"));
		movieList.add(new Movie("Toy Stroy 4", "Animated"));
		movieList.add(new Movie("Incredibles 2", "Animated"));
		movieList.add(new Movie("Up", "Animated"));
		movieList.add(new Movie("Jason", "Horror"));
		while(choice == 'y' && !(choice == 'n')) {
			try {
				System.out.println("What category are you interrested in?");
			cate = input.next();}
			catch(NullPointerException ex){
				System.out.println("Null value try again.");
				cate = input.next();
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Wrong try again");
				cate = input.next();
			}
			
			cateValid = validCate(cate,movieList);
			
			if(cateValid) {  
				for(Movie movie : movieList) {
					if(movie.getCategory().equals(cate)) {
						System.out.println(movie.getTitle());
					}
				}
				
			}else {
				System.out.println("Category not found");
			}
			System.out.println("Would you like to continue(y/n)");
			choice = input.next().charAt(0);
			
			while(!(choice == 'y') && !(choice == 'n')) {
			System.out.println("Wrong choice Would you like to continue(y/n)");
			choice = input.next().charAt(0);
			}
			
		
		}
	}
	public static boolean validCate(String cate, ArrayList<Movie> movieList) {
		boolean cateValid = false;
		for(Movie movie : movieList) {
			if(movie.getCategory().equals(cate)) {
				cateValid = true;
			}
		}
		return cateValid;
	}
}

	
