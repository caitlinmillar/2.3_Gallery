import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArtistTest {
    Artist picasso;

    @BeforeEach
    public void setUp(){
        picasso = new Artist("Picasso");
    }

    @Test
    public void hasName(){
        String name = picasso.getName();
        assertThat(name).isEqualTo("Picasso");
    }

}
