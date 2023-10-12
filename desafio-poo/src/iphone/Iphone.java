package iphone;

import java.util.Scanner;

import music.MusicPlayer;
import music.MusicalList;
import telephone.Telephone;
import telephone.TelephoneDirectory;

public class Iphone implements MusicPlayer, Telephone{
    Scanner sc = new Scanner(System.in);
    MusicalList musicalList = new MusicalList();
    TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

    //Music player methods
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

    //Telephone Methods
    @Override
    public void connect() {
        System.out.println("Calling..");
    }

    @Override
    public void attend() {
        System.out.println("Attend..");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail..");
    }

    public void addContactToList(){
        System.out.print("Enter contact number: ");
        int numberContact = sc.nextInt();
        System.out.print("Enter the contact name: ");
        String contactName = sc.nextLine();
        telephoneDirectory.addContactToList(numberContact, contactName);
    }

    public void removeContactFromList(){
        System.out.print("Enter the number of the contact you want to remove: ");
        int numberRemove = sc.nextInt();
        telephoneDirectory.removeContactFromList(numberRemove);
    }

    public void addContactToFavoriteList(){
        System.out.print("Enter contact number from your list to add to favorites: ");
        int numberAdd = sc.nextInt();
        telephoneDirectory.addToFavoriteContacts(numberAdd);
    }

    public void removeContactFromFavoriteList(){
        System.out.print("Enter the number of the contact you want to remove: ");
        int numberRemove = sc.nextInt();
        telephoneDirectory.removeContactFromFavoriteList(numberRemove);
    }

    public void showContactList(){
        System.out.println(telephoneDirectory.showContactList());
    }

    public void showFavoriteContactList(){
        System.out.println(telephoneDirectory.showFavoriteContactList());
    }


}



