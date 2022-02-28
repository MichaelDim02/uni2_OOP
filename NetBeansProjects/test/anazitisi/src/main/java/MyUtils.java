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
}
