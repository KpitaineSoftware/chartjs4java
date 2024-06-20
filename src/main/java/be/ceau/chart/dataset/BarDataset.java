/*
	Copyright 2018 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.dataset;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import be.ceau.chart.color.Color;
import be.ceau.chart.enums.PointStyle;
import be.ceau.chart.options.elements.Fill;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.enums.BorderSkipped;
import be.ceau.chart.objects.OptionalArray;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarDataset extends BackgroundBorderHoverDataset<BarDataset, BigDecimal> {

    /**
     * @see #setLabel(String)
     */
    private String label;

    /**
     * @see #setXAxisID(String)
     */
    private String xAxisID;

    /**
     * @see #setYAxisID(String)
     */
    private String yAxisID;

    /**
     *
     */
    private String type;

    /**
     * @see #setLineTension(Float)
     */
    private Float lineTension;

    private Fill fill;


    /** Point Radius :
     * Mix line / bar chart type case
     */
    private List<Integer> pointRadius;
    /** Point Radius :
     * Mix line / bar chart type case
     */
    private List<PointStyle> pointStyle;

    /** Point color
     * * Mix line / bar chart type case
     */
    private List<Color> pointBackgroundColor;
    private List<Color> pointBorderColor;

    private int order;




    /**
     * @see #setLineTension(Float)
     */
    public Float getLineTension() {
        return this.lineTension;
    }

    /**
     * Bezier curve tension of the line. Set to 0 to draw straightlines.
     */
    public BarDataset setLineTension(Float lineTension) {
        this.lineTension = lineTension;
        return this;
    }

    public BarDataset setOrder(int order) {
        this.order = order;
        return this;
    }


    /**
     * @see #setBorderSkipped(List)
     */
    private final List<BorderSkipped> borderSkipped = new OptionalArray<BorderSkipped>();

    public String getType() {
        return type;
    }

    /**
     * Support for mixed charts, if type is set to line, the dataset will be considered as a line in chart.js
     */
    public BarDataset setLine(boolean shouldSmooth) {
        this.type = "line";
        if (shouldSmooth) {
            this.setLineTension(0.4F);
        } else {
            this.setLineTension(0.0F);
        }
        return this;
    }

    /**
     * @see #setLabel(String)
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * The label for the dataset which appears in the legend and tooltips
     */
    public BarDataset setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * @see #setXAxisID(String)
     */
    public String getXAxisID() {
        return this.xAxisID;
    }

    /**
     * The ID of the x axis to plot this dataset on
     */
    public BarDataset setXAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
        return this;
    }

    /**
     * @see #setYAxisID(String)
     */
    public String getYAxisID() {
        return this.yAxisID;
    }

    /**
     * The ID of the y axis to plot this dataset on
     */
    public BarDataset setYAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
        return this;
    }

    /**
     * @see #setBorderSkipped(List)
     */
    public List<BorderSkipped> getBorderSkipped() {
        return this.borderSkipped;
    }

    /**
     * @see #setBorderSkipped(List)
     */
    public BarDataset addBorderSkipped(BorderSkipped borderSkipped) {
        this.borderSkipped.add(borderSkipped);
        return this;
    }

    /**
     * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
     */
    public BarDataset setBorderSkipped(List<BorderSkipped> borderSkipped) {
        this.borderSkipped.clear();
        if (borderSkipped != null) {
            this.borderSkipped.addAll(borderSkipped);
        }
        return this;
    }

    /**
     * Sets the backing data list to the argument, replacing any data already
     * added or set
     *
     * @param data The data to plot in a line
     */
    public BarDataset setData(int... data) {
        clearData();
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                this.data.add(new BigDecimal(data[i]));
            }
        }
        return this;
    }

    /**
     * Sets the backing data list to the argument, replacing any data already
     * added or set
     *
     * @param data The data to plot in a line
     */
    public BarDataset setData(double... data) {
        clearData();
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                this.data.add(new BigDecimal(String.valueOf(data[i])));
            }
        }
        return this;
    }

    /**
     * Add the data point to this {@code Dataset}
     *
     * @see #setData(Collection)
     */
    public BarDataset addData(int data) {
        this.data.add(new BigDecimal(data));
        return this;
    }

    /**
     * Add the data point to this {@code Dataset}
     *
     * @see #setData(Collection)
     */
    public BarDataset addData(double data) {
        this.data.add(new BigDecimal(String.valueOf(data)));
        return this;
    }

    /**
     * Add null value in List
     *
     * @return
     */
    public BarDataset addNullDataValue(){
        this.data.add(null);
        return this;
    }


    public Fill getFill() {
        return fill;
    }

    public BarDataset setFill(Fill fill) {
        this.fill = fill;
        return this;
    }

    public List<Integer> getPointRadius() {
        return pointRadius;
    }

    public BarDataset setPointRadius(List<Integer> pointRadius) {
        this.pointRadius = pointRadius;
        return this;
    }

    public List<PointStyle> getPointStyle() {
        return pointStyle;
    }

    public BarDataset setPointStyle(List<PointStyle> pointStyle) {
        this.pointStyle = pointStyle;
        return this;
    }

    public List<Color> getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public BarDataset setPointBackgroundColor(List<Color> pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
        return this;
    }

    public List<Color> getPointBorderColor() {
        return pointBorderColor;
    }

    public BarDataset setPointBorderColor(List<Color> pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
        return this;
    }
}

