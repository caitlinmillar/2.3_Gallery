import org.assertj.core.api.AbstractStringAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.geom.Area;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    private Artwork artwork;
    private Customer customer;

    @BeforeEach
    public void setUp(){
                this.customer = new Customer("Losh", 5000);
    this.artwork = new Artwork("flower", "me", 22, "crying");
    }

    @Test
    public void canGetWallet(){
        double actual = customer.getWallet();
        double expected = 5000;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void removesFromWallet(){
        double actual = (customer.getWallet()) -
                (artwork.getPrice());
        double expected = 4978;
        assertThat(actual).isEqualTo(expected);
    }

    }


