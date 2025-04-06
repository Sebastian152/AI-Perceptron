/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silve
 */
public class Main {
    public static void main(String[] args) {
        String[] consonantes = {"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        String[] vocales = {"a","e","i","o","u"};
        
        Neurona neurona = new Neurona(consonantes, vocales);
        neurona.entrenamiento("coco");
    }
}