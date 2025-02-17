package View;

import Controller.SomaController;

public class SomaPrincipal {
    
    public static void main (String args[]){
        
        SomaController sc = new SomaController();
        
        int numero1 = 5;
        int numero2 = 2;
        
        int soma = sc.somaNaturais(numero1, numero2);
        
        System.out.println("A SOMA É: " + soma + ".");
        
    }
}
