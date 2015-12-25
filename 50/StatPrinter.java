/*
  Janet Zhang
  APCS1 pd5
  HW50 -- His Toe Grammar
  2015-12-16
*/

/*===========================================
  An AP-style question, for practice:
  Write the StatPrinter class below. The StatPrinter Object receives an
  ArrayList of nonnegative integers, then builds a frequency ArrayList in which
  the index values are the data and the entry at the index is the frequency.
  For example, if the received data is    2,3,2,5,1,3    then the frequency 
  list would be [0,1,2,2,0,1]. This is read as 0 zeroes, 1 one, 2 twos,
  2 threes, 0 fours, 1 five. The size of the frequency list is the equal to
  the maximum value of the data.

  A capability of the class is to calculate local modes from the frequency 
  list. A local mode is a value that is greater than the value at index-1 
  and greater than the value at index+1. A local mode is never at the end
  points of the list. For example, if the frequency list is [1,2,1,4,2,3,5] 
  then the local modes are 2 and 4.

  This class is also capable of printing a histogram of the frequencies, using
  '*'s to indicate a frequency amount. To print a histogram, the user specifies
  the longest sequence of '*'s used and then all other values are printed in 
  proportion to this value. For example, if longest bar is 10 and the frequency
  list is [1,2,1,4,2,3,5] then the histogram printed looks like this:

  0 : **
  1 : ****
  2 : **
  3 : ********
  4 : ****
  5 : ******
  6 : **********

  For each method, state run time efficiency using Big O notation.

  Tips for Awesome:
  * Look over all fxns, think a bit, decide which to tackle first.
  ( Simplest?  Prerequisites? . . . )
  * Develop 1 fxn at a time, test it, then move to next.
  * For coding today, what extra code do you need to get past Mr. Compiler?
  ===========================================*/

import java.util.ArrayList;
public class StatPrinter {

    // instance variable for frequencies of each integer in input ArrayList
    private ArrayList <Integer> _frequency;
    public String toString(){return _frequency.toString();}
    public ArrayList <Integer> getFrequency(){return _frequency;}
    //*************** QUESTION 02 **************************
    //precond:  data.size() > 0, each entry b/t 0,100 inclusive
    //postcond: _frequency.size() set to max(data) + 1
    //          _frequency.get(i) returns frequency of i in data
    //eg, for data [2,3,2,5,2,3]
    //  _frequency would be [0,0,3,2,0,1]
    public StatPrinter( ArrayList <Integer> data ) { 
	int y=(max(data)+1);
	_frequency=new ArrayList<Integer>(y);
	for (int i=0;i<y;i++){_frequency.add(0);}//makes size() not 0
	for (int x:data){
	    _frequency.set(x,_frequency.get(x)+1);//populate array for real
	}
    }//O(n)


    //*************** QUESTION 01 **************************
    //precond:  data.size() > 0
    //postcond: returns largest integer in data
    public Integer max( ArrayList <Integer> data ) { 
	int max=0;
	for(int i=0;i<data.size();i++){
	    if (data.get(i)>max){max=data.get(i);}//store the greater val
	}
	return max;
    }//O(n)


    //*************** QUESTION 03 **************************
    //postcond: returns true if i > 0 and i < _frequency.size() - 1
    //          and _frequency.get( i - 1 ) < _frequency.get( i )
    //          and _frequency.get( i + 1 ) < _frequency.get( i )
    //          Otherwise, returns false
    //eg, for _frequency [1,2,1,5,5,8,2,4]
    //    2 and 8 are local modes, so
    //    isLocalMode(0) -> false
    //    isLocalMode(1) -> true
    //    isLocalMode(5) -> true
    public boolean isLocalMode( int i ) { 
	return (i > 0) 
	    && (i < _frequency.size() - 1)
	    && ( _frequency.get( i - 1 ) < _frequency.get( i ) )
	    && ( _frequency.get( i + 1 ) < _frequency.get( i ) );
    }//O(1)


    //*************** QUESTION 04 **************************
    //postcond: returns list of modes in _frequency
    public ArrayList <Integer> getLocalModes() {
	ArrayList r=new ArrayList<Integer>();
	for(int i=0;i<_frequency.size();i++){
	    if (isLocalMode(i)) r.add(i);
	}
	return r;
    }//O(n)


    //*************** QUESTION 05 **************************
    //precond:  longestBar > 0
    //postcond: sends ASCII histogram to standard ouptput
    public void printHistogram( int longestBar ) { 
	int scaleFactor=longestBar/max(_frequency);
	for (int i=0;i<_frequency.size();i++){
	    _frequency.set(i,_frequency.get(i)*scaleFactor);
	}
	//with the new frequency list, now scaled
	for (int i=0;i<_frequency.size();i++){
	    System.out.println( i+": "+starPrinter(_frequency.get(i)) );
	}
    }//O(n^2)
 
    public String starPrinter(int s){
	String r="";
	for (int i=0;i<s;i++){ r+="*"; }
	return r;
    }//O(n)
}//end class StatPrinter
