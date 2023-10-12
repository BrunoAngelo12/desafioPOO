import iphone.Iphone;

public class Application {
    public static void main(String[] args) {
        Iphone cel = new Iphone();
        cel.playMusic();
        System.out.println();
        cel.pauseMusic();
        System.out.println();
        cel.selectMusic();
        System.out.println();
        cel.addSongToPlaylist();
        System.out.println();
        cel.addSongToPlaylist();
        System.out.println();
        cel.showMusicList();
        System.out.println();
        cel.addToFavorites();
        System.out.println();
        cel.addToFavorites();
        System.out.println();
        cel.showFavoritesList();
        System.out.println();
        cel.removeSongToFavorites();
        System.out.println();
        cel.removeSongToPlaylist();
        System.out.println();       
    }
}
