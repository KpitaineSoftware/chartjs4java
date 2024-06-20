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

import be.ceau.chart.enums.DataLabelsAlign;
import be.ceau.chart.enums.DataLabelsAnchor;

import java.util.*;

public abstract class Dataset<T extends Dataset<T, O>, O> {

    /**
     * @see #setData(Collection)
     */
    protected final List<O> data = new ArrayList<O>();


    protected List<String> labels;

    private DataLabels datalabels;

    private TrendlineLinear trendlineLinear;

    /**
     * @return an unmodifiable view of the data held in this {@code Dataset},
     * never {@code null}
     */
    public List<O> getData() {
        return Collections.unmodifiableList(this.data);
    }

    /**
     * Sets the backing data list to the argument, replacing any data already
     * added or set
     *
     * @param data The data to plot in a line
     */
    @SuppressWarnings("unchecked")
    public T setData(Collection<O> data) {
        clearData();
        if (data != null) {
            this.data.addAll(data);
        }
        return (T) this;
    }

    /**
     * Sets the backing data list to the argument, replacing any data already
     * added or set
     *
     * @param data The data to plot in a line
     */
    @SuppressWarnings("unchecked")
    public T setData(O... data) {
        clearData();
        if (data != null) {
            this.data.addAll(Arrays.asList(data));
        }
        return (T) this;
    }

    /**
     * Remove all data held by this {@code Dataset}
     */
    @SuppressWarnings("unchecked")
    public T clearData() {
        this.data.clear();
        return (T) this;
    }

    /**
     * Add the data point to this {@code Dataset}
     *
     * @param data a {@code O}, can be {@code null} to signify absence of data
     *             for a given point
     * @see #setData(Collection)
     */
    @SuppressWarnings("unchecked")
    public T addData(O data) {
        this.data.add(data);
        return (T) this;
    }

    public void setDatalabels(DataLabels dl) {
        this.datalabels = dl;
    }

    public void setDatalabels(boolean display) {
        this.datalabels = new DataLabels(display);
    }

    public void setDatalabels(DataLabelsAlign align, DataLabelsAnchor anchor) {
        this.datalabels = new DataLabels(align, anchor);
    }

    public DataLabels getDatalabels() {
        return datalabels;
    }

    public TrendlineLinear getTrendlineLinear() {
        return trendlineLinear;
    }

    public void setTrendlineLinear(TrendlineLinear trendlineLinear) {
        this.trendlineLinear = trendlineLinear;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }
}
