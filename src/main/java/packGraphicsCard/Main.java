package packGraphicsCard;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        GraphicsCard graphicsCard = new GraphicsCard();
        HDSettings hdSettings = new HDSettings();
        int[][] frame = new int[3][4];

        graphicsCard.setStartegia(hdSettings);
        graphicsCard.wypisanieRamki(frame);

        System.out.println();
        graphicsCard.setStartegia(new MediumSettings());
        graphicsCard.wypisanieRamki(frame);

        System.out.println();
        int[][] frameLow = new int[2][5];
        graphicsCard.setStartegia(new LowSettings());
        graphicsCard.wypisanieRamki(frameLow);
    }
}
