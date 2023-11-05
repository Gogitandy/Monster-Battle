import java.util.Scanner;

public class Monster_Battel {
   private static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
	        //get monsters names and weapons
            System.out.println("Enter name for first monster: ");
            String firstMonsterName = scnr.next();
            System.out.println("Enter name for first monster's weapon: ");
            String firstMonsterWeapon = scnr.next();
            System.out.println("Enter first monster's health: ");
            int firstMonsterHealth = scnr.nextInt();
            System.out.println("Enter max dagmage for first monster's weapon: ");
            int firstMonsterDamage = scnr.nextInt();
            System.out.println("Enter name for second monster: ");
            String secondMonsterName = scnr.next();
            System.out.println("Enter name for second monster's weapon: ");
            String secondtMonsterWeapon = scnr.next();
            System.out.println("Enter second monster's health: ");
            int secondMonsterHealth = scnr.nextInt();
            System.out.println("Enter max dagmage for second monster's weapon: ");
            int secondMonsterDamage = scnr.nextInt();

			// instantiate 2 Weapon objects
	        Weapon weapon1 = new Weapon(firstMonsterWeapon, firstMonsterDamage);
	        Weapon weapon2 = new Weapon(secondtMonsterWeapon, secondMonsterDamage);
	        // instantiate 2 Monster objects
	        Monster monster1 = new Monster(firstMonsterName, firstMonsterHealth, weapon1);
	        Monster monster2 = new Monster(secondMonsterName, secondMonsterHealth, weapon2);
	        // pause before advancing to the first round
	            System.out.print("\nPress ENTER to continue...");
	            scnr.nextLine();
            // we start with round 1 of the fight
	        int round = 1;
	        // battle continues in rounds until one (or both ) monster have a health the is <= 0
	        while (monster1.getHealthScore() > 0 && monster2.getHealthScore() > 0) {
	            int damage1 = monster1.attack(monster2); // first monster attacks second monster
	            int damage2 = monster2.attack(monster1); // second monster attacks first monster
	            // report the results for this round
	            System.out.println("========================================");
	            System.out.println("Round #" + round);
	            System.out.println("----------------------------------------");

	            System.out.println(monster1.getName() + " attacks " +
	monster2.getName() +
	                               " with " + monster1.getWeaponName() +
	                               ", doing " + damage1 + " points of damage.");

	            System.out.println(monster2.getName() + " attacks " +
	monster1.getName() +
	                               " with " + monster2.getWeaponName() +
	                               ", doing " + damage2 + " points of damage.");
	            System.out.println("----------------------------------------");
	            System.out.println(monster1.getName() + " Health = " +
	monster1.getHealthScore());
	            System.out.println(monster2.getName() + " Health = " +
	monster2.getHealthScore());
	            // pause before advancing to the next round
	            System.out.print("\nPress ENTER to continue...");
	            scnr.nextLine();
	            // advance to the next round
	            round += 1;
	        }
	        // we made it out of the loop because one (or both ) monster have a health the is <= 0
	        // now we must determine the winner (if there is one)
	        String winner = "No Monster";

	        if (monster1.getHealthScore() > 0) {
	               winner = monster1.getName();
	        }
	        if (monster2.getHealthScore() > 0) {
	               winner = monster2.getName();
	        }
	        // report the winner
	        System.out.println("The winner is " + winner + "!");

	}
}
