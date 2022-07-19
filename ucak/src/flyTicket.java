import java.util.Scanner;

public class flyTicket {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int distance, age, trip;
        double perKM=0.1,aged1=0.5,aged2=0.1,aged3=0.3,rtd=0.2;
        double normalp,ageDiscount1,ageDiscount2,ageDiscount3,total,rtdtotal;

        System.out.print("Enter your distance: ");
        distance= input.nextInt();

        System.out.print("Enter Your Age: ");
        age = input.nextInt();

        System.out.print("Enter Your Trip Choice: "+ "\n 1-One Way \n 2- Round Trip\n" );
        trip= input.nextInt();

        switch (trip) {

            case 1:
                if (distance < 0 || age < 0) {
                    System.out.print("Wrong Entry!");
                }
                if (age<12){
                    normalp = distance * perKM;
                    System.out.print("Normal Price: "+normalp+ " TL\n");
                    ageDiscount1 = aged1 * normalp;
                    System.out.print("Age Discount: "+ageDiscount1 +" TL\n");
                    total= normalp - ageDiscount1;
                    System.out.print("Your Total: "+ total + " TL\n");
                    break;
                } else if (age>12 && age<24) {
                    normalp = distance * perKM;
                    System.out.print("Normal Price: "+normalp +" TL\n");
                    ageDiscount2 = aged2 * normalp;
                    System.out.print("Age Discount: "+ageDiscount2 +" TL\n");
                    total = normalp - ageDiscount2;
                    System.out.print("Your Total: " + total + " TL\n");
                    break;

                } else if (age>65) {

                    normalp = distance * perKM;
                    System.out.print("Normal Price: "+normalp +" TL\n");
                    ageDiscount3 = aged3 * normalp;
                    System.out.print("Age Discount: "+ageDiscount3 +" TL\n");
                    total = normalp - ageDiscount3;
                    System.out.print("Your Total: " + total + " TL\n");
                }
                break;

                case 2:
                    if (distance < 0 || age < 0) {
                        System.out.print("Wrong Entry!");
                    }
                    if (age<12){
                        normalp = distance * perKM;
                        System.out.print("Normal Price: "+normalp+" TL\n");
                        ageDiscount1 = aged1 * normalp;
                        System.out.print("Age Discount: "+ ageDiscount1+" TL\n");
                        total= normalp - ageDiscount1;
                        System.out.print("Your Total: " + total + " TL\n");
                        rtdtotal= (total-(total*rtd))*2;
                        System.out.print("Your Roun Trip Total: "+ rtdtotal + " TL\n");
                        break;
                    } else if (age>12 && age<24) {
                        normalp = distance * perKM;
                        System.out.print("Normal Price: "+normalp+" TL\n");
                        ageDiscount2 = aged2 * normalp;
                        System.out.print("Age Discount: "+ ageDiscount2+" TL\n");
                        total= normalp - ageDiscount2;
                        System.out.print("Your Total: " + total + " TL\n");
                        rtdtotal= (total-(total*rtd))*2;
                        System.out.print("Your Roun Trip Total: "+ rtdtotal + " TL\n");
                        break;

                    } else if (age>65) {
                        normalp = distance * perKM;
                        System.out.print("Normal Price: "+normalp+" TL\n");
                        ageDiscount3 = aged3 * normalp;
                        System.out.print("Age Discount: "+ ageDiscount3+" TL\n");
                        total= normalp - ageDiscount3;
                        System.out.print("Your Total: " + total + " TL\n");
                        rtdtotal= (total-(total*rtd))*2;
                        System.out.print("Your Roun Trip Total: "+ rtdtotal + " TL\n");
                    }
                    break;
        }
    }
}
