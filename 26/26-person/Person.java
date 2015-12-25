public class Person{
    //inst vars
    Face face; 
    Body body;
    private String name;
    
    //def constr
    public Person(){
        face=new Face();
	body=new Body();
	name="\nWilliam Shatner\n";
    }
    //ovrrdn constrs
    public Person(String fName, String lName){
	name="\n"+fName+" "+lName+"\n";
    }
    public Person(String fName, String lName, Face f){
        face=f;
	body=new Body();
	name="\n"+fName+" "+lName+"\n";
    }
    
    public String toString(){return face+""+body+name;}
    
    //mutators
    //public void setHair(String hair){face.setHair(hair);}// return face.getHair();}
    //public String setNose(String nose){
    //	face.setNose(nose);
    //	return face.getNose();}
    //accessors
    public Face getFace(){return face;}
    public Body getBody(){return body;}
    //public String getNose(){return face.getNose();}    

}
