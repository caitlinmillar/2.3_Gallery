import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArtworkTest {
   private Artwork artwork;
   @BeforeEach

 public void setUp(){
 artwork = new Artwork("Mona Lisa","Davinci", 10,"dancingMonkey");
 }

 @Test
    public void hasTitle(){
       String title = MonaLisa.getTitle();
       assertThat(title).isEqualTo("Mona Lisa");
 }
 @Test
    public void hasArtist(){
       String artist =
 }


}
