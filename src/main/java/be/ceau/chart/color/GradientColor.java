package be.ceau.chart.color;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class GradientColor {
    /**
     * Map of stop color and position
     */
    private List<ColorStopGradient> colorStops = new ArrayList<>();

    public GradientColor() {
    }

    public GradientColor(List<ColorStopGradient> colorStops) {
        this.colorStops = colorStops;
    }

    public void addColorStop (ColorStopGradient colorStopGradient){
        colorStops.add(colorStopGradient);
    }

    public List<ColorStopGradient> getColorStops() {
        return colorStops;
    }

    public void setColorStops(List<ColorStopGradient> colorStops) {
        this.colorStops = colorStops;
    }
}
