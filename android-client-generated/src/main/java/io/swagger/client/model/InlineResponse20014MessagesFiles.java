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
public class InlineResponse20014MessagesFiles {
  
  @SerializedName("s3_url")
  private String s3Url = null;
  @SerializedName("file_string")
  private String fileString = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getS3Url() {
    return s3Url;
  }
  public void setS3Url(String s3Url) {
    this.s3Url = s3Url;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getFileString() {
    return fileString;
  }
  public void setFileString(String fileString) {
    this.fileString = fileString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014MessagesFiles inlineResponse20014MessagesFiles = (InlineResponse20014MessagesFiles) o;
    return (this.s3Url == null ? inlineResponse20014MessagesFiles.s3Url == null : this.s3Url.equals(inlineResponse20014MessagesFiles.s3Url)) &&
        (this.fileString == null ? inlineResponse20014MessagesFiles.fileString == null : this.fileString.equals(inlineResponse20014MessagesFiles.fileString));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.s3Url == null ? 0: this.s3Url.hashCode());
    result = 31 * result + (this.fileString == null ? 0: this.fileString.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014MessagesFiles {\n");
    
    sb.append("  s3Url: ").append(s3Url).append("\n");
    sb.append("  fileString: ").append(fileString).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}