public class Absence{
    public static void twentyF(){
	int c=0; double x=1.0/3.0;
	for(;c<21;c+=1){x+=x*1.0/3.0;c+=1;}
	System.out.println(x);
    }
    public static void twentyW(){
	double x=1.0/3.0;
	int c=0;
	while (x<21){double tempx=x; x+=tempx*1.0/3.0; c+=1;}
	System.out.println(x);
    }
    public static void main(String[] args){twentyF(); twentyW(); }
}
//stopped at 7
