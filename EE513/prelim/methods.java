import java.util.*;
public class methods{
static Scanner scan = new Scanner(System.in);
public static void main(String[]args){
ArrayList<String> armor = new ArrayList<>();
ArrayList<String> Guns = new ArrayList<>();
ArrayList<String> Foods = new ArrayList<>();
Foods.add("dried jerky");
Foods.add("eggs");
Foods.add("crakers");
Foods.add("hotdog");
//
armor.add("kevlar");
armor.add("carbon fiber");
armor.add("chain mail");
armor.add("B.proof vest");
//
Guns.add("AK47");
Guns.add("M4A1");
Guns.add("SCORPION");
Guns.add("FAMAS");
//

do{
System.out.print("\nTo see inventory of food press 1\n");
System.out.print("To see invetory of armor press 2\n");
System.out.print("To see invetory of guns press 3\n");
System.out.print("To see all press 4\n");
System.out.print(":::::");

int option =scan.nextInt();
switch(option){

                  case 1:
                    System.out.print(Foods);
                    break;

                case 2:
                   System.out.print(armor);
                    break;
                          
                case 3:
                     System.out.print(Guns);
                    break;
                     
                case 4:
                     
                      System.out.print(Foods);
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please select a valid option (1-7).");
                    break;
            }
}while (true);





}


}

