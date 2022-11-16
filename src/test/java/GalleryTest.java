import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GalleryTest {
    private Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Losh and Caitlin's Gallery", 300, "a picture lol");
    }


    @Test
    public void canBuyArtwork() {
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo DaVinci", 10, "Dancing Monkey");
        Artwork sunflower = new Artwork("Sunflower", "Vincent VanGogh", 15000, "Singing Monkey");
        Artwork theScream = new Artwork("The Scream", "Edvard Munch", 2, "Eating Monkey");
        Artwork girl = new Artwork("Girl with a pearl earring", "Johannes Vermeer,", 1000000, "Sleeping Monkey");
        Gallery gallery = new Gallery("Losh and Caitlin's Gallery", 300, "a picture lol");
        gallery.addArtwork(monaLisa);
        gallery.addArtwork(sunflower);
        gallery.addArtwork(theScream);
        gallery.addArtwork(girl);
//        customer.buyArtwork(gallery);
//        int buyArtwork = gallery.getBuyArtwork();
//        assertThat(buyArtwork).isEqualTo(1015012);


    }

    }

