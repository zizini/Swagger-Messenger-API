/**
 * Whats App API
 * Whats App API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: irma.tabakis@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.InlineResponse2005NonAnsweredCalls;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2006 {
  
  @SerializedName("answeredCalls")
  private List<InlineResponse2005NonAnsweredCalls> answeredCalls = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2005NonAnsweredCalls> getAnsweredCalls() {
    return answeredCalls;
  }
  public void setAnsweredCalls(List<InlineResponse2005NonAnsweredCalls> answeredCalls) {
    this.answeredCalls = answeredCalls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return (this.answeredCalls == null ? inlineResponse2006.answeredCalls == null : this.answeredCalls.equals(inlineResponse2006.answeredCalls));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.answeredCalls == null ? 0: this.answeredCalls.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("  answeredCalls: ").append(answeredCalls).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}