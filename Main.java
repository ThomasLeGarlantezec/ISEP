import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question 4.1.1 :
		System.out.println("Bonjour,quel est votre prénom ?");
		
		//scanner permet de demander une variable
		Scanner scanner = new Scanner(System.in);
		
		//question 4.1.2 :
		String nom = scanner.nextLine();
		
		int unEntier = scanner.nextInt();
		float unReel = scanner.nextFloat();
		
		//on renvoie le résultat
		System.out.println("J’ai recupere un entier: " + unEntier);
		System.out.println("J’ai aussi recupere un reel: " + unReel);
		System.out.println("Bonjour " + nom);
		
		somme();
		division();
		volume();
		}
		
	//question 5.1 :
	public static void somme(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier entier");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme entier");
		int deuxiemeEntier = scanner.nextInt();
		int somme = premierEntier + deuxiemeEntier;
		System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egal a " + somme);
	}
	
	public static void division(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir le premier nombre il sera divisé");
		int premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir le deuxieme nombre celui qui divise");
		int deuxiemeEntier = scanner.nextInt();
		float division = (float)premierEntier/deuxiemeEntier;
		System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier + " est egal a " + division);
	}
	//question 5.3
public static void volume(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir la largeur");
		float premierEntier = scanner.nextInt();
		System.out.println("Veuillez saisir la longeur");
		float deuxiemeEntier = scanner.nextInt();
		System.out.println("Veuillez saisir la hauteur");
		float troisiemeEntier = scanner.nextInt();
		float volume = (float)premierEntier*deuxiemeEntier*troisiemeEntier;
		System.out.println("Le volume est egal a " + volume);
	}

}
