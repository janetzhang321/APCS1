public class Driver{
    public static void main(String[] args){
	System.out.println(Stats.mean(2,5)); //int
	  System.out.println(Stats.mean(2.0,5)); //double
	  System.out.println(Stats.mean(2.5,2.3)); //double
	  System.out.println((int)5030.74003); //typecasting?
	  System.out.println(Stats.max(4,5)); //int
	  System.out.println(Stats.max(4.0,4)); //double
	  System.out.println(Stats.max(4.0000001,4.000001)); //double
	  System.out.println(Stats.geoMean(3,4)); //int
	  System.out.println(Stats.geoMean(3,6)); //int
	  System.out.println(Stats.geoMean(3.,6.)); //double
	  System.out.println(Stats.geoMean(5*Math.sqrt(2),5*Math.sqrt(2)));//double
	  System.out.println(Stats.geoMean(5,3,4));//int
	  System.out.println(Stats.geoMean(5.0,3.0,4.0));//double
	  System.out.println(Stats.geoMean(5.0,3,4));//double
	  System.out.println(Stats.max(3,4,5));
	  System.out.println(Stats.max(4.,5,3));
	  System.out.println(Stats.max(5,4.,3));
	  System.out.println(Stats.max(6,6,6.));
    }
}
