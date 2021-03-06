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

import io.swagger.client.model.InlineResponse500Messages;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse500 {
  
  @SerializedName("messages")
  private List<InlineResponse500Messages> messages = null;
  @SerializedName("chat")
  private List<InlineResponse500Messages> chat = null;
  @SerializedName("groupChats")
  private List<InlineResponse500Messages> groupChats = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse500Messages> getMessages() {
    return messages;
  }
  public void setMessages(List<InlineResponse500Messages> messages) {
    this.messages = messages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse500Messages> getChat() {
    return chat;
  }
  public void setChat(List<InlineResponse500Messages> chat) {
    this.chat = chat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<InlineResponse500Messages> getGroupChats() {
    return groupChats;
  }
  public void setGroupChats(List<InlineResponse500Messages> groupChats) {
    this.groupChats = groupChats;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse500 inlineResponse500 = (InlineResponse500) o;
    return (this.messages == null ? inlineResponse500.messages == null : this.messages.equals(inlineResponse500.messages)) &&
        (this.chat == null ? inlineResponse500.chat == null : this.chat.equals(inlineResponse500.chat)) &&
        (this.groupChats == null ? inlineResponse500.groupChats == null : this.groupChats.equals(inlineResponse500.groupChats));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.messages == null ? 0: this.messages.hashCode());
    result = 31 * result + (this.chat == null ? 0: this.chat.hashCode());
    result = 31 * result + (this.groupChats == null ? 0: this.groupChats.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse500 {\n");
    
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("  chat: ").append(chat).append("\n");
    sb.append("  groupChats: ").append(groupChats).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
