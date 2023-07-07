package userPackage;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int optionIndex=1;

    public static void main(String[] args) throws Exception {
        handleCrudOperation();
    }
    public static void selectOptions(Scanner sc) {
        // Printing statements displaying options on console
        System.out.println("\n_____________________Actions________________________");
        System.out.println("____________________________________________________");
        System.out.println("1: Add User");
        System.out.println("2: Update User");
        System.out.println("3: Delete User");
        System.out.println("4: Retrieve a User using ID & email");
        System.out.println("5: List of all UserUser Structure");
        System.out.println("0: Exit program");
        System.out.print("Enter your selection in Number(1,2,3,4,5,0): ");
        try{
        optionIndex = sc.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
    }
    public  static void handleCrudOperation() throws Exception{
        Scanner sc = new Scanner(System.in);
        UserRecord userRecord=new UserRecord();
        User user;
        int id=0;
        String email;

        do{
            selectOptions(sc);


            switch (optionIndex){
                case 1:
                    try {
                        System.out.println("Enter the user id");
                        id = sc.nextInt();
                        System.out.println("Enter the user Name");
                        String name = sc.next();
                        System.out.println("Enter the user Email");
                         email = sc.next();
                        if (!Validations.isValidEmail(email))
                            throw new Exception("Entered Email is invalid.");
                        System.out.println("Enter the user Plot No");
                        String plotNo = sc.next();
                        System.out.println("Enter the user Street");
                        String street = sc.next();
                        System.out.println("Enter the user City");
                        String city = sc.next();
                        System.out.println("Enter the user State");
                        String state = sc.next();
                        System.out.println("Enter the user MobileNo");
                        String mobileNo = sc.next();
                        if (!Validations.isValidMobileNo(mobileNo))
                            throw new Exception("Entered mobile number is invalid.");

                        user=new User(id,name,email,new Address(plotNo,street,city,state),mobileNo);
                        userRecord.addUser(user);
                    }catch (InputMismatchException e){
                        System.out.println("Id should be integer, Please try again");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Enter the user id");
                    try{
                    id=sc.nextInt();
                    userRecord.updateUser(id,sc);
                    }catch (InputMismatchException e){
                        System.out.println("Id should be integer, Please try again");
                    }
                    break;
                case 3:
                    System.out.println("Enter the user id");
                    try {
                        id = sc.nextInt();
                        userRecord.deleteUser(id);
                    }catch (InputMismatchException e){
                        System.out.println("Id should be integer, Please try again");
                    }
                    break;
                case 4:
                    System.out.println("Enter the user id");
                    try {
                        id = sc.nextInt();
                        System.out.println("Enter the user Email");
                        email = sc.next();
                        userRecord.retrieveUser(id, email, sc);
                    }catch (InputMismatchException e){
                        System.out.println("Id should be integer, Please try again");
                    }
                    break;
                case 5:
                    userRecord.showAllUsers();
                    break;
                case 0:
                    System.out.println("\nClosing the Program\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Input, Closing the Program\n");
                    System.exit(0);
                    break;
            }
        }
        while(optionIndex!=0);

    }
}