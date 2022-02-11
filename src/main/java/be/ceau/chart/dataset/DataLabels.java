package be.ceau.chart.dataset;

import be.ceau.chart.enums.DataLabelsAlign;
import be.ceau.chart.enums.DataLabelsAnchor;

/**
 * DataLabels management.
 *
 * @see <a href="https://chartjs-plugin-datalabels.netlify.app/">ChartJS DataLabels plugins</a>
 */
public class DataLabels {
    private boolean display;
    private DataLabelsAnchor anchor;
    private DataLabelsAlign align;

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
}

