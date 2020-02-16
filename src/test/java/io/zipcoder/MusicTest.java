package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class MusicTest {

    @Test
    public void selectionTest1(){

        String[] playlist = {"drowning","hitem","goodtimesroll","peace"};
        Music music = new Music(playlist);
        Integer startingIndex = 1;
        String selection = "peace";
        Integer expected = 2;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void selectionTest2(){

        String[] playlist = {"sayit","runningaway","loveisgone","loveisgone"};
        Music music = new Music(playlist);
        Integer startingIndex = 0;
        String selection = "loveisgone";
        Integer expected = 1;
        Integer actual = music.selection(startingIndex, selection);
        Assert.assertEquals(expected, actual);
    }
}
