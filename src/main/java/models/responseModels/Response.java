package models.responseModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    @JsonProperty("Items")
    public Item[] items;


    public LastEvaluatedKey getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }

    public void setLastEvaluatedKey(LastEvaluatedKey lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }

    @JsonProperty("LastEvaluatedKey")
    public LastEvaluatedKey lastEvaluatedKey;

}