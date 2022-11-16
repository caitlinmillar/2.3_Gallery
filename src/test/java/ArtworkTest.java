import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtworkTest {
   private Artwork artwork;
   @BeforeEach

 public void setUp(){
 artwork = new Artwork("Mona Lisa","DaVinci", 10,"Dancing Monkey");
 }

 @Test
    public void hasTitle(){
       String title = artwork.getTitle();
       assertThat(title).isEqualTo("Mona Lisa");
 }
 @Test
    public void hasArtist(){
       String artist = artwork.getArtist();
       assertThat(artist).isEqualTo("DaVinci");
 }

 @Test
    public void hasPrice(){
       int price = artwork.getPrice();
       assertThat(price).isEqualTo(10);
   }
    @Test
    public void hasNft(){
        String nft = artwork.getNft();
        assertThat(nft).isEqualTo("Dancing Monkey");
    }





}
