/**
 * Όνομα: Κώστας
 * Επίθετο: Κορδέλλος
 * ΑΜ: 2020071
 * @author kostas
 */
import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Misthotos misthotoi[] = new Misthotos[7];
        Job jobs[] = new Job[5];
        jobs[0] = new Job(0, 500);
        jobs[1] = new Job(1, 600);
        jobs[2] = new Job(2, 400);
        jobs[3] = new Job(3, 300);
        jobs[4] = new Job(4, 600);
        
        misthotoi[0] = new Misthotos("Petros", 2020, jobs[0], 1500, 6);
        misthotoi[1] = new Misthotos("Giannis", 2021, jobs[1], 1300, 3);
        misthotoi[2] = new Misthotos("Dimitris", 2022, jobs[2], 1200, 2);
        misthotoi[3] = new Misthotos("Kostas", 2023, jobs[3], 1100, 5);
        misthotoi[4] = new Misthotos("Giorgos", 2024, jobs[4], 1600, 4);
        
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter AM: ");
        

        String inputAM = myObj.nextLine();
        
        for (int i = 0; i < misthotoi.length; i++) {
            if (inputAM.equals(misthotoi[i].getAM())) {
                System.out.println("Found.");
                System.out.println(misthotoi[i].getAM() + misthotoi[i].salary(jobs[i].getBonus()));
            }
        }
        
        for (int i = 0; i < misthotoi.length; i++) {
            misthotoi[i].toString();
            jobs[i].toString();
        }
    }
}
