import java.util.ArrayList;

public class Gallery {
    private String name;
    private double till;
    private ArrayList<Artwork> artworks;
    private double artwork;
  //  private int artworkCount;

    public Gallery(String name, int till, String artwork) {
        this.name = name;
        this.till = till;
        this.artworks = new ArrayList<>();
        this.artwork = 100;
    }





    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill(){
        return till;
    }
    public void acceptPayment(double price) {
        till += price;
    }

    public ArrayList<Artwork> getArtworks() {
        return this.artworks;
    }
//
//    public void setArtworks(ArrayList<Artwork> artworks) {
//        this.artworks = artworks;
//    }
//    public void buyingArtwork(Gallery gallery){
//        ArrayList<Artwork> artworks = gallery.getArtworks();
//        for (Artwork artwork : artworks){
//            if (Gallery.getArtworkCount() > 0){
//            artworkCount += artwork.getPrice();
//
//            }
//        }
//
//
//        this.buyingArtwork= totalArtwork;
//    }

    public int getArtworkCount(){
        return this.artworks.size();
    }
    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

}




