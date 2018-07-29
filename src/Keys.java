
import javax.sound.sampled.*;

import java.io.File;

/* 
 * P: Create class that creates key objects. The purpose of the key objects is to play different sounds from selected files.Clip will represent a data line
 *    where the audio can be pre-loaded instead of streamed real time This class should also be able to get the history of all of the notes played, and clear the history.
 *    There should also be a default sound for the keyboard.
 * I: User should be able to press button to select a string. The string selected then should be implemented into a "play" method for the note.
 * P: String to get user input, and arrayList that keeps track of all of the notes the user selected, an int to key track of the number of notes played
 * 	  folders to store the music.  
 * O: The output should be a sound. */


public class Keys extends History{


	
	 private String note;
	 private int numberOfKeysPlayed;
	 private Boolean notesEqual;
	 private String folder;
	 private Clip clip;
	 private File audioInputStream;
	 

 /* DEFAULT CONSTRUCTOR
  * Sets note to null
  * Sets default sound to a piano ( sets folder to Octave6)
  * Sets initial number of keys played to zero 		*/
	public Keys() {
		 note = null;
		 folder = "Octave6";
		 numberOfKeysPlayed = 0;	 }

	
/* LOADED CONSTRUCTOR
 * Allows for ability to play certain note from certain folder  */
	    public Keys(String note, String folder){
	      super();
	    	this.note = note;
	       this.folder = folder;    }
	    
	    
	    	    
	    /*ABILITY FOR KEYS TO PLAY MUSIC WHEN PRESSED
	     *  makes AudioSystem get clip, and set the input stream to the given folder
	     *  adds note played to history
	     *  increments number of keys played     */
	     public void playMusic(String temp){
	    	this.note = temp;
	    	
	    	  try{
	            clip = AudioSystem.getClip();
	            clip.open(AudioSystem.getAudioInputStream(new File(folder + "\\" + temp + ".wav")));
	            audioInputStream = (new File(folder + "\\" + temp + ".wav"));
	             clip.start();
	          
	        }catch(Exception e){
	            System.out.println("Some Sort of Key error.");  }
	    	  addToHistory(temp);
	    	  numberOfKeysPlayed++; 	}
	    
	    
	    
	    //RETURNS CURRENT CLIP
	    public Clip getAudio() {
	    	return clip;	}
	    
	    
	    //RETURNS CURRENT AUDIOSTREAM
	    public File getAudioInputStream() {
	    	return audioInputStream;	}
	    
	    
	    /*CHANGES SOUND TO TAP NOISE
	     * Switches folders */
	    public void changeToClick() {
	    	folder = "instrument2";	  }
	    
	    /*CHANGES SOUND TO PIANO
	     * Switches folders */
	    public void changeToPiano() {
	    	folder = "Octave6";	}
	    
	    /*CHANGES SOUND TO BOX
	     * Switches folders*/
	    public void changeToBox() {
	    	folder = "instrument3";   }
	    
	    /*CHANGES SOUND TO CHEMLEAD
	     * Switches folders*/
	    public void changeToWah() {
	    	folder = "chemLead";	   }
	    
	   
		//RETURNS TOTAL NUMBER OF KEYS PLAYED
	   public int getNumberOfKeysPlayed() {
		   return numberOfKeysPlayed;   }
	   
	   //CLEARS NUMBER OF KEYS PLAYED
	   public void clearNumberOfKeysPlayed() {
		   numberOfKeysPlayed = 0;	  }
	   
	   
	
	   //COMPARES NOTES TO SEE IF THEY ARE EQUAL
	   public boolean equals(String temp) {
		   
		   if(this.note.equals(temp)) {
			   notesEqual = true; }
		   
	   return notesEqual;	}

	   
	   
	   
	   
    }





