package temp.closethunter;

import static java.util.Arrays.stream;

public class ClosetHunter
{
    public double[] think(double[] input, double outputSum) {
        double inputSum = stream(input).reduce(Double::sum).orElse(0);
        return stream(input).map(e -> e *= inputSum/outputSum).toArray();
    }
}
