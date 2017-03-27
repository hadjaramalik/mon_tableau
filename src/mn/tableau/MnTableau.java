/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.tableau;
import  java.util.Scanner;
/**
 *
 * @author bar
 */
public class MnTableau {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int[] monTableau=new int[10];
  int[]tab={12,15,13,10,8,9,13,14};
  int n;
  Scanner sc=new Scanner(System.in);
          
  boolean estLa=false;
  //terminal.ecrireString("Entre_le_nombre_a_chercher");
  System.out.println("Entez le nombre a chercher");
  n=sc.nextInt();
  // terminal.ecrireString("Entre le nombre a chercher");
     for(int i=0;i<tab.length;i++){
        if(tab[i]==n){
            estLa=true;
        }
    }
  if(estLa){
      //Terminal.ecrireStringln("le_nombre_est_dans_le_tableau");
      System.out.println("le nombre est dans le tableau");
  }else{
      //Terminal.ecrireStringln("le_nombre_n'est_pas_dans_le_tableau");
     System.out.println("le nombre n'est pas dans le tableau");
  }
    }
}

  
        
    
  
 
  
    

    
    
    

