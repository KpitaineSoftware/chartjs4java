package be.ceau.chart.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class Plugins {

    DatalabelsPlugin datalabels;

    public DatalabelsPlugin getDatalabels() {
        return datalabels;
    }

    public void setDatalabels(DatalabelsPlugin datalabels) {
        this.datalabels = datalabels;
    }
}
