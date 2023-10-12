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
            musicalList.addSongToPlaylist(musicAdded);
            System.out.println("Playing " + musicAdded + "..");
        }else{
            System.out.println(musicalList.showMusicList());
            System.out.print("Enter the name of the desired song: ");
            String musicPlaying = sc.nextLine();
            musicalList.playSelectedMusic(musicPlaying);
        }
    }

    public void addSongToPlaylist(){
        System.out.print("Enter the name of the song to be added: ");
        String musicAdded = sc.nextLine();
        musicalList.addSongToPlaylist(musicAdded);
    }

    public void removeSongToPlaylist(){
        System.out.print("Enter the name of the song to be removed: ");
        String musicToRemove = sc.nextLine();
        musicalList.removeSongToPlaylist(musicToRemove);
    }

    public void addToFavorites(){
        System.out.print("Enter the name of the song to add it to your favorites list: ");
        String musicFavorite = sc.nextLine();
        musicalList.addToFavorites(musicFavorite);
    }

    public void removeSongToFavorites(){
        System.out.print("Enter the name of the song to remove it from your favorites: ");
        String removeMusicFavorite = sc.nextLine();
        musicalList.removeSongToFavorites(removeMusicFavorite);
    }

    public void showMusicList(){
        System.out.println(musicalList.showMusicList());
    }

    public void showFavoritesList(){
        System.out.println(musicalList.showFavoritesList());
    }


}



