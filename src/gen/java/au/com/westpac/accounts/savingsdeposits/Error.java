package au.com.westpac.accounts.savingsdeposits;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Represent an invidual error.
 **/

/**
 * Represent an invidual error.
 */
@ApiModel(description = "Represent an invidual error.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public class Error   {
  private Integer code = null;

  private String message = null;

  private String fields = null;

  public Error code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Error Code.
   * @return code
  **/
  @ApiModelProperty(value = "Error Code.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error Message
   * @return message
  **/
  @ApiModelProperty(value = "Error Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error fields(String fields) {
    this.fields = fields;
    return this;
  }

   /**
   * Comma seperated list of fields, which caused the error condition.
   * @return fields
  **/
  @ApiModelProperty(value = "Comma seperated list of fields, which caused the error condition.")
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.fields, error.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

