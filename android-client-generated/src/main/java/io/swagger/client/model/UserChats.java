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
public class UserChats {
  
  @SerializedName("userId")
  private String userId = null;
  @SerializedName("chatId")
  private String chatId = null;
  @SerializedName("favorite")
  private Boolean favorite = null;
  @SerializedName("last_time_in_chat")
  private String lastTimeInChat = null;
  @SerializedName("unread_messages")
  private Boolean unreadMessages = null;
  @SerializedName("entered_chat_quantity")
  private BigDecimal enteredChatQuantity = null;
  @SerializedName("current_chat")
  private Boolean currentChat = null;
  @SerializedName("message_notifications")
  private Boolean messageNotifications = null;
  @SerializedName("user_added_notifications")
  private Boolean userAddedNotifications = null;
  @SerializedName("messages_not_to_display")
  private List<BigDecimal> messagesNotToDisplay = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getChatId() {
    return chatId;
  }
  public void setChatId(String chatId) {
    this.chatId = chatId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFavorite() {
    return favorite;
  }
  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastTimeInChat() {
    return lastTimeInChat;
  }
  public void setLastTimeInChat(String lastTimeInChat) {
    this.lastTimeInChat = lastTimeInChat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getUnreadMessages() {
    return unreadMessages;
  }
  public void setUnreadMessages(Boolean unreadMessages) {
    this.unreadMessages = unreadMessages;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getEnteredChatQuantity() {
    return enteredChatQuantity;
  }
  public void setEnteredChatQuantity(BigDecimal enteredChatQuantity) {
    this.enteredChatQuantity = enteredChatQuantity;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getCurrentChat() {
    return currentChat;
  }
  public void setCurrentChat(Boolean currentChat) {
    this.currentChat = currentChat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getMessageNotifications() {
    return messageNotifications;
  }
  public void setMessageNotifications(Boolean messageNotifications) {
    this.messageNotifications = messageNotifications;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getUserAddedNotifications() {
    return userAddedNotifications;
  }
  public void setUserAddedNotifications(Boolean userAddedNotifications) {
    this.userAddedNotifications = userAddedNotifications;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getMessagesNotToDisplay() {
    return messagesNotToDisplay;
  }
  public void setMessagesNotToDisplay(List<BigDecimal> messagesNotToDisplay) {
    this.messagesNotToDisplay = messagesNotToDisplay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserChats userChats = (UserChats) o;
    return (this.userId == null ? userChats.userId == null : this.userId.equals(userChats.userId)) &&
        (this.chatId == null ? userChats.chatId == null : this.chatId.equals(userChats.chatId)) &&
        (this.favorite == null ? userChats.favorite == null : this.favorite.equals(userChats.favorite)) &&
        (this.lastTimeInChat == null ? userChats.lastTimeInChat == null : this.lastTimeInChat.equals(userChats.lastTimeInChat)) &&
        (this.unreadMessages == null ? userChats.unreadMessages == null : this.unreadMessages.equals(userChats.unreadMessages)) &&
        (this.enteredChatQuantity == null ? userChats.enteredChatQuantity == null : this.enteredChatQuantity.equals(userChats.enteredChatQuantity)) &&
        (this.currentChat == null ? userChats.currentChat == null : this.currentChat.equals(userChats.currentChat)) &&
        (this.messageNotifications == null ? userChats.messageNotifications == null : this.messageNotifications.equals(userChats.messageNotifications)) &&
        (this.userAddedNotifications == null ? userChats.userAddedNotifications == null : this.userAddedNotifications.equals(userChats.userAddedNotifications)) &&
        (this.messagesNotToDisplay == null ? userChats.messagesNotToDisplay == null : this.messagesNotToDisplay.equals(userChats.messagesNotToDisplay));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.chatId == null ? 0: this.chatId.hashCode());
    result = 31 * result + (this.favorite == null ? 0: this.favorite.hashCode());
    result = 31 * result + (this.lastTimeInChat == null ? 0: this.lastTimeInChat.hashCode());
    result = 31 * result + (this.unreadMessages == null ? 0: this.unreadMessages.hashCode());
    result = 31 * result + (this.enteredChatQuantity == null ? 0: this.enteredChatQuantity.hashCode());
    result = 31 * result + (this.currentChat == null ? 0: this.currentChat.hashCode());
    result = 31 * result + (this.messageNotifications == null ? 0: this.messageNotifications.hashCode());
    result = 31 * result + (this.userAddedNotifications == null ? 0: this.userAddedNotifications.hashCode());
    result = 31 * result + (this.messagesNotToDisplay == null ? 0: this.messagesNotToDisplay.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserChats {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  chatId: ").append(chatId).append("\n");
    sb.append("  favorite: ").append(favorite).append("\n");
    sb.append("  lastTimeInChat: ").append(lastTimeInChat).append("\n");
    sb.append("  unreadMessages: ").append(unreadMessages).append("\n");
    sb.append("  enteredChatQuantity: ").append(enteredChatQuantity).append("\n");
    sb.append("  currentChat: ").append(currentChat).append("\n");
    sb.append("  messageNotifications: ").append(messageNotifications).append("\n");
    sb.append("  userAddedNotifications: ").append(userAddedNotifications).append("\n");
    sb.append("  messagesNotToDisplay: ").append(messagesNotToDisplay).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
