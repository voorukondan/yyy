// Write your code here
package com.example.song;
package class Song {
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName= songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }
    public int getsongId() {
        return songId;
    }
    public void setsongId(int songId) {
        this.songId = songId;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getLyricist() {
        return lyricist;
    }
    public void setLyricist(String lyricist) {
        this.lyricist= lyricist;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String string) {
        this.singer=singer;
    }
    public String getMusicDirector() {
        return musicDirector;
    }
    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }
    
}