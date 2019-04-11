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

import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Chat {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("groupChat")
  private Boolean groupChat = null;
  @SerializedName("privateChat")
  private Boolean privateChat = null;
  @SerializedName("participantsId")
  private List<Integer> participantsId = null;
  @SerializedName("last_activity")
  private String lastActivity = null;
  @SerializedName("last_activity_in_associated_channel_event_or_groupChat")
  private String lastActivityInAssociatedChannelEventOrGroupChat = null;

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
   * Set to true if the chat is a group chat
   **/
  @ApiModelProperty(value = "Set to true if the chat is a group chat")
  public Boolean getGroupChat() {
    return groupChat;
  }
  public void setGroupChat(Boolean groupChat) {
    this.groupChat = groupChat;
  }

  /**
   * Set tot true if the chat is a private chat
   **/
  @ApiModelProperty(value = "Set tot true if the chat is a private chat")
  public Boolean getPrivateChat() {
    return privateChat;
  }
  public void setPrivateChat(Boolean privateChat) {
    this.privateChat = privateChat;
  }

  /**
   * An array of the user Ids participating in the chat
   **/
  @ApiModelProperty(value = "An array of the user Ids participating in the chat")
  public List<Integer> getParticipantsId() {
    return participantsId;
  }
  public void setParticipantsId(List<Integer> participantsId) {
    this.participantsId = participantsId;
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
  public String getLastActivityInAssociatedChannelEventOrGroupChat() {
    return lastActivityInAssociatedChannelEventOrGroupChat;
  }
  public void setLastActivityInAssociatedChannelEventOrGroupChat(String lastActivityInAssociatedChannelEventOrGroupChat) {
    this.lastActivityInAssociatedChannelEventOrGroupChat = lastActivityInAssociatedChannelEventOrGroupChat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chat chat = (Chat) o;
    return (this.id == null ? chat.id == null : this.id.equals(chat.id)) &&
        (this.groupChat == null ? chat.groupChat == null : this.groupChat.equals(chat.groupChat)) &&
        (this.privateChat == null ? chat.privateChat == null : this.privateChat.equals(chat.privateChat)) &&
        (this.participantsId == null ? chat.participantsId == null : this.participantsId.equals(chat.participantsId)) &&
        (this.lastActivity == null ? chat.lastActivity == null : this.lastActivity.equals(chat.lastActivity)) &&
        (this.lastActivityInAssociatedChannelEventOrGroupChat == null ? chat.lastActivityInAssociatedChannelEventOrGroupChat == null : this.lastActivityInAssociatedChannelEventOrGroupChat.equals(chat.lastActivityInAssociatedChannelEventOrGroupChat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.groupChat == null ? 0: this.groupChat.hashCode());
    result = 31 * result + (this.privateChat == null ? 0: this.privateChat.hashCode());
    result = 31 * result + (this.participantsId == null ? 0: this.participantsId.hashCode());
    result = 31 * result + (this.lastActivity == null ? 0: this.lastActivity.hashCode());
    result = 31 * result + (this.lastActivityInAssociatedChannelEventOrGroupChat == null ? 0: this.lastActivityInAssociatedChannelEventOrGroupChat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chat {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  groupChat: ").append(groupChat).append("\n");
    sb.append("  privateChat: ").append(privateChat).append("\n");
    sb.append("  participantsId: ").append(participantsId).append("\n");
    sb.append("  lastActivity: ").append(lastActivity).append("\n");
    sb.append("  lastActivityInAssociatedChannelEventOrGroupChat: ").append(lastActivityInAssociatedChannelEventOrGroupChat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
