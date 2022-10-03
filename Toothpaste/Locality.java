package Toothpaste;
import java.util.*;
public class Locality 
{
	    String name;
	    static int col;
	    static int pep;
	    static int pat;
	    static int dab;
	    static String ans="same values";
	    int ch,m;
	    static int countc,countm,countw;
	    int memberType;
	    String type;
	    Scanner scan = new Scanner(System.in);



	   public Locality() {
	        System.out.println("Enter Your Name");
	        this.name=scan.next();
	        System.out.println("Type 1 for children or 2 for men or 3 for women");
	        this.memberType=scan.nextInt();
	        if(memberType==1) {
	            this.type="children";
	            countc++;
	            System.out.println("enter which 1 for col 2 for pep 3 for pat 4 for dab");
	            ch=scan.nextInt();
	            Which(ch);
	        }
	        if(memberType==3) {
	            this.type="women";
	            countw++;
	            System.out.println("enter which 1 for col 2 for pep 3 for pat 4 for dab");
	            ch=scan.nextInt();
	            Which(ch);
	        }
	        if(memberType==2) {
	            this.type="men";
	            countm++;
	            System.out.println("enter which 1 for Colgate  2 for Pepsodent 3 for Patanjali 4 for Dabar");
	            ch=scan.nextInt();
	            Which(ch);
	        }}
	    public void Which(int ch) {
	        switch(ch) {
	        case 1: col++;
	        break;
	        case 2: pep++;
	        break;
	        case 3: pat++;
	        break;
	        case 4: dab++;
	        break;



	       }




	    }



	   public static String countMembers() {
	        if(col>pep && col>pat && col>dab) {
	            ans="max is col";
	        }
	        if(pep>col && pep>pat && pep>dab) {
	            ans="max is pep";
	        }
	        if(pat>col&& pat>pep && pat>dab) {
	            ans="max is patp";
	        }
	        if(dab>col && dab>pat && dab>pep) {
	            ans="max is dab";
	        }



	       return "Number of children: "+countc+"\nNumber of women: "+countw+"\nNumber of men: "+countm+"\ncol: "+col+"\npep: "+pep+"\npat: "+pat+"\ndab: "+dab+"\nmaximum is :"+ans;



	   }  



} 
