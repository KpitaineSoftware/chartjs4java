package be.ceau.chart.data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.color.Color;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LineDataset {

	/**
	 * @see #setData(BigDecimal)
	 */
	private final List<BigDecimal> data = new ArrayList<BigDecimal>();

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
	 * @see #setFill(Boolean)
	 */
	private Boolean fill;

	/**
	 * @see #setLineTension(BigDecimal)
	 */
	private BigDecimal lineTension;

	/**
	 * @see #setBackgroundColor(Color)
	 */
	private Color backgroundColor;

	/**
	 * @see #setBorderWidth(BigDecimal)
	 */
	private BigDecimal borderWidth;

	/**
	 * @see #setBorderColor(Color)
	 */
	private Color borderColor;

	/**
	 * @see #setBorderCapStyle(String)
	 */
	private String borderCapStyle;

	/**
	 * @see #setBorderDash(List)
	 */
	private List<BigDecimal> borderDash;

	/**
	 * @see #setBorderDashOffset(BigDecimal)
	 */
	private BigDecimal borderDashOffset;

	/**
	 * @see #setBorderJoinStyle(String)
	 */
	private String borderJoinStyle;

	/**
	 * @see #setPointBorderColor(List)
	 */
	private List<Color> pointBorderColor;

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	private List<Color> pointBackgroundColor;

	/**
	 * @see #setPointBorderWidth(List)
	 */
	private List<BigDecimal> pointBorderWidth;

	/**
	 * @see #setPointRadius(List)
	 */
	private List<BigDecimal> pointRadius;

	/**
	 * @see #setPointHoverRadius(List)
	 */
	private List<BigDecimal> pointHoverRadius;

	/**
	 * @see #setPointHitRadius(List)
	 */
	private List<BigDecimal> pointHitRadius;

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	private List<Color> pointHoverBackgroundColor;

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	private List<Color> pointHoverBorderColor;

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	private List<BigDecimal> pointHoverBorderWidth;

	/**
	 * @see #setPointStyle(List)
	 */
	private List<String> pointStyle;

	/**
	 * @see #setShowLine(Boolean)
	 */
	private Boolean showLine;

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	private Boolean spanGaps;

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	private Boolean steppedLine;

	/**
	 * @see #setData(List)
	 */
	public List<BigDecimal> getData() {
		return this.data;
	}

	/**
	 * The data to plot in a line
	 */
	public void setData(List<BigDecimal> data) {
		this.data.clear();
		if (data != null) {
			this.data.addAll(data);
		}
	}

	/**
	 * The data to plot in a line
	 */
	public void addData(int data) {
		this.data.add(new BigDecimal(data));
	}

	/**
	 * The data to plot in a line
	 */
	public void addData(double data) {
		this.data.add(new BigDecimal(String.valueOf(data)));
	}

	/**
	 * The data to plot in a line
	 */
	public void addData(BigDecimal data) {
		this.data.add(data);
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
	public void setLabel(String label) {
		this.label = label;
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
	public void setXAxisID(String xAxisID) {
		this.xAxisID = xAxisID;
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
	public void setYAxisID(String yAxisID) {
		this.yAxisID = yAxisID;
	}

	/**
	 * @see #setFill(Boolean)
	 */
	public Boolean getFill() {
		return this.fill;
	}

	/**
	 * If true, fill the area under the line
	 */
	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	/**
	 * @see #setLineTension(BigDecimal)
	 */
	public BigDecimal getLineTension() {
		return this.lineTension;
	}

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines. Note
	 * This was renamed from 'tension' but the old name still works.
	 */
	public void setLineTension(BigDecimal lineTension) {
		this.lineTension = lineTension;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return this.backgroundColor;
	}

	/**
	 * The fill color under the line. See Colors
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderWidth(BigDecimal)
	 */
	public BigDecimal getBorderWidth() {
		return this.borderWidth;
	}

	/**
	 * The width of the line in pixels
	 */
	public void setBorderWidth(BigDecimal borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return this.borderColor;
	}

	/**
	 * The color of the line.
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderCapStyle(String)
	 */
	public String getBorderCapStyle() {
		return this.borderCapStyle;
	}

	/**
	 * Default line cap style.
	 * <ul>
	 * <li>{@code butt} The ends of lines are squared off at the endpoints.
	 * <li>{@code round} The ends of lines are rounded.
	 * <li>{@code square} The ends of lines are squared off by adding a box with an
	 * equal width and half the height of the line's thickness.
	 * </ul>
	 */
	public void setBorderCapStyle(String borderCapStyle) {
		this.borderCapStyle = borderCapStyle;
	}

	/**
	 * @see #setBorderDash(List)
	 */
	public List<BigDecimal> getBorderDash() {
		return this.borderDash;
	}

	/**
	 * Default line dash. A list of numbers that specifies distances to
	 * alternately draw a line and a gap (in coordinate space units). If the
	 * number of elements in the array is odd, the elements of the array get
	 * copied and concatenated. For example, [5, 15, 25] will become [5, 15, 25,
	 * 5, 15, 25].
	 */
	public void setBorderDash(List<BigDecimal> borderDash) {
		this.borderDash = borderDash;
	}

	/**
	 * @see #setBorderDashOffset(BigDecimal)
	 */
	public BigDecimal getBorderDashOffset() {
		return this.borderDashOffset;
	}

	/**
	 * Default line dash offset. A float specifying the amount of
	 * the offset. Initially 0.0.
	 */
	public void setBorderDashOffset(BigDecimal borderDashOffset) {
		this.borderDashOffset = borderDashOffset;
	}

	/**
	 * @see #setBorderJoinStyle(String)
	 */
	public String getBorderJoinStyle() {
		return this.borderJoinStyle;
	}

	/**
	 * <p>
	 * Default line join style.
	 * </p>
	 * <ul>
	 * <li>{@code round} Rounds off the corners of a shape by filling an additional
	 * sector of disc centered at the common endpoint of connected segments. The
	 * radius for these rounded corners is equal to the line width.
	 * <li>{@code bevel} Fills an additional triangular area between the common endpoint
	 * of connected segments, and the separate outside rectangular corners of
	 * each segment.
	 * <li>{@code miter} Connected segments are joined by extending their outside edges
	 * to connect at a single point, with the effect of filling an additional
	 * lozenge-shaped area. This setting is effected by the miterLimit property.
	 * </ul>
	 */
	public void setBorderJoinStyle(String borderJoinStyle) {
		this.borderJoinStyle = borderJoinStyle;
	}

	/**
	 * @see #setPointBorderColor(List)
	 */
	public List<Color> getPointBorderColor() {
		return this.pointBorderColor;
	}

	/**
	 * The border color for points.
	 */
	public void setPointBorderColor(List<Color> pointBorderColor) {
		this.pointBorderColor = pointBorderColor;
	}

	/**
	 * @see #setPointBackgroundColor(List)
	 */
	public List<Color> getPointBackgroundColor() {
		return this.pointBackgroundColor;
	}

	/**
	 * The fill color for points
	 */
	public void setPointBackgroundColor(List<Color> pointBackgroundColor) {
		this.pointBackgroundColor = pointBackgroundColor;
	}

	/**
	 * @see #setPointBorderWidth(List)
	 */
	public List<BigDecimal> getPointBorderWidth() {
		return this.pointBorderWidth;
	}

	/**
	 * The width of the point border in pixels
	 */
	public void setPointBorderWidth(List<BigDecimal> pointBorderWidth) {
		this.pointBorderWidth = pointBorderWidth;
	}

	/**
	 * @see #setPointRadius(List)
	 */
	public List<BigDecimal> getPointRadius() {
		return this.pointRadius;
	}

	/**
	 * The radius of the point shape. If set to 0, nothing is rendered.
	 */
	public void setPointRadius(List<BigDecimal> pointRadius) {
		this.pointRadius = pointRadius;
	}

	/**
	 * @see #setPointHoverRadius(List)
	 */
	public List<BigDecimal> getPointHoverRadius() {
		return this.pointHoverRadius;
	}

	/**
	 * The radius of the point when hovered
	 */
	public void setPointHoverRadius(List<BigDecimal> pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	/**
	 * @see #setPointHitRadius(List)
	 */
	public List<BigDecimal> getPointHitRadius() {
		return this.pointHitRadius;
	}

	/**
	 * The pixel size of the non-displayed point that reacts to mouse events
	 */
	public void setPointHitRadius(List<BigDecimal> pointHitRadius) {
		this.pointHitRadius = pointHitRadius;
	}

	/**
	 * @see #setPointHoverBackgroundColor(List)
	 */
	public List<Color> getPointHoverBackgroundColor() {
		return this.pointHoverBackgroundColor;
	}

	/**
	 * Point background color when hovered
	 */
	public void setPointHoverBackgroundColor(List<Color> pointHoverBackgroundColor) {
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}

	/**
	 * @see #setPointHoverBorderColor(List)
	 */
	public List<Color> getPointHoverBorderColor() {
		return this.pointHoverBorderColor;
	}

	/**
	 * Point border color when hovered
	 */
	public void setPointHoverBorderColor(List<Color> pointHoverBorderColor) {
		this.pointHoverBorderColor = pointHoverBorderColor;
	}

	/**
	 * @see #setPointHoverBorderWidth(List)
	 */
	public List<BigDecimal> getPointHoverBorderWidth() {
		return this.pointHoverBorderWidth;
	}

	/**
	 * Border width of point when hovered
	 */
	public void setPointHoverBorderWidth(List<BigDecimal> pointHoverBorderWidth) {
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}

	/**
	 * @see #setPointStyle(List)
	 */
	public List<String> getPointStyle() {
		return this.pointStyle;
	}

	/**
	 * The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot',
	 * 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an
	 * image, that image is drawn on the canvas using drawImage.
	 */
	public void setPointStyle(List<String> pointStyle) {
		this.pointStyle = pointStyle;
	}

	/**
	 * @see #setShowLine(Boolean)
	 */
	public Boolean getShowLine() {
		return this.showLine;
	}

	/**
	 * If false, the line is not drawn for this dataset
	 */
	public void setShowLine(Boolean showLine) {
		this.showLine = showLine;
	}

	/**
	 * @see #setSpanGaps(Boolean)
	 */
	public Boolean getSpanGaps() {
		return this.spanGaps;
	}

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public void setSpanGaps(Boolean spanGaps) {
		this.spanGaps = spanGaps;
	}

	/**
	 * @see #setSteppedLine(Boolean)
	 */
	public Boolean getSteppedLine() {
		return this.steppedLine;
	}

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be
	 * ignored
	 */
	public void setSteppedLine(Boolean steppedLine) {
		this.steppedLine = steppedLine;
	}

}