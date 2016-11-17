package au.com.westpac.accounts.savingsdeposits;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Represents  summary level information about the Account.
 **/

/**
 * Represents  summary level information about the Account.
 */
@ApiModel(description = "Represents  summary level information about the Account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public class AccountSummaryView   {
  /**
   * Status of the account
   */
  public enum StatusEnum {
    NORMAL("Normal"),
    
    RESTRICTED("Restricted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = null;

  private Double monetaryLimit = null;

  public AccountSummaryView status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the account
   * @return status
  **/
  @ApiModelProperty(value = "Status of the account")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public AccountSummaryView monetaryLimit(Double monetaryLimit) {
    this.monetaryLimit = monetaryLimit;
    return this;
  }

   /**
   * Overdrawn limits for the account
   * @return monetaryLimit
  **/
  @ApiModelProperty(value = "Overdrawn limits for the account")
  public Double getMonetaryLimit() {
    return monetaryLimit;
  }

  public void setMonetaryLimit(Double monetaryLimit) {
    this.monetaryLimit = monetaryLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountSummaryView accountSummaryView = (AccountSummaryView) o;
    return Objects.equals(this.status, accountSummaryView.status) &&
        Objects.equals(this.monetaryLimit, accountSummaryView.monetaryLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, monetaryLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSummaryView {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    monetaryLimit: ").append(toIndentedString(monetaryLimit)).append("\n");
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

