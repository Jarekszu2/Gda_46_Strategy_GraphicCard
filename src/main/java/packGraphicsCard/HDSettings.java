package packGraphicsCard;

import lombok.Data;

@Data
public class HDSettings implements IGraphicsSettings {
    public int getNeededProcessingPower() {
        return 0;
    }

    public void processFrame(int[][] frame) {
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame[i].length; j++) {
                frame[i][j] = 3;
                System.out.print(frame[i][j] + " ");
            }
            System.out.println();
        }
    }
}
