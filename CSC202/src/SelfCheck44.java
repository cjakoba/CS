/** 
 * Self Check 44, Chapter 6: Suppose you want to store the names of the weekdays. Should you use an array
 * list or an array of seven strings?
 *
 * @author Christian Jakob
 */

public class SelfCheck44 {
	public static void main(String[] args) {
		
		// Declare & initialize 'weekdays' array.
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		// Enhanced for-loop - prevents possible index errors.
		for(String element : weekdays) {
			System.out.println(element);
		}
	}
}
