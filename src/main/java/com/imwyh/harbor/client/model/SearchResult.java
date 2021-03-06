/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.imwyh.harbor.client.model.ChartVersion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * The chart search result item
 */
@Schema(description = "The chart search result item")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class SearchResult {

  @SerializedName("name")
  private String name = null;

  @SerializedName("score")
  private Integer score = null;

  @SerializedName("chart")
  private ChartVersion chart = null;
  public SearchResult name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The chart name with repo name
  * @return name
  **/
  @Schema(description = "The chart name with repo name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public SearchResult score(Integer score) {
    this.score = score;
    return this;
  }

  

  /**
  * The matched level
  * @return score
  **/
  @Schema(description = "The matched level")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }
  public SearchResult chart(ChartVersion chart) {
    this.chart = chart;
    return this;
  }

  

  /**
  * Get chart
  * @return chart
  **/
  @Schema(description = "")
  public ChartVersion getChart() {
    return chart;
  }
  public void setChart(ChartVersion chart) {
    this.chart = chart;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResult searchResult = (SearchResult) o;
    return Objects.equals(this.name, searchResult.name) &&
        Objects.equals(this.score, searchResult.score) &&
        Objects.equals(this.chart, searchResult.chart);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, score, chart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResult {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    chart: ").append(toIndentedString(chart)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
