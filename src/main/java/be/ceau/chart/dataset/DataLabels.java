package be.ceau.chart.dataset;

import be.ceau.chart.enums.DataLabelsAlign;
import be.ceau.chart.enums.DataLabelsAnchor;
import be.ceau.chart.javascript.JavaScriptFunction;
import be.ceau.chart.options.Font;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * DataLabels management.
 *
 * @see <a href="https://chartjs-plugin-datalabels.netlify.app/">ChartJS DataLabels plugins</a>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class DataLabels {
    private boolean display;
    private DataLabelsAnchor anchor;
    private DataLabelsAlign align;
    private Font font;

    private JavaScriptFunction formatter;

    public DataLabels() {
    }

    public DataLabels(boolean display) {
        this.display = display;
    }

    public DataLabels(DataLabelsAlign align, DataLabelsAnchor anchor) {
        this.display = true;
        this.align = align;
        this.anchor = anchor;
    }

    public DataLabelsAlign getAlign() {
        return align;
    }

    public void setAlign(DataLabelsAlign align) {
        this.align = align;
    }

    public DataLabelsAnchor getAnchor() {
        return anchor;
    }

    public void setAnchor(DataLabelsAnchor anchor) {
        this.anchor = anchor;
    }

    public boolean isDisplay() {
        return display;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public JavaScriptFunction getFormatter() {
        return formatter;
    }

    public void setFormatter(JavaScriptFunction formatter) {
        this.formatter = formatter;
    }
}

