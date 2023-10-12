import iphone.Iphone;

public class Application {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();
        //Methods Music Player
        iPhone.playMusic();
        System.out.println();
        iPhone.pauseMusic();
        System.out.println();
        iPhone.selectMusic();
        System.out.println();
        iPhone.addSongToPlaylist();
        System.out.println();
        iPhone.addSongToPlaylist();
        System.out.println();
        iPhone.showMusicList();
        System.out.println();
        iPhone.addToFavorites();
        System.out.println();
        iPhone.addToFavorites();
        System.out.println();
        iPhone.showFavoritesList();
        System.out.println();
        iPhone.removeSongToFavorites();
        System.out.println();
        iPhone.removeSongToPlaylist();
        System.out.println();
        iPhone.connect();
        System.out.println();    
        iPhone.attend();
        System.out.println();
        iPhone.startVoicemail();
        System.out.println();
        iPhone.addContactToList();
        System.out.println();
        iPhone.addContactToList();
        System.out.println();
        iPhone.removeContactFromList();
        System.out.println();

    }
}
