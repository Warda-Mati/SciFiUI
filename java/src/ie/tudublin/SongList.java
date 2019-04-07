package ie.tudublin;

import processing.data.TableRow;

public class SongList

{
    private int songno;
    private String title;

    public SongList(TableRow row)
    {
        this.songno = row.getInt("Number");
        this.title = row.getString("Song Title");
    }

    /**
     * @return the songno
     */
    public int getSongno() {
        return songno;
    }

    /**
     * @param songno the songno to set
     */
    public void setSongno(int songno) {
        this.songno = songno;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
}