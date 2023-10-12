package iphone;

import java.util.Scanner;

import music.MusicPlayer;
import music.MusicalList;

public class Iphone implements MusicPlayer{
    Scanner sc = new Scanner(System.in);
    MusicalList musicalList = new MusicalList();

    @Override
    public void playMusic() {
        System.out.println("Playing music..");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused..");
    }

    @Override
    public void selectMusic() {
        if(musicalList.showMusicList().isEmpty()){
            System.out.println("Add songs to your playlist !");
            System.out.print("Enter the name of the song: ");
            String musicAdded = sc.nextLine();
            musicalList.addSongToPlaylist(null);
            System.out.println("Playing " + musicAdded + "..");
        }else{
            System.out.println(musicalList.showMusicList());
            System.out.println("Enter the name of the desired song: ");
            String musicPlaying = sc.nextLine();
        }
    }

}



