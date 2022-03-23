package be.ceau.chart.dataset;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.TrendlineLinearStyle;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @see <a href=https://github.com/Makanz/chartjs-plugin-trendline/tree/v0.2.2>chartjs-plugin-trendline</a>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TrendlineLinear {

    private Color style;
    private TrendlineLinearStyle lineStyle;
    private Double width;

    public TrendlineLinear(Color style, TrendlineLinearStyle lineStyle, Double width) {
        this.style = style;
        this.lineStyle = lineStyle;
        this.width = width;
    }

    public TrendlineLinear(Color style) {
        this(style, TrendlineLinearStyle.solid, 1d);
    }

    public TrendlineLinear() {
    }

    public Color getStyle() {
        return style;
    }

    public void setStyle(Color style) {
        this.style = style;
    }

    public TrendlineLinearStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(TrendlineLinearStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
