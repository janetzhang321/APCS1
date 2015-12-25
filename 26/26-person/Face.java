public class Face{
    //inst vars
    private String hair;private String eyes;private String nose;private String mouth;
    //default constr
    public Face(){
	hair= "$$$$$$$";
	eyes= "| * - |";
	nose= "|  >  |";
	mouth="| \\__ |";
    }
    //overridden fxns
    public Face(String hair,
		String eyes,
		String nose,
		String mouth){
        setHair(hair);
        setEyes(eyes);
        setNose(nose);
        setMouth(mouth);
    }
    public  String toString(){
	return
	    getHair()+"\n"+
	    getEyes()+"\n"+
	    getNose()+"\n"+
	    getMouth()+"\n";
    }
	
    //mutators
    public String setHair(String hair){this.hair=hair; return hair;}
    public String setEyes(String eyes){this.eyes=eyes; return eyes;}
    public String setNose(String nose){String r=this.nose; this.nose=nose; return r;}
    public String setMouth(String mouth){this.mouth=mouth;return mouth;}
    //accessors
    public String getHair(){return this.hair;}
    public String getEyes(){return this.eyes;}
    public String getNose(){return this.nose;}
    public String getMouth(){return this.mouth;}
    
    
}
