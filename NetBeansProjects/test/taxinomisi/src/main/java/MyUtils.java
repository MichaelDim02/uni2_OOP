public class MyUtils {

    public static int anazitisiMeEpwnymo(Foititis foitlist[], String epwnymo) {
        boolean flag = false;
        int i = 0;
        while (i < foitlist.length) {
            if (epwnymo.equals(foitlist[i].getEpwn()) ) {
                flag = true;
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int anazitisiMeArMitrwou(Foititis foitlist[], short AM) {
        int l = 0;
        int h = foitlist.length - 1;
        int m = 0;
        while (l <= h) {
            m = (l + h)/2;
            if (foitlist[m].getAM() == AM) {
                return m;
            } else if (foitlist[m].getAM() > AM) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static int anadromiAnazMeArithMitrwou(Foititis foitlist[], short AM, int low, int high) {
        int l = 0;
        int h = foitlist.length - 1;
        int m = 0;
        while (l <= h) {
            m = (l + h)/2;
            if (foitlist[m].getAM() == AM) {
                return m;
            } else if (foitlist[m].getAM() > AM) {
                return anadromiAnazMeArithMitrwou(foitlist, AM, low, m-1);
            } else {
                return anadromiAnazMeArithMitrwou(foitlist, AM, m+1, high);
            }
        }
        return -1;
    }

    public static void insertSortAM(Foititis arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            String name = arr[j].getName();
            short key = arr[j].getAM();
            short yr = arr[j].getYear();
            int i = j-1;  
            while ( (i > -1) && arr[i].getAM() > key) {  
                arr[i+1].setName(arr[i].getName());
                arr[i+1].setYear(arr[i].getYear());
                i--;  
            }    
            arr[i+1].setName(name);
            arr[i+1].setYear(yr);
        }
    }

    public static void bubbleSortEE(Foititis[] arr) {  
    int n = arr.length;
    String temp;
    float temp0 = 0;
    int temp1 = 0;
    short tempAM;
    short tempEE;
    for(int i=0; i < n; i++) {  
         for(int j=1; j < (n-i); j++){  
                if(arr[j-1].getYear() > arr[j].getYear()){  
                    temp = arr[j-1].getEpwn();  
                    arr[j-1].setEpwn(arr[j].getEpwn());  
                    arr[j].setEpwn(temp);
                    
                    temp = arr[j-1].getName();  
                    arr[j-1].setName(arr[j].getName());  
                    arr[j].setName(temp);

                    tempAM = arr[j - 1].getAM();
                    arr[j - 1].setAM(arr[j].getAM());
                    arr[j].setAM(tempAM);

                    tempEE = arr[j - 1].getYear();
                    arr[j - 1].setYear(arr[j].getYear());
                    arr[j].setYear(tempEE);           
                }                
            }  
        }  
    }
    public static void selectSortEpwnymo(Foititis[] arr){
        String temp0;
        String temp1;
        short temp2;
        short temp3;
        
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j].getEpwn().compareTo(arr[index].getEpwn()) < 0){  
                    index = j;//searching for lowest index  
                }  
            }  
            temp0 = arr[index].getEpwn();   
            arr[index].setEpwn(arr[i].getEpwn());  
            arr[i].setEpwn(temp0);
            
            temp1 = arr[index].getName();   
            arr[index].setName(arr[i].getName());  
            arr[i].setName(temp1);
            
            temp2 = arr[index].getYear();   
            arr[index].setYear(arr[i].getYear());  
            arr[i].setYear(temp2);
            
            temp3 = arr[index].getAM();   
            arr[index].setAM(arr[i].getAM());  
            arr[i].setAM(temp3); 
        }  
    }
}
