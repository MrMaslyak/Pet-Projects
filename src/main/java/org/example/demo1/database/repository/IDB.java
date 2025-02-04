package org.example.demo1.database.repository;

import java.io.File;

public interface IDB {
    void save_music(String author, String name,  String duration, File musicFile);
    void  loadData() ;
    void delete(int musicId);
    File getMusicFromDatabase(int musicId);
    int getMusicIdByName(String name);

}
