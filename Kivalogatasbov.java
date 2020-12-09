/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivalogatas;
import java.util.Scanner;
/**
 *
 * @author Dénes
 */
public class Kivalogatasbov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n Kiválogatás tétele bővített\n");
        
        
        
        Scanner bemenet=new Scanner(System.in);
        System.out.print("Hány jegyet generáljunk? ");
        int jegyekSzama=bemenet.nextInt();
    
        int[] jegyek=new int[jegyekSzama];
  
        
        int[] egyesek=new int[jegyekSzama];
        int[] kettesek=new int[jegyekSzama];
        int[] harmasok=new int[jegyekSzama];
        int[] negyesek=new int[jegyekSzama];
        int[] otosok=new int[jegyekSzama];
        
        
        System.out.println("\nÉrdemjegyek: ");
        
        
        for (int i = 0; i <jegyekSzama; i++){
            jegyek[i]=(int)(Math.random()*5)+1;
            System.out.print(jegyek[i]+" ");
        }
        System.out.println("");
        
        int egyesekdb=0;
        int kettesekdb=0;
        int harmasokdb=0;
        int negyesekdb=0;
        int otosokdb=0;
        
        for (int i = 0; i < jegyekSzama; i++){
            if (jegyek[i]==1){
                egyesek[egyesekdb++]=jegyek[i];
            }
            if (jegyek[i]==2){
                kettesek[kettesekdb++]=jegyek[i];
            }
            if (jegyek[i]==3){
                harmasok[harmasokdb++]=jegyek[i];
            }
            if (jegyek[i]==4){
                negyesek[negyesekdb++]=jegyek[i];
            }
            if (jegyek[i]==5){
                otosok[otosokdb++]=jegyek[i];
            }
        }
                
        System.out.print("\nEgyesek tömb elemei: ");
        for (int i = 0; i <egyesekdb; i++){
            System.out.print(egyesek[i]+" ");
        }
        System.out.print("\nKettesek tömb elemei: ");
        for (int i = 0; i <kettesekdb; i++){
            System.out.print(kettesek[i]+" ");
        }
        System.out.print("\nHármasok tömb elemei: ");
        for (int i = 0; i <harmasokdb; i++){
            System.out.print(harmasok[i]+" ");
        }
        System.out.print("\nNégyesek tömb elemei: ");
        for (int i = 0; i <negyesekdb; i++){
            System.out.print(negyesek[i]+" ");
        }
        System.out.print("\nÖtösök tömb elemei: ");
        for (int i = 0; i <otosokdb; i++){
            System.out.print(otosok[i]+" ");
        }
        
         
        System.out.println("\nEgyesek száma:"+egyesekdb);
        System.out.println("\nKettesek száma:"+kettesekdb);
        System.out.println("\nHármasok száma:"+harmasokdb);
        System.out.println("\nNégyesek száma:"+negyesekdb);
        System.out.println("\nÖtösök száma:"+otosokdb);
    }
}
            
    