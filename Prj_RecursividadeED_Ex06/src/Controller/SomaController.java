/*
    Ponto de parada: subtrair o número2 até chegar a zero, finalizando a recursiva.
    A função é chamada a medida que ela subtrai 1 de num2, incrementa 1 em num1, mostrando no final o resultado
    da soma.
 
 */

package Controller;

public class SomaController {
    
    public SomaController(){
        
        super();
        
    }
    
    public int somaNaturais(int num1, int num2){
        
        if(num2 > 0){
           
            return somaNaturais(num1 + 1, num2 - 1);
            
        } else {                        
            
            return num1;
        }
    }
}
