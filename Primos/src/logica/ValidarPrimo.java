/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Jp
 */
public class ValidarPrimo {
    
    
    public ValidarPrimo(){
        
    }
    
    public boolean Primo(int numero){
        boolean retorno =  true;
       
        for(int i = numero-1 ; i > 1 ; i--){
            if((numero%i) == 0){
                retorno = false;
                break;
            }
        }
            
        return retorno;
    }
    
    
    
    
}
