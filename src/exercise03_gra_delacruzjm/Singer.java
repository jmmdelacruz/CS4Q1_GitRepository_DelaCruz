//Ex03_GRA_DelaCruzJM

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03_gra_delacruzjm;

/**
 *
 * @author MJ Dela Cruz
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong = new Song();
    static int totalPerformances;
    
    
    public void performForAudience(int peoplez) {
        noOfPerformances += 1;
        earnings += (peoplez * 100);
        totalPerformances += 1;
    }
    
    public void performForAudience(int peoplez, Singer collab) {
        noOfPerformances += 1;
        earnings = (peoplez * 100)/2;
        collab.noOfPerformances += 1;
        collab.earnings = (peoplez * 100)/2;
        totalPerformances += 2;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNoOfPerf() {
        return noOfPerformances;
    }
    
    public double getEarnings() {
        return earnings;
    }
    
    public Song getFavSong() {
        return favoriteSong;
    }
    
    public void setName(String ireumz) {
        name = ireumz;
    }
    
    public void setNoOfPerf (int noOfPerfz) {
        noOfPerformances = noOfPerfz;
    }
    
    public void setEarnings(double earnz) {
        earnings = earnz;
    }
    
    public void setFavSong(Song favSongz) {
        favoriteSong = favSongz;
    }
    
    public static int getTotalPerf() {
        return totalPerformances;
    }
    
    public static void addTotalPerf(int tPerfz){
        totalPerformances += tPerfz;
    }
    
}
