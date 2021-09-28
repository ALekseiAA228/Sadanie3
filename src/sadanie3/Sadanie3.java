/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadanie3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Sadanie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Введите Фамилию");
        String userSurname = scanner.nextLine();
        System.out.println(userName);
        System.out.println("Введите месяц словами");
        String userMounth = scanner.nextLine();
        System.out.println("Введите день");
        int userDay= scanner.nextInt();
        System.out.println("Введите год");
        int userYears= scanner.nextInt();
        System.out.println(userName+" "+userSurname+" родился "+userDay+" "+userMounth+" "+userYears+" года");
        
        
        
    }
    
}
