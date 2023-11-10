/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise01_gra_delacruzjm;

/**
 *
 * @author MJ Dela Cruz
 */
public class Excercise01_GRA_DelaCruzJM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String comp_one = "BELIFT";
    String grp_one = "ENHYPEN";
    int mems_one = 7;
    double netM_one = 3.18;
    
    String comp_two = "pledis";
    String grp_two = "SEVENTEEN";
    int mems_two = 13;
    double netM_two = 12.36;
    
    String comp_three = "belift";
    String grp_three = "BTS";
    int mems_three = 7;
    double netM_three = 3600;
    
    String comp_four = "belift";
    String grp_four = "TXT";
    int mems_four = 5;
    double netM_four = 10;
       
    int sum_mems = mems_one + mems_two + mems_three + mems_four;
    int ave_mems = (mems_one + mems_two + mems_three + mems_four)/4;
    boolean enha_svt_mems = mems_one > mems_two; 
    boolean bts_txt_comp = comp_three == comp_four; 
    boolean enha_txt_netM = netM_one > netM_four; 
    
    System.out.println("""
                       HYBE Boy Group 1
                       Company: BELIFT
                       Group Name: ENHYPEN
                       No. of Members: 7
                       Net Worth (in Millions): 3.18
                       
                       """);
    System.out.println("""
                       HYBE Boy Group 2
                       Company: pledis
                       Group Name: SEVENTEEN
                       No. of Members: 14
                       Net Worth (in Millions): 12.36
                       
                       """);
    System.out.println("""
                       HYBE Boy Group 3
                       Company: bighit
                       Group Name: BTS
                       No. of Members: 7
                       Net Worth (in Millions): 3600
                       
                       """);
    System.out.println("""
                       HYBE Boy Group 4
                       Company: bighit
                       Group Name: TXT
                       No. of Members: 5
                       Net Worth (in Millions): 10
                       
                       """);

    System.out.println("Total boy group members from HYBE: " + sum_mems);
    System.out.println("Average boy group members from HYBE groups: " + ave_mems);
    System.out.println("Does ENHYPEN have more members than SEVENTEEN: " + enha_svt_mems);
    System.out.println("Does BTS and TXT have the same company: " + bts_txt_comp);
    System.out.println("Does ENHYPEN have less net worth (in Millions) than TXT: " + bts_txt_comp);
    }
    
}
