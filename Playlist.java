import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("song 1");
    desertIslandPlaylist.add("song 2");
    desertIslandPlaylist.add("song 3");
    desertIslandPlaylist.add("song 4");
    desertIslandPlaylist.add("song 5");
    desertIslandPlaylist.add("song 6");
    desertIslandPlaylist.add("song 7");
    desertIslandPlaylist.add("song 8");

    for(int i = 0; i < desertIslandPlaylist.size(); i++) {
      System.out.println(desertIslandPlaylist.get(i));
    }
    System.out.println("size of the array: " + desertIslandPlaylist.size());
    for(int i = desertIslandPlaylist.size() -1; i >= 5; i--) {
      desertIslandPlaylist.remove(i);
    }

    String song3 = desertIslandPlaylist.get(3);
    String song4 = desertIslandPlaylist.get(4);

    desertIslandPlaylist.set(3, song4);
    desertIslandPlaylist.set(4, song3);

    for(int i = 0; i < desertIslandPlaylist.size(); i++) {
      System.out.println(desertIslandPlaylist.get(i));
    }
  }
  
}