package be.ceau.chart.javascript;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.IOException;

/** Same than JavascriptFunction but give a different serializer for callback js functions.<br>
 * Useful to avoid parsing issue.
 *
 * <p>Will serialize with <code>/Function(function(){...})/</code> syntax.</p>
 * <p>
 * You'll have to deserialize with following JS example code.
 * </p>
 *
 * <pre>{@code
 *    JSON.parse(json, function(key, value) {
 *       if (typeof value === "string" &&
 *           value.startsWith("/Function(") &&
 *           value.endsWith(")/")) {
 *         value = value.substring(10, value.length - 2);
 *         return (0, eval)("(" + value + ")");
 *       }
 *       return value;
 *     });
 * }</pre>
 *
 * @see <a href="https://stackoverflow.com/questions/36517173/how-to-store-a-javascript-function-in-json">Related topic on StackOverflow</a>
 */
@JsonSerialize(using = JSONJavascriptFunction.Serializer.class)
public class JSONJavascriptFunction extends JavaScriptFunction{
    public JSONJavascriptFunction(String function) {
        super(function);
    }
    public static class Serializer extends JsonSerializer<JavaScriptFunction> {
        @Override
        public void serialize(JavaScriptFunction value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
            gen.writeRawValue("\"/Function(" + value.function + ")/\"");
        }

    }
}
