public class MyUtils {
    /*
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
    } */
    //QUICK SORT
    public static int partition(Foititis arr[], int low, int high) {
        int pivot = arr[high].getAM(); 
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j].getAM() <= pivot)
            {
                i++;
  
                short temp = arr[i].getAM();
                arr[i].setAM(arr[j].getAM());
                arr[j].setAM(temp);
                
                String tempName = arr[i].getName();
                arr[i].setName(arr[j].getName());
                arr[j].setName(tempName);
                
                String tempE = arr[j].getEpwn();
                arr[i].setEpwn(arr[j].getEpwn());
                arr[j].setEpwn(tempE);
                
                short tempYear = arr[j].getYear();
                arr[i].setYear(arr[j].getYear());
                arr[j].setYear(tempYear);
            }
        }
  
        short temp0 = arr[i+1].getAM();
        arr[i+1].setAM(arr[high].getAM());
        arr[high].setAM(temp0);
        
        String tempName0 = arr[i+1].getName();
        arr[i+1].setName(arr[high].getName());
        arr[high].setName(tempName0);
        
        String tempE0 = arr[i+1].getEpwn();
        arr[i+1].setEpwn(arr[high].getEpwn());
        arr[high].setEpwn(tempE0);
        
        short tempYear0 = arr[i+1].getYear();
        arr[i+1].setYear(arr[high].getYear());
        arr[high].setYear(tempYear0);
  
        return i+1;
    }

    public static void quickSortAM(Foititis arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSortAM(arr, low, pi-1);
            quickSortAM(arr, pi+1, high);
        }
    }
    
    // MERGE SORT
    void merge(Foititis arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
 
        Foititis L[] = new Foititis[n1];
        Foititis R[] = new Foititis[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getEpwn().compareTo(R[j].getEpwn()) <= 0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            arr[k].setEpwn(L[i].getEpwn());
            i++;
            k++;
        }
 
        while (j < n2) {
            arr[k].setEpwn(R[j].getEpwn());
            j++;
            k++;
        }
    }
 
    void sort(Foititis arr[], int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;
 
            sort(arr, l, m);
            sort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }
    }
}
