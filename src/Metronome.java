import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/* 
 * P: Metronome class should have 3 private variables, infinityLoop, clip, and isPlaying. InfinityLoop will be the default for number of
 * 	  times the metronome audio is repeated. Clip will represent a data line where the audio can be pre-loaded instead of streamed real time.
 * 	  isPLaying will be a boolean that will first be initialized to false, but then set to true once a clip is loaded.
 * I: No input necessary, unless changing the amount of time the audio is looped
 * P: Play pre-loaded audio from file, and be able to stop that audio when user asks the program to.
 * O: The Metronome should start and stop when the corresponding buttons are pressed. The metronome should also stop before another tempo is played.
 * 	  The metronome should also continue to play while the piano keys are playing. */

public class Metronome extends Keys{
	private double infinityLoop;
    private Clip clip;
    private boolean isPlaying;

    

    
    /* 	 DEFAULT CONSTRUCTOR
     *  sets infinityLoop to infinity
     *  Initializes isPlaying to false  */ 
    public Metronome(){
    	super();
    	infinityLoop = Double.POSITIVE_INFINITY;
        isPlaying = false;  }
    
    
    
    
    
//Sets the amount of times the metronome audio is repeated
    public void setMetronome(int loop){
        this.infinityLoop = loop;  }

   

    
    

    /* ABILITY TO PLAY METRONOME
     * closes any other clips that are currently playing
     * makes AudioSystem get clip, and set the input stream to the given folder
     * sets isPlaying to true to make sure that sounds do not play consecutively */
    public Boolean playBeat(String temp){
    	if(isPlaying) {
    		clip.close();	}
        try{
         {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("Octave6\\"+ temp+ ".wav")));
            clip.loop((int) infinityLoop);
            isPlaying = true;		}
        	 
        	 
           }catch(Exception e) {
            System.out.println("Metronome Error");	} 
		return true;	 }
    
    
    
    
    //Closes all lines of audio
    public void stopBeat(){
      clip.close();		}


    
    
	}


