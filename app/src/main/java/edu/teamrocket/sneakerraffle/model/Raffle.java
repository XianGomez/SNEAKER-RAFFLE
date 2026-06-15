package edu.teamrocket.sneakerraffle.model;

import java.util.List;

public interface Raffle {

    void sizesRun(Sizes minSize, Sizes maxSize);
    double price();
    void register(Entry entry);
    void register(Entry entry1, Entry entry2, Entry entry3);
    int totalEntries();
    List<String> listEntries();
    List<String> cancel(Entry entry);
    Entry draw();

}
