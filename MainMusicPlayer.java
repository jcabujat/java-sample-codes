package com.JonathanCabujat;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Album album1 = new Album("Album 1");
        Song song1 = new Song("Song1", "03:10");
        Song song2 = new Song("Song2", "03:15");
        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song1);
        album1.printSongs();
        Album album2 = new Album("Album 2");
        Song song3 = new Song("Song3", "04:00");
        Playlist playlist1 = new Playlist("Playlist1");
        playlist1.add(album1);
        playlist1.add(album1);
        playlist1.add(album2);
        LinkedList<Song> songs = playlist1.getSongs();

    }
}
