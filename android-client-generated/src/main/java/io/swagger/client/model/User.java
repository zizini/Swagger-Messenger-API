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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class User {
  
  @SerializedName("id")
  private BigDecimal id = null;
  @SerializedName("first_name")
  private String firstName = null;
  @SerializedName("last_name")
  private String lastName = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("profile_picture_string")
  private String profilePictureString = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("verified")
  private Boolean verified = null;
  @SerializedName("passcode")
  private String passcode = null;
  @SerializedName("passcode_expiration")
  private String passcodeExpiration = null;
  @SerializedName("socket_id")
  private String socketId = null;

  /**
   * Unique identifer
   **/
  @ApiModelProperty(value = "Unique identifer")
  public BigDecimal getId() {
    return id;
  }
  public void setId(BigDecimal id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public Boolean getVerified() {
    return verified;
  }
  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPasscode() {
    return passcode;
  }
  public void setPasscode(String passcode) {
    this.passcode = passcode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPasscodeExpiration() {
    return passcodeExpiration;
  }
  public void setPasscodeExpiration(String passcodeExpiration) {
    this.passcodeExpiration = passcodeExpiration;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSocketId() {
    return socketId;
  }
  public void setSocketId(String socketId) {
    this.socketId = socketId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return (this.id == null ? user.id == null : this.id.equals(user.id)) &&
        (this.firstName == null ? user.firstName == null : this.firstName.equals(user.firstName)) &&
        (this.lastName == null ? user.lastName == null : this.lastName.equals(user.lastName)) &&
        (this.phone == null ? user.phone == null : this.phone.equals(user.phone)) &&
        (this.countryCode == null ? user.countryCode == null : this.countryCode.equals(user.countryCode)) &&
        (this.email == null ? user.email == null : this.email.equals(user.email)) &&
        (this.profilePictureString == null ? user.profilePictureString == null : this.profilePictureString.equals(user.profilePictureString)) &&
        (this.avatar == null ? user.avatar == null : this.avatar.equals(user.avatar)) &&
        (this.verified == null ? user.verified == null : this.verified.equals(user.verified)) &&
        (this.passcode == null ? user.passcode == null : this.passcode.equals(user.passcode)) &&
        (this.passcodeExpiration == null ? user.passcodeExpiration == null : this.passcodeExpiration.equals(user.passcodeExpiration)) &&
        (this.socketId == null ? user.socketId == null : this.socketId.equals(user.socketId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.profilePictureString == null ? 0: this.profilePictureString.hashCode());
    result = 31 * result + (this.avatar == null ? 0: this.avatar.hashCode());
    result = 31 * result + (this.verified == null ? 0: this.verified.hashCode());
    result = 31 * result + (this.passcode == null ? 0: this.passcode.hashCode());
    result = 31 * result + (this.passcodeExpiration == null ? 0: this.passcodeExpiration.hashCode());
    result = 31 * result + (this.socketId == null ? 0: this.socketId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  profilePictureString: ").append(profilePictureString).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  verified: ").append(verified).append("\n");
    sb.append("  passcode: ").append(passcode).append("\n");
    sb.append("  passcodeExpiration: ").append(passcodeExpiration).append("\n");
    sb.append("  socketId: ").append(socketId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
