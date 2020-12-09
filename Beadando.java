/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beadando;

/**
 *
 * @author Dénes
 */
public class Beadando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Összegzés tétele
            //int tomb1[]=n{11,22,33,44,55};
      
        
        System.out.println("\nMegszámlálás tétele\n");
        int[] tomb = new int [5];
        
        int szamalalo1 = 0;
        
        int parosSzamlalo=0;
        
        int paratlanSzamlalo=1;
        int szamlalo = 0;
        
        for (int i = 0; i < 5; i++) {
            tomb[i] = (int) (Math.random()*99) + 1;
            szamlalo++;
               if(tomb[i]%2==0) {
                   parosSzamlalo++;
               }
        }
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < 5; i++) {
        System.out.print(i+1+". elem:"+" ");
                if(tomb[i]%2!=0){
        System.out.print("páratlan");
            }
                   else
        System.out.print(String.format("%,8d",tomb[i])+" \n");
        }
        
        
        System.out.println(szamlalo+" elemű a tömbünk \n");
        System.out.println("Ebből a tombből: "+parosSzamlalo+"db páros szám van");
        System.out.println("Ebből a tömbből: "+paratlanSzamlalo +"db páratlan szám van");
        
        
        
        
        
    }
        
        
        }    