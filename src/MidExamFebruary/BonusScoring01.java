package MidExamFebruary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BonusScoring01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scan.nextLine());
        int countLectures = Integer.parseInt(scan.nextLine());
        int initialBonus = Integer.parseInt(scan.nextLine());

        if(countOfStudents > 0) {
            List<Double> bonusList = new ArrayList<>();
            double max = 0;
            for (int i = 0; i < countOfStudents; i++) {
            double attendances = Double.parseDouble(scan.nextLine());
            if(attendances > max){
                max = attendances;
            }
            bonusList.add((attendances/countLectures) * (5 + initialBonus));
            }
            System.out.printf("Max Bonus: %.0f.%n", Math.ceil(Collections.max(bonusList)));
            System.out.printf("The student has attended %.0f lectures.", max);
        }else{
            System.out.println("Max Bonus: 0.");
            System.out.println("The student has attended 0 lectures.");
        }


    }
}
