package music;

import java.util.LinkedHashSet;
import java.util.Set;

public class MusicalList {
    Set<String> musicalList = new LinkedHashSet<>();
    Set<String> favoriteList = new LinkedHashSet<>();

    
    
    public MusicalList() {
        this.musicalList = new LinkedHashSet<>();
        this.favoriteList = new LinkedHashSet<>();
    }

    public void addSongToPlaylist(String music){
        musicalList.add(music);
        System.out.println("Song added to playlist!");
    }

    public void removeSongToPlaylist(String music){
        for(String m : musicalList){
            if(m.equalsIgnoreCase(music)){
                musicalList.remove(music);
                System.out.println("Song removed from playlist!");
            }
        }
    }

    public void addToFavorites(String music){
        favoriteList.add(music);
        System.out.println("Song added to favorites!");
    }

    public void removeSongToFavorites(String music){
        for(String m : favoriteList){
            if(m.equalsIgnoreCase(music)){
                favoriteList.remove(music);
                System.out.println("Song removed from favorites!");
            }
        }
    }

    public Set<String> showMusicList(){
        return musicalList;
    }

    public Set<String> showFavoritesList(){
        return favoriteList;
    }

    public void playSelectedMusic(String musicPlaying){
        for(String m : musicalList){
            if(m.equalsIgnoreCase(musicPlaying)){
                System.out.println("Playing " + m + "...");
            }
        }
    }

}
