import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList();
    }

    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTill() {
        return this.till;
    }

    public void setTill(int till) {
        this.till = till;
    }

    public ArrayList<Artwork> getartworks() {
        return this.artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }


    public int getArtworkCount(){
        return this.artworks.size();
    }

}




