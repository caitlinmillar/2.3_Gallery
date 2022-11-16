import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Artwork> buyingArtwork;
    private Gallery gallery;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = 5000;
        this.buyingArtwork = new ArrayList<>();
    }
    public double getWallet(){
        return wallet;
    }

    public void payGallery(Artwork artwork) {
        if (this.wallet >= artwork.getPrice()) {
            // wallet goes down by price value
            wallet -= artwork.getPrice();
            // initiate accept payment in gallery
            gallery.acceptPayment(getWallet());
            wallet -= artwork.getPrice();
        }
        }


//    public boolean canBuy {
//    }

//    public String getName() {
//        return this.name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public int getWallet(){
//        return this.wallet;
//    }
//    public void setWallet(int wallet) {
//        this.wallet = wallet;
//    }

//    public int getBuyingArtwork(){
//        return buyingArtwork;
//    }
//    public void setBuyingArtwork(int buyingArtwork){
//        this.buyingArtwork = buyingArtwork;
//    }
//
//
//    public int getArtworkCount(){
//        return this.artworks.size();


    }

// write a function to take in artwork and gallery as a parameter
// reduce money in wallet and increase in till


//keep track of number of artworks


// look at galleries collection of artwork
// buy artwork from gallery
// update wallet for customer
// update till for gallery