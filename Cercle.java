//package test;

import java.util.Scanner;

public class Cercle {
	public static void main (String [] arg)
	{
		//declaration de variables.
		
		double unRayon, lePerimetre;
		
		//inviter l utilisateur a saisir une valeur pour le rayon
		
		System.out.print("valeur du Rayon : ");
		
		//saisie au clavier du rayon
		
		Scanner lectureAuClavier = new Scanner(System.in);
		unRayon = lectureAuClavier.nextDouble();
		
		//Calcul de la Circonference
		
		lePerimetre = 2*Math.PI*unRayon;
		
		//Affichage du resultat
		
		System.out.print("Le cercle de rayon " + unRayon + " a pour perimetre " + lePerimetre + "\n\n");
	}

}
