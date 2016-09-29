/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_act_preu_matricula;

import java.util.Scanner;

/**
 *
 * @author Tamoor Shahzad
 */
public class M5_act_preu_matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        int uf;
        System.out.println("Introduix el numero de UFS que vols matricular.");
        uf = lector.nextInt();
        
        if (uf < 12){
            System.out.println("El preu de matricula es: " + uf * 30 + " €");
        } else if ( uf >= 12) {
            System.out.println("El preu de matricula es: 380 €" );
        }
        
    }
    
}
