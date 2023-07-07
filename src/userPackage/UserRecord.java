
package userPackage;

import java.util.*;
import java.util.stream.Collectors;

public class UserRecord  {
    private List<User> users = new ArrayList<>();


    public void addUser(User user){
        boolean userExists=false;
        for(User element:users){
            if(element.getId()==user.getId()){
                userExists=true;
                System.out.println("Cannot add the User, Id already exists");
                break;
            }

        }
        if(!userExists){
            users.add(user);
            System.out.println("User added successfully");
        }

    }

    public void deleteUser(int id) {

        boolean userFound=false;
        for(User element:users){
            if(element.getId()==id){
                users.remove(element);
                System.out.println("User deleted successfully");
                userFound=true;
                System.out.println(element.toString());
                break;
            }

        }
        if(!userFound){
            System.out.println("Cannot delete the User, as User doesn't exists");
        }
    }

    public void updateUser(int id, Scanner sc) {

            boolean userFound=false;
            for(User element:users){
                if(element.getId()==id){
                    System.out.print(
                            "What is the new user name ? ");
                    element.setName(sc.next());
                    System.out.print(
                            "What is the new user email ? ");
                    element.setEmail(sc.next());
                    System.out.print(
                            "What is the new user Mobile No ? ");
                    element.setMobileNo(sc.next());
                    System.out.println("User updated successfully");
                    userFound=true;
                    System.out.println(element.toString());
                    break;
                }

            }
        if(!userFound){
            System.out.println("Cannot perform operation, as User doesn't exists");
        }
    }

    public void retrieveUser(int id,String email, Scanner sc) {

        boolean userFound=false;
        for(User element:users){
            if(element.getId()==id && element.getEmail().equals(email)){
                System.out.println("User Retrieved successfully");
                userFound=true;
                System.out.println(element.toString());
                break;
            }
        }
        if(!userFound){
            System.out.println("Cannot perform operation, as User doesn't exists");
        }
    }

    public void showAllUsers() {
        System.out.println(users.toString());
    }

}

