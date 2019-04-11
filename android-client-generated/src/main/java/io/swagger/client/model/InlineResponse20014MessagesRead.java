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

import io.swagger.client.model.InlineResponse2007MessageUser;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20014MessagesRead {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("userId")
  private BigDecimal userId = null;
  @SerializedName("chatId")
  private BigDecimal chatId = null;
  @SerializedName("mediaArray")
  private List<String> mediaArray = null;
  @SerializedName("type")
  private String type = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("user")
  private InlineResponse2007MessageUser user = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

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
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getChatId() {
    return chatId;
  }
  public void setChatId(BigDecimal chatId) {
    this.chatId = chatId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMediaArray() {
    return mediaArray;
  }
  public void setMediaArray(List<String> mediaArray) {
    this.mediaArray = mediaArray;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2007MessageUser getUser() {
    return user;
  }
  public void setUser(InlineResponse2007MessageUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014MessagesRead inlineResponse20014MessagesRead = (InlineResponse20014MessagesRead) o;
    return (this.id == null ? inlineResponse20014MessagesRead.id == null : this.id.equals(inlineResponse20014MessagesRead.id)) &&
        (this.message == null ? inlineResponse20014MessagesRead.message == null : this.message.equals(inlineResponse20014MessagesRead.message)) &&
        (this.userId == null ? inlineResponse20014MessagesRead.userId == null : this.userId.equals(inlineResponse20014MessagesRead.userId)) &&
        (this.chatId == null ? inlineResponse20014MessagesRead.chatId == null : this.chatId.equals(inlineResponse20014MessagesRead.chatId)) &&
        (this.mediaArray == null ? inlineResponse20014MessagesRead.mediaArray == null : this.mediaArray.equals(inlineResponse20014MessagesRead.mediaArray)) &&
        (this.type == null ? inlineResponse20014MessagesRead.type == null : this.type.equals(inlineResponse20014MessagesRead.type)) &&
        (this.createdAt == null ? inlineResponse20014MessagesRead.createdAt == null : this.createdAt.equals(inlineResponse20014MessagesRead.createdAt)) &&
        (this.user == null ? inlineResponse20014MessagesRead.user == null : this.user.equals(inlineResponse20014MessagesRead.user));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.chatId == null ? 0: this.chatId.hashCode());
    result = 31 * result + (this.mediaArray == null ? 0: this.mediaArray.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014MessagesRead {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  chatId: ").append(chatId).append("\n");
    sb.append("  mediaArray: ").append(mediaArray).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
