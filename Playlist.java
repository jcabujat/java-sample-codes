package com.JonathanCabujat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Playlist {
    private String playList;
    private ArrayList<Album> albums;

    public Playlist(String name) {
        this.playList = name;
        this.albums = new ArrayList<>();
    }

    public void add(Album album){
        if (albums.isEmpty()) {
            albums.add(album);
            System.out.println(album.getAlbum() + " successfully added to " + playList);
            return;
        }
        if (!albumStored(album.getAlbum())) {
            albums.add(album);
            System.out.println(album.getAlbum() + " successfully added to " + playList);
        } else {
            System.out.println(album.getAlbum() + " already existing on " + playList);
        }
    }

    public LinkedList<Song> getSongs() {
        Iterator<Album> albumList = this.albums.iterator();
        LinkedList<Song> songList = new LinkedList<>();
        while (albumList.hasNext()) {
            Album albumStored = albumList.next();
            songList.addAll(albumStored.getSongs());
        }
        return songList;
    }

    private boolean albumStored(String albumName) {
        Iterator<Album> albumList = this.albums.iterator();
        boolean alreadyStored = false;
        while (albumList.hasNext()) {
            Album albumStored = albumList.next();
            if (albumStored.getAlbum().equals(albumName)) {
                alreadyStored = true;
                break;
            }
        }
        return alreadyStored;
    }


}
