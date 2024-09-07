/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.palindromo.business;

/**
 * Clase dedicada a declarar si una frase es un palindromo o no.
 * @author Akane
 */
public class Palindromos {

/**
 * esPalindromo
 * @param phrase - La frase que quieres comprobar si es o no palindromo.
 * @return Un tipo Boolean en donde True es un sí y False un no.
 */
    
public static boolean esPalindromo (String phrase){

  String phraseJoint = phrase.replaceAll("[^a-zA-Z]", "");
  phraseJoint = phraseJoint.toLowerCase();
  String phraseJointRevez = "";
  try{
    for (int i = 0; i < phraseJoint.length(); i++) {
    char ch = phraseJoint.charAt(i); 
    phraseJointRevez = ch + phraseJointRevez;}
  }
  catch(Exception e){
      System.out.println("Ocurrio un error.");
  }
  return phraseJoint.equals(phraseJointRevez); 
}
}
