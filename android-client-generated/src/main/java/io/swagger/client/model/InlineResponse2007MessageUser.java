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
public class InlineResponse2007MessageUser {
  
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("profile_picture_string")
  private String profilePictureString = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProfilePictureString() {
    return profilePictureString;
  }
  public void setProfilePictureString(String profilePictureString) {
    this.profilePictureString = profilePictureString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007MessageUser inlineResponse2007MessageUser = (InlineResponse2007MessageUser) o;
    return (this.avatar == null ? inlineResponse2007MessageUser.avatar == null : this.avatar.equals(inlineResponse2007MessageUser.avatar)) &&
        (this.profilePictureString == null ? inlineResponse2007MessageUser.profilePictureString == null : this.profilePictureString.equals(inlineResponse2007MessageUser.profilePictureString));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.avatar == null ? 0: this.avatar.hashCode());
    result = 31 * result + (this.profilePictureString == null ? 0: this.profilePictureString.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007MessageUser {\n");
    
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  profilePictureString: ").append(profilePictureString).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
