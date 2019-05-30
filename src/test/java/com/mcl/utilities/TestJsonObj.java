package com.mcl.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TestJsonObj {

    @JsonProperty("userId")
    public String userId;

    @JsonProperty("id")
    public String id;

    @JsonProperty("title")
    public String title;

    @JsonProperty("completed")
    public String completed;

}
