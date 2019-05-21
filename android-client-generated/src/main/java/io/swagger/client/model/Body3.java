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
public class Body3 {
  
  @SerializedName("country_code")
  private String countryCode = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("passcode")
  private String passcode = null;

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
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return (this.countryCode == null ? body3.countryCode == null : this.countryCode.equals(body3.countryCode)) &&
        (this.phone == null ? body3.phone == null : this.phone.equals(body3.phone)) &&
        (this.passcode == null ? body3.passcode == null : this.passcode.equals(body3.passcode));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.passcode == null ? 0: this.passcode.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  passcode: ").append(passcode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}