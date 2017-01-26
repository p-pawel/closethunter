package temp.closethunter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ClosetHunterTest {

    private  ClosetHunter closetHunter = new ClosetHunter();

    @Test
    public void test() {

        double[] input = new double[]{40, 60};

        double[] output = closetHunter.think(input, 1000);

        assertThat(output).hasSize(2);
        assertThat(output[0]).isNotEqualTo(400f);
        assertThat(output[1]).isNotEqualTo(600f);
    }
}