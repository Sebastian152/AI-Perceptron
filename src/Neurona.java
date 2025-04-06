/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebastián G.
 */
import java.util.ArrayList;
import java.util.Random;

public class Neurona {
    private String[] consonantes;
    private String[] vocales;
    private ArrayList<String> palabrasGeneradas;
    private Random random;
    
    public Neurona(String[] consonantes, String[] vocales) {
        this.consonantes = consonantes;
        this.vocales = vocales;
        this.palabrasGeneradas = new ArrayList<>();
        this.random = new Random();
    }
    
    public void entrenamiento(String palabraObjetivo) {
        int intentos = 0;
        int maxIntentos = 10000;
        boolean encontrada = false;
        
        while (intentos < maxIntentos && !encontrada) {
            String palabraGenerada = generarPalabra(2); // Genera palabras de 2 sílabas
            
            if (!palabrasGeneradas.contains(palabraGenerada)) {
                palabrasGeneradas.add(palabraGenerada);
                System.out.println(palabraGenerada + " | Línea de concatenación - " + (palabrasGeneradas.size()));
                
                if (palabraGenerada.equals(palabraObjetivo)) {
                    System.out.println(palabraObjetivo + " | Línea de concatenación - " + (palabrasGeneradas.size()) + " - Encontrado!");
                    encontrada = true;
                }
            }
            
            intentos++;
        }
        
        if (!encontrada) {
            System.out.println("La palabra '" + palabraObjetivo + "' no fue generada después de " + maxIntentos + " intentos.");
        }
    }
    
    private String generarPalabra(int silabas) {
        StringBuilder palabra = new StringBuilder();
        
        for (int i = 0; i < silabas; i++) {
            // Seleccionar una consonante aleatoria
            String consonante = consonantes[random.nextInt(consonantes.length)];
            // Seleccionar una vocal aleatoria
            String vocal = vocales[random.nextInt(vocales.length)];
            
            palabra.append(consonante).append(vocal);
        }
        
        return palabra.toString();
    }
    
    public ArrayList<String> getPalabrasGeneradas() {
        return palabrasGeneradas;
    }
}
