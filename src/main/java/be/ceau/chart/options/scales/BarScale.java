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
package be.ceau.chart.options.scales;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.options.ticks.LinearTicks;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BarScale extends CategoryScale {

	/**
	 * Static factory, constructs an {@link XAxis} implementation appropriate for
	 * a {@link BarScale}.
	 * 
	 * @return a new {@link XAxis} instance
	 */
	public static XAxis<LinearTicks> xAxis() {
		return new XAxis<LinearTicks>();
	}
	
	/**
	 * Static factory, constructs an {@link YAxis} implementation appropriate for
	 * a {@link BarScale}.
	 * 
	 * @return a new {@link YAxis} instance
	 */
	public static YAxis<LinearTicks> yAxis() {
		return new YAxis<LinearTicks>();
	}
	
	/**
	 * @see #setxAxes(List)
	 */
	private final List<XAxis<LinearTicks>> xAxes = new ArrayList<XAxis<LinearTicks>>();

	/**
	 * @see #setyAxes(List)
	 */
	private final List<Axis<LinearTicks>> yAxes = new ArrayList<Axis<LinearTicks>>();

	/**
	 * @see #setxAxes(List)
	 */
	public List<XAxis<LinearTicks>> getxAxes() {
		return xAxes;
	}

	/**
	 * @see #setxAxes(List)
	 */
	public BarScale addxAxes(XAxis<LinearTicks> xAxis) {
		if (xAxis != null) {
			this.xAxes.clear();
			this.xAxes.add(xAxis);
		}
		return this;
	}

	/**
	 * <p>
	 * The bar chart officially supports only 1 x-axis but uses an array to keep
	 * the API consistent. Use a scatter chart if you need multiple x axes.
	 * </p>
	 * <p>
	 * To produce compatible JSON, only the first {@code BarScale} instance will
	 * be stored if a list containing more than one instance is passed.
	 * </p>
	 */
	public BarScale setxAxes(List<XAxis<LinearTicks>> xAxes) {
		this.xAxes.clear();
		if (xAxes != null && !xAxes.isEmpty()) {
			addxAxes(xAxes.get(0));
		}
		return this;
	}

	/**
	 * @see #setyAxes(List)
	 */
	public List<Axis<LinearTicks>> getyAxes() {
		return yAxes;
	}

	/**
	 * @see #setyAxes(List)
	 */
	public BarScale addyAxes(Axis<LinearTicks> yAxis) {
		if (yAxis != null) {
			this.yAxes.add(yAxis);
		}
		return this;
	}

	/**
	 * The Y axis for this bar chart
	 */
	public BarScale setyAxes(List<YAxis<LinearTicks>> yAxes) {
		this.yAxes.clear();
		if (yAxes != null) {
			this.yAxes.addAll(yAxes);
		}
		return this;
	}

}
