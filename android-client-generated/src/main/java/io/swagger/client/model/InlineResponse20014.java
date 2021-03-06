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

import io.swagger.client.model.InlineResponse20014Messages;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20014 {
  
  @SerializedName("messages")
  private InlineResponse20014Messages messages = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse20014Messages getMessages() {
    return messages;
  }
  public void setMessages(InlineResponse20014Messages messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return (this.messages == null ? inlineResponse20014.messages == null : this.messages.equals(inlineResponse20014.messages));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.messages == null ? 0: this.messages.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
