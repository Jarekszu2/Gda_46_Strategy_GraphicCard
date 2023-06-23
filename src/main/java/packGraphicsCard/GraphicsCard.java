package packGraphicsCard;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GraphicsCard {
    private IGraphicsSettings startegia;

    public GraphicsCard(IGraphicsSettings startegia) {
        this.startegia = startegia;
    }

    public void setStartegia(IGraphicsSettings iGraphicsSettings) {
        startegia = iGraphicsSettings;
    }

    public void wypisanieRamki(int[][] frame) {
        startegia.processFrame(frame);
    }
}
