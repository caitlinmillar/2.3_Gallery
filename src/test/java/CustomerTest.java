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



}

