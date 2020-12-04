package ClassesAndObjectLections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    static class Reservation {
        String holderName;
        String phoneNumber;
        int seats;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Reservation> reservation = new ArrayList<>();


        String input = scan.nextLine();
        while (!input.equals("end")) {

            String[] nameAndSeats = input.split(" ");
            Reservation r = new Reservation();
            String phone = nameAndSeats[1];

            r.holderName = nameAndSeats[0];
            r.phoneNumber = phone;
            r.seats = Integer.parseInt(nameAndSeats[2]);

           reservation.add(r);

            input = scan.nextLine();
        }
        String guestName = scan.nextLine();
        int reservationIndex = -1;
        // този фор е същия като int reservationIndex = reservationHolders.indexOf(guestName);
        for (int i = 0; i < reservation.size(); i++) {
            Reservation reservations = reservation.get(i);
            if (guestName.equals(reservations.holderName)) {
                reservationIndex = i;
            }
        }

        if (reservationIndex != -1){
            Reservation reservations = reservation.get(reservationIndex);
            System.out.println(reservations.seats);
        }else {
            System.out.println("Sorry, no reservation for " + guestName);
        }
    }
}
