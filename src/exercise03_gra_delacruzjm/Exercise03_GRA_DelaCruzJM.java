//Ex03_GRA_DelaCruzJM

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
        enha.setCompany("belift");
        enha.setGroup("ENHYPEN");
        
        Singer engene = new Singer();
        engene.setNoOfPerf(2);
      
        HYBEClass svt = new HYBEClass();
        svt.setCompany("pledis");
        svt.setGroup("SEVENTEEN");
              
        HYBEClass bts = new HYBEClass();
        bts.setCompany("bighit");
        bts.setGroup("BTS");
        
        HYBEClass txt = new HYBEClass();
        txt.setCompany("bighit");
        txt.setGroup("TOMORROW BY TOGETHER");
        
        Singer moa = new Singer();
        moa.setNoOfPerf(3);
        
        Singer collabx = new Singer();
        
        
        System.out.println("HYBE Artists Directory");
        System.out.println("--------------------------------------\n");
        
        System.out.println(enha.getGroup() + " is from " + enha.getCompany() + ".");
        System.out.println(svt.getGroup() + " is from " + svt.getCompany() + ".");
        System.out.println(bts.getGroup() + " is from " + bts.getCompany() + ".");
        System.out.println(txt.getGroup() + " is from " + txt.getCompany() + ".");
        

        System.out.println("\n\n\nWeverse Con 2023 Performances");
        System.out.println("--------------------------------------\n");
                
        System.out.println("Name of Artist: " + enha.getGroup());
        System.out.println("Number of Performances: " + engene.getNoOfPerf());
        //System.out.println("Earnings: " + bangtan.earnings);
        //System.out.println("Favorite Song: " + bangtan.favoriteSong.songz);
        Singer.addTotalPerf(engene.getNoOfPerf());
        System.out.println("Total Number of Performances: " + Singer.getTotalPerf());
        System.out.println("\n\n");
        
        System.out.println("Name of Artist: " + txt.getGroup());
        System.out.println("Number of Performances: " + moa.getNoOfPerf());
        //System.out.println("Earnings: " + bangtan.earnings);
        //System.out.println("Favorite Song: " + bangtan.favoriteSong.songz);
        Singer.addTotalPerf(moa.getNoOfPerf());
        System.out.println("Total Number of Performances: " + Singer.getTotalPerf());
        
        
        System.out.println("\n\n\nCollaboration Performance");
        System.out.println("--------------------------------------\n");
        
        System.out.println("Name of Artists: " + enha.getGroup() + " and " + txt.getGroup());
        engene.performForAudience(50);
        engene.performForAudience(50, moa);
        System.out.println("Earnings of " + enha.getGroup() +  ": " + engene.getEarnings());
        System.out.println("Earnings of " + txt.getGroup() +  ": " + moa.getEarnings());
        System.out.println("Total Number of Performances: " + Singer.getTotalPerf() + "\n\n");
        
        
    }
    
}
