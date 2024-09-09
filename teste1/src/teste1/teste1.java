package teste1;


import java.util.Scanner;


public class teste1 {
	Scanner sc = new Scanner (System.in);
	
	
    public static void main(String [] args ){
    	Scanner sc = new Scanner (System.in);
    	
    	
    		
    	
    isaac (0 , 0 , 0 );	
     repete (0,0,0, 0,0,0,0);

    }
    
    
    
    
    static void isaac(int x, int y, double z) {
    	Scanner sc = new Scanner (System.in);
    	
    	System.out.println("digite o valor 1: ");
    	x = sc.nextInt();
    	
    	
    	System.out.println("Digite o valor 2:");
    	y = sc.nextInt();
    	z = y * x;
    	
    	System.out.println(z);
    }
 
    
    static void repete (int x, int y ,int res , int _1 , int _2, int _3 , int _4) {
    	Scanner sc = new Scanner (System.in);
    	
       	
    	
    	
    	System.out.println("Digite o valor 1: ");
		x = sc.nextInt();
	
		
	System.out.println("Digite o valor 1: ");
		y = sc.nextInt();
    	
    	
    	
    	System.out.println("digite 1 para somar: ");
    	System.out.println("digite 2 para subtração: ");
    	System.out.println("digite 3 para multiplicação: ");
    	System.out.println("digite 4 para divisão: ");
    	
    	
    	res = sc.nextInt();
    	
    	 
    	
    	
    	
    	
    	{
    		if (res == 1 ) {
    			System.out.println (x + y);
    		} else {
    			if ( res == 2) {
    				System.out.println (x - y);
    			}else {
    				if (res == 3) {
    					System.out.println (x * y);
    				} else {
    					if ( res == 4) {
    						System.out.println (x / y);
    					}else {
    						
    					}
    				}
    			}
    		}
    	

    }
    
    }
}







