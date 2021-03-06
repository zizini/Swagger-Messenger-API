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
public class InlineResponse20011 {
  
  @SerializedName("passcode")
  private String passcode = null;
  @SerializedName("passcode_expiration")
  private String passcodeExpiration = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return (this.passcode == null ? inlineResponse20011.passcode == null : this.passcode.equals(inlineResponse20011.passcode)) &&
        (this.passcodeExpiration == null ? inlineResponse20011.passcodeExpiration == null : this.passcodeExpiration.equals(inlineResponse20011.passcodeExpiration));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.passcode == null ? 0: this.passcode.hashCode());
    result = 31 * result + (this.passcodeExpiration == null ? 0: this.passcodeExpiration.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
    sb.append("  passcode: ").append(passcode).append("\n");
    sb.append("  passcodeExpiration: ").append(passcodeExpiration).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
