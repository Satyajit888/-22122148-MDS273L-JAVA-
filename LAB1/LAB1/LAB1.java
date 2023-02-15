import java.util.*;

class LAB{
    public static void main(String[] args) {
        //25th Jan
        String nm,st;
        int ag;
        char gen;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your full name: ");
        nm=sc.nextLine();
        System.out.println("Enter your age: ");
        ag=sc.nextInt();
        System.out.println("Enter the gender m/f or M/F: ");
        gen=sc.next().charAt(0);
        if (gen=='M' || gen=='m'){
            System.out.println("MALE");
        }
        else if (gen=='F' || gen=='f'){
            System.out.println("FEMALE");
        }
        System.out.println("Enter the part of INDIA you are from(ENTER ONLY INITIALS IF ITS A 2 WORD STATE): ");
        st=sc.next();
        switch(st){
            case "AP":
            case "Karnataka":
            case "Kerala":
            case "TN":
                System.out.println("The student is from the SOUTHERN part of INDIA and the basic details of the students are: "+nm+","+ag+" and "+gen);
                break;
            case "Maharashtra":
            case "Gujarat":
            case "Goa":
                System.out.println("The student is from the WESTERN part of INDIA and the basic details of the students are: "+nm+","+ag+" and "+gen);
                break;
            case "Delhi":
            case "UP":
            case "Punjab":
                System.out.println("The student is from the Northern part of INDIA and the basic details of the students are: "+nm+","+ag+" and "+gen);
                break;
            case "Bihar":
            case "WB":
            case "Orissa":
                System.out.println("The student is from the EASTERN part of INDIA and the basic details of the students are: "+nm+","+ag+" and "+gen);
                break;
            case "Assam":
            case "Meghalaya":
            case "Tripura":
                System.out.println("The student is from the NORTH-EASTERN part of INDIA and the basic details of the students are: "+nm+","+ag+" and "+gen);
                break;
            default:
            System.out.println("Enter Name of your state with first letter as capital.");
        }        
    }
}