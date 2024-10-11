public class CoinFlip {
    public CoinFlip() {}

    public String flip() {
        int rand = (int) (Math.random() * 2);
        if (rand == 0) {
            return "Tails";
        } else {
            return "Heads";
        }
    }

    public double simulate(int flips) {
        int heads = 0;
        int tails = 0;
        while (flips > 0) {
            if (flip().equals("Tails")) {
                tails += 1;
            } else {
                heads += 1;
            }
            flips -= 1;
        }
        return ((double) heads / flips);
    }
}
