/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02_gra_delacruzjm;

/**
 *
 * @author MJ Dela Cruz
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong = new Song();
    
    public Singer() {
        favoriteSong.artistz = "BTS";
    }
    
    public void performForAudience(int peoplez) {
        noOfPerformances += 1;
        earnings += (peoplez * 100);
      }
    
 
    public void changeFavSong(String newSong) {
        favoriteSong.songz = newSong;
    }
}
