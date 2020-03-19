package ru.textanalysis.tawt.rest.common.api.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class SelectByStringRequest {
    @ApiModelProperty(value = "Слово, несущая фраза, текст, предложение...")
    @JsonProperty
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
