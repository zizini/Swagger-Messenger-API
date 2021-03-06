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

import io.swagger.client.model.InlineResponse2007GroupChatInfo;
import io.swagger.client.model.InlineResponse2007Message;
import io.swagger.client.model.InlineResponse2007User;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse2007Chats {
  
  @SerializedName("type")
  private String type = null;
  @SerializedName("chatType")
  private String chatType = null;
  @SerializedName("last_activity")
  private String lastActivity = null;
  @SerializedName("createdAt")
  private String createdAt = null;
  @SerializedName("participantIds")
  private List<BigDecimal> participantIds = null;
  @SerializedName("user")
  private InlineResponse2007User user = null;
  @SerializedName("groupChatInfo")
  private InlineResponse2007GroupChatInfo groupChatInfo = null;
  @SerializedName("message")
  private InlineResponse2007Message message = null;

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
  public String getChatType() {
    return chatType;
  }
  public void setChatType(String chatType) {
    this.chatType = chatType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastActivity() {
    return lastActivity;
  }
  public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
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
  public List<BigDecimal> getParticipantIds() {
    return participantIds;
  }
  public void setParticipantIds(List<BigDecimal> participantIds) {
    this.participantIds = participantIds;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2007User getUser() {
    return user;
  }
  public void setUser(InlineResponse2007User user) {
    this.user = user;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2007GroupChatInfo getGroupChatInfo() {
    return groupChatInfo;
  }
  public void setGroupChatInfo(InlineResponse2007GroupChatInfo groupChatInfo) {
    this.groupChatInfo = groupChatInfo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public InlineResponse2007Message getMessage() {
    return message;
  }
  public void setMessage(InlineResponse2007Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Chats inlineResponse2007Chats = (InlineResponse2007Chats) o;
    return (this.type == null ? inlineResponse2007Chats.type == null : this.type.equals(inlineResponse2007Chats.type)) &&
        (this.chatType == null ? inlineResponse2007Chats.chatType == null : this.chatType.equals(inlineResponse2007Chats.chatType)) &&
        (this.lastActivity == null ? inlineResponse2007Chats.lastActivity == null : this.lastActivity.equals(inlineResponse2007Chats.lastActivity)) &&
        (this.createdAt == null ? inlineResponse2007Chats.createdAt == null : this.createdAt.equals(inlineResponse2007Chats.createdAt)) &&
        (this.participantIds == null ? inlineResponse2007Chats.participantIds == null : this.participantIds.equals(inlineResponse2007Chats.participantIds)) &&
        (this.user == null ? inlineResponse2007Chats.user == null : this.user.equals(inlineResponse2007Chats.user)) &&
        (this.groupChatInfo == null ? inlineResponse2007Chats.groupChatInfo == null : this.groupChatInfo.equals(inlineResponse2007Chats.groupChatInfo)) &&
        (this.message == null ? inlineResponse2007Chats.message == null : this.message.equals(inlineResponse2007Chats.message));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.chatType == null ? 0: this.chatType.hashCode());
    result = 31 * result + (this.lastActivity == null ? 0: this.lastActivity.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.participantIds == null ? 0: this.participantIds.hashCode());
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.groupChatInfo == null ? 0: this.groupChatInfo.hashCode());
    result = 31 * result + (this.message == null ? 0: this.message.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Chats {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  chatType: ").append(chatType).append("\n");
    sb.append("  lastActivity: ").append(lastActivity).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  participantIds: ").append(participantIds).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("  groupChatInfo: ").append(groupChatInfo).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
