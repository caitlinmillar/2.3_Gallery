import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {
    Customer losh;

    @BeforeEach
    public void setUp(){
        losh = new Customer("Losh", 50000000);
    }

    @Test
    public void hasName(){
        String name = losh.getName();
        assertThat(name).isEqualTo("Losh");
    }

    @Test
    public void hasWallet(){
        int wallet = losh.getWallet();
        assertThat(wallet).isEqualTo(50000000);
    }

    @Test
    public void canBuyArtwork(){
        Artwork monaLisa = new Artwork("Mona Lisa", "Leonardo DaVinci", 10, "Dancing Monkey");
        Artwork sunflower = new Artwork("Sunflower", "Vincent VanGogh", 15000, "Singing Monkey");
        Artwork theScream = new Artwork("The Scream", "Edvard Munch", 2, "Eating Monkey");
        Artwork girlWithAPearlEarring = new Artwork("Girl with a pearl earring", "Johannes Vermeer,", 1000000, "Sleeping Monkey");
    }



}

