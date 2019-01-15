package v_2;
import java.util.Scanner;
public class läxa_2_lämmnain {
public static void main(String[] args) {
		
		
		double tal1=0;
		double tal2=0;
		double d=0;
		boolean exit = false;
		double[] numbers = new double[6];
		
		Scanner input=new Scanner(System.in);
	
		
		do {	
		    System.out.println("Välj: 1 Addition, 2 Subtraction, 3 Division, 4 Multiplikation, 5 Roten ur, 6 upphöjt, 7 prim tal ");
		    
		    int val=input.nextInt();
		
		    if (val==1) {
		    	double tal3=0;
		    	
		    	for (int i = 1; i < 6; i++) {
		    		System.out.println("Ska du inte skriva fler tal i inputen skriv 0");
		    		System.out.println("Skriv tal " + i);
		    		numbers[i] = input.nextDouble();
		    		tal3 = (tal3 + numbers[i]);
		    		System.out.println(tal3);
		    		}
				
			
			}
			else if (val==2) {
			
				double tal3=0;
				for (int i = 1; i < 6; i++) {
					System.out.println("Ska du inte skriva fler tal i inputen skriv 0");
					System.out.println("Ska du skriva ett positiv tal skriv - innan talet");
					System.out.println("Skriv tal " + i);
					numbers[i] = input.nextDouble();
					tal3 = (tal3 - numbers[i]);
					System.out.println(tal3);
				}
			}
			else if (val==3) {
			
			System.out.println("skriv ett tal");
			tal1=input.nextDouble();
			System.out.println("skriv ett till tal");
			tal2=input.nextDouble();
		    d =(tal1/tal2);
			System.out.println();
			System.out.println("svaret på " + tal1 + " / " + tal2 + " är " +d);
			}
			else if (val==4) {
			
				double tal3=1;
				for (int i = 1; i < 6; i++) {
					System.out.println("Ska du inte skriva fler tal i inputen skriv 1");
				System.out.println("Skriv tal " + i);
				numbers[i] = input.nextDouble();
				tal3 = (tal3 * numbers[i]);
				System.out.println(tal3);
				
				}
			}
		    else if (val==5) {
			
			System.out.println("skriv ett tal");
			tal1=input.nextDouble();	
			d = Math.sqrt(tal1);
			System.out.println();
			System.out.println(d);
			}
		    else if (val==6) {
	    	
		    System.out.println("skriv ett tal");
			tal1=input.nextDouble();
			System.out.println("skriv ett till tal");
			tal2=input.nextDouble();	
			d = Math.pow(tal1, tal2);
			System.out.println();
			System.out.println(d);
		    }
		    else if (val==7) {
		    	
				System.out.println("skriv ett tal");
				tal1=input.nextDouble();
				boolean flag = false;
		        for(int i = 2; i <= tal1/2; ++i)
		        {
		          
		            if(tal1 % i == 0)
		            {
		                flag = true;
		                break;
		            }
		        }

		        if (!flag)
		            System.out.println(tal1 + " Är ett primtal.");
		        else
		            System.out.println(tal1 + " Är inte ett primtal.");
			}
		    	 else {
            	exit = true;
            }
		}
		while (!exit);
		System.out.println("ERROR!!! klicka F11");
	}
}


