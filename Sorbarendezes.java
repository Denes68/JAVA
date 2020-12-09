/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorbarendezes;
import java.util.Scanner;
/**
 *
 * @author Dénes
 */
public class Sorbarendezes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nSorbarendezés tétele ");
        
        System.out.print("Hány elemű tömböt szeretne létrehozni? ");
        Scanner bemenet=new Scanner(System.in);
        int elemSzam=bemenet.nextInt();
        int[] szamok=new int[elemSzam];
        int negativ [] = new int [elemSzam*2];
        
        //tömbök feltöltése - elemek random értéket kapnak
        for (int i = 0; i < elemSzam; i++) {
            szamok[i]=(int) (Math.random()*100)-50;
            
        }
        
        //tömb kiíratása
        System.out.println("\nTömbünk elemei:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
            
        }
        //tömb sorbarendezett kiíratása: buborékos rendszer
           for (int i = 0; i < elemSzam-1; i++) {
               for (int j = 0; j < elemSzam-1; j++) {
                   if (szamok[j]>szamok[j+1]) {
                       int temp=szamok[j];
                       szamok[j]=szamok[j+1];
                       szamok[j+1]=temp;
                   }
               }
        }
        System.out.println("\nRendezett tömbünk:");
        for (int i = 0; i < elemSzam; i++) {
            System.out.print(szamok[i]+" ");
        }
         int negativDb=0;
       
       for (int i = 0; i < elemSzam; i++) {
            if (szamok[i]<0) {
                negativ[negativDb++]=szamok[i];
                
            }
        }
       int negativOsszeg=0;
       System.out.println("\nNegatív számok növekvő sorrend szerint: ");
        
            if (negativDb > 0){
                for (int i = 0; i < negativDb-1; i++) {
                for (int j = 0; j < negativDb-i-1; j++) {
                if (szamok[j]>szamok[j+1]) {
                    int temp=szamok[j];
                    szamok[j]=szamok[j+1];
                    szamok[j+1]=temp;
                }
            }
                    System.out.print(negativ[i]+" ");
                    negativOsszeg = negativOsszeg+negativ[i];
                }
            }
        
    }
    
}
