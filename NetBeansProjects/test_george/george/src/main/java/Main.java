/**
 *
 * @author george
 */
public class Main {
    public static void main(String[] args) {
        Owner ownerList[] = new Owner[2];
        Gasoline gasList[] = new Gasoline[5];
    
        gasList[0] = new Gasoline("0001", ownerList[0], 4, 1000, 10, 5.5);
        gasList[1] = new Gasoline("0002", ownerList[0], 2, 1000, 20, 5.6);
        gasList[2] = new Gasoline("0003", ownerList[1], 5, 2000, 10, 6.5);
        gasList[3] = new Gasoline("0004", ownerList[1], 4, 2500, 10, 6.7);
        gasList[4] = new Gasoline("0005", ownerList[0], 4, 1500, 25, 6.2);
    
        for (int i = 0; i < onwerList.length; i++) {
            ownerList[i].toString();
        }   
}
