package au.com.westpac.accounts.savingsdeposits;

import java.util.Objects;
import au.com.westpac.accounts.savingsdeposits.Error;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;



/**
 * Represents the error Model, returned in case of error conditions
 **/

/**
 * Represents the error Model, returned in case of error conditions
 */
@ApiModel(description = "Represents the error Model, returned in case of error conditions")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public class ErrorModel   {
  private List<Error> errorList = new ArrayList<Error>();

  public ErrorModel errorList(List<Error> errorList) {
    this.errorList = errorList;
    return this;
  }

  public ErrorModel addErrorListItem(Error errorListItem) {
    this.errorList.add(errorListItem);
    return this;
  }

   /**
   * Get errorList
   * @return errorList
  **/
  @ApiModelProperty(value = "")
  public List<Error> getErrorList() {
    return errorList;
  }

  public void setErrorList(List<Error> errorList) {
    this.errorList = errorList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorModel errorModel = (ErrorModel) o;
    return Objects.equals(this.errorList, errorModel.errorList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorModel {\n");
    
    sb.append("    errorList: ").append(toIndentedString(errorList)).append("\n");
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

