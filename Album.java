package com.JonathanCabujat;

import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String album;
    private LinkedList<Song> songs;

    public Album(String album) {
        this.album = album;
        this.songs = new LinkedList<>();
    }

    public String getAlbum() {
        return album;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        if (songs.isEmpty()) {
            this.songs.add(song);
            System.out.println(song.getTitle() + " successfully added to " + this.album);
            return;
        }
        if (!songOnFile(song.getTitle())) {
            this.songs.add(song);
            System.out.println(song.getTitle() + " successfully added to " + this.album);
        } else {
            System.out.println(song.getTitle() + " already existing on " + this.album);
        }
    }

    public void printSongs() {
        System.out.println(this.album + " songs:");
        Iterator<Song> songList = this.songs.iterator();
        int position = 0;
        while (songList.hasNext()) {
            position++;
            Song songPrint = songList.next();
            System.out.println(position + ". " + songPrint.getTitle() + " - " +
                    songPrint.getTime());
        }
    }

    public boolean songOnFile(String songTitle) {
        Iterator<Song> songList = this.songs.iterator();
        boolean alreadyStored = false;
        while (songList.hasNext()) {
            Song songStored = songList.next();
            if (songStored.getTitle().equals(songTitle)) {
                alreadyStored = true;
                break;
            }
        }
        return alreadyStored;
    }
}
