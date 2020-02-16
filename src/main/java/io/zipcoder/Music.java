package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){ this.playList = playList; }

    public Integer selection(Integer startIndex, String selection) {
        int skipsRight = 0;
        int skipsLeft = 0;
            for (int i = startIndex; i < playList.length; i++) {
                if (i == playList.length) {
                    i = 0;
                }

                if (!playList[i].equals(selection)) {
                    skipsRight++;
                } else {
                    i = playList.length;
                }
            }

            for (int i = startIndex; i < playList.length; i--) {
                if (i == -1) {
                    i = playList.length - 1;
                }

                if (!playList[i].equals(selection)) {
                    skipsLeft++;
                } else {
                    i = playList.length + 1;
                }
            }
            return (skipsLeft > skipsRight) ? skipsRight : skipsLeft;
    }
}
