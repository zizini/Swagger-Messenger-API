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

import io.swagger.client.model.UserChats;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class InlineResponse20021 {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("userChat")
  private UserChats userChat = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UserChats getUserChat() {
    return userChat;
  }
  public void setUserChat(UserChats userChat) {
    this.userChat = userChat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021 inlineResponse20021 = (InlineResponse20021) o;
    return (this.success == null ? inlineResponse20021.success == null : this.success.equals(inlineResponse20021.success)) &&
        (this.userChat == null ? inlineResponse20021.userChat == null : this.userChat.equals(inlineResponse20021.userChat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.success == null ? 0: this.success.hashCode());
    result = 31 * result + (this.userChat == null ? 0: this.userChat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021 {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  userChat: ").append(userChat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}