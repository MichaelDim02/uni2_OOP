class Main {
     
    static void anoi(int n, int apo, int pros, int other ) { 
        if ( n == 1 ) { 
            System.out.println(apo + " -> " + pros); 
            return; 
        } 
        anoi(n - 1, apo, other, pros); 
        System.out.println(apo + " -> " + pros); 
        anoi(n - 1, other, pros, apo); 
    } 

    public static void  main(String args[]) { 
        //δίσκoι
        int diskoi = 3;
        anoi(diskoi, 1, 3, 2);
    } 
    
}
