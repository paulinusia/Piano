import java.util.ArrayList;
import java.util.List;

/*
 * P: Prepare a class that stores notes played into an array, to show the history of the notes. The History class should also be able to clear the
 * 	  notes played as well.
 * I: input should be gathered from the keys class in a String form.
 * P: Strings of notes should be added to an ArrayList, as well as removed from the ArrayList
 * O: Program should show arrayList data in a pop-up box.
 */
public class History {
	private String note;
	private List<String> history = null;
	
	
	/* DEFAULT CONSTRUCTOR
	 * Sets note to null
	 * creates new arrayList */
	public History() {
	note = null;
	history = new ArrayList<String>();		}
	
	
	
	
	/* ADDS NOTE TO HISTORY
	 * If history is empty, it will remove the string "NO HISTORY" from the array  */
	public boolean addToHistory(String temp) {
		this.note = temp;
		
		if( history.contains("NO HISTORY!")) {
			history.remove("NO HISTORY!"); }
		
				history.add(note);
		return true;	}
	
	
	
	
	
	
		//RETURNS HISTORY OF NOTES PLAYED IN STRING FORMAT
		public String getHistory() {
			return history.toString();		}

		
		
		
		
		
		//CLEARS HISTORY ARRAY, AND ADDS STRING THAT SAYS "NO HISTORY!" TO THE ARRAY
		public void clearHistory() {
			history.clear();
			history.add("NO HISTORY!");		}
	
	
}
