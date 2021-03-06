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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse500Messages {
  
  @SerializedName("message")
  private String message = null;
  @SerializedName("stack")
  private String stack = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStack() {
    return stack;
  }
  public void setStack(String stack) {
    this.stack = stack;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse500Messages inlineResponse500Messages = (InlineResponse500Messages) o;
    return (this.message == null ? inlineResponse500Messages.message == null : this.message.equals(inlineResponse500Messages.message)) &&
        (this.stack == null ? inlineResponse500Messages.stack == null : this.stack.equals(inlineResponse500Messages.stack));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.stack == null ? 0: this.stack.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse500Messages {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("  stack: ").append(stack).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
