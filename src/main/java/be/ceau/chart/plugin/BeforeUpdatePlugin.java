package be.ceau.chart.plugin;

import be.ceau.chart.javascript.JSONJavascriptFunction;
import be.ceau.chart.javascript.JavaScriptFunction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
public class  BeforeUpdatePlugin implements Plugin{

    private String id;

     private JavaScriptFunction beforeUpdate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JavaScriptFunction getBeforeUpdate() {
        return beforeUpdate;
    }

    public void setBeforeUpdate(JavaScriptFunction beforeUpdate) {
        this.beforeUpdate = beforeUpdate;
    }
}
