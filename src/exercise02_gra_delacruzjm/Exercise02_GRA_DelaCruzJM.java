/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise03_gra_delacruzjm;

/**
 *
 * @author MJ Dela Cruz
 */
public class Exercise03_GRA_DelaCruzJM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HYBEClass enha = new HYBEClass();
        enha.company = "belift";
        enha.group = "ENHYPEN";
        enha.members = 7;
        enha.netM = 3.18;
        
        HYBEClass svt = new HYBEClass();
        svt.company = "pledis";
        svt.group = "SEVENTEEN";
        svt.members = 13;
        svt.netM = 12.36;
        
        HYBEClass bts = new HYBEClass();
        bts.company = "bighit";
        bts.group = "BTS";
        bts.members = 7;
        bts.netM = 3600;
        
        HYBEClass txt = new HYBEClass();
        txt.company = "bighit";
        txt.group = "TOMORROW BY TOGETHER";
        txt.members = 5;
        txt.netM = 10;
        
        System.out.println("HYBE Artists Directory");
        System.out.println("--------------------------------------\n");
        
        System.out.println(enha.group + " is from " + enha.company + ".");
        System.out.println(svt.group + " is from " + svt.company + ".");
        System.out.println(bts.group + " is from " + bts.company + ".");
        System.out.println(txt.group + " is from " + txt.company + ".");
        
        
        Singer bangtan = new Singer();
        bangtan.name = "BTS";
        bangtan.noOfPerformances = 0;   
        bangtan.earnings = 0;
        bangtan.favoriteSong = new Song();
        
        
        System.out.println("\n\n\n\nHYBE Artist's Performance");
        System.out.println("--------------------------------------\n");
                
        System.out.println("Name of Artist: " + bangtan.name);
        System.out.println("Number of Performances: " + bangtan.noOfPerformances);
        System.out.println("Earnings: " + bangtan.earnings);
        System.out.println("Favorite Song: " + bangtan.favoriteSong.songz);
        
        System.out.println("\n--------------------------------------");
        System.out.println("After 1 Performance");
        System.out.println("--------------------");
        
       
        bangtan.changeFavSong("Lights");
        bangtan.performForAudience(12);
        
        System.out.println("Name of Artist: " + bangtan.name);
        System.out.println("Number of Performances: " + bangtan.noOfPerformances);
        System.out.println("Earnings: " + bangtan.earnings);
        System.out.println("Favorite Song: " + bangtan.favoriteSong.songz);
        System.out.println("\n--------------------------------------\n");
        
        
        
        
        
    }
    
}
