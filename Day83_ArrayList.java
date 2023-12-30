package day1_ngoding;

import java.util.ArrayList;

class Player{
    String nama;
    
    Player(String nama){
        this.nama = nama;
    }
}

public class Day83_ArrayList {
    public static void main(String[] args) {
         
        ArrayList <Player> play = new ArrayList<>();
        
        play.add(new Player("Mamat"));
        play.add(new Player("Upik"));
        play.add(new Player("Aco"));
        play.add(new Player("Udin"));
        
        for (int i = 0; i < play.size(); i++) {
            System.out.println(play.get(i).nama);
        }
    }
}
