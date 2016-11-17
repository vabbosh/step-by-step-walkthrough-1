package au.com.westpac.accounts.savingsdeposits.api;

import au.com.westpac.accounts.savingsdeposits.*;
import au.com.westpac.accounts.savingsdeposits.api.AccountsApiService;
import au.com.westpac.accounts.savingsdeposits.api.factories.AccountsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.accounts.savingsdeposits.InlineResponse200;
import au.com.westpac.accounts.savingsdeposits.InlineResponse500;
import au.com.westpac.accounts.savingsdeposits.InlineResponse400;

import java.util.List;
import au.com.westpac.accounts.savingsdeposits.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/accounts")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the accounts API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public class AccountsApi  {
   private final AccountsApiService delegate = AccountsApiServiceFactory.getAccountsApi();

    @GET
    @Path("/summaryView")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "retrieves summary view of the account.", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "JWT Bearer")
    }, tags={ "retrieveAccountSummaryView", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "No Content", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorised", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not found", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = InlineResponse200.class) })
    public Response retrieveAccountSummaryView(@ApiParam(value = "Globally unique message identifier  - GUID" ,required=true)@HeaderParam("X-messageId") String xMessageId
,@ApiParam(value = "Brand e.g WBC, SGB" ,required=true, allowableValues="WPAC, SGB, BTPL, EPL")@HeaderParam("X-brandSilo") String xBrandSilo
,@ApiParam(value = "Channel Type" ,required=true, allowableValues="Branch, Online, Contact Centre, ATM, Mobile, IVR Telephony, Relationship Managed, External Broker, External EFA, External, Unknown, Internal")@HeaderParam("X-channelType") String xChannelType
,@ApiParam(value = "System Id of Application e.g. KO-001" ,required=true)@HeaderParam("X-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "The pointer to header field where account identifier is available.",required=true, defaultValue="X-accountIdentifier") @DefaultValue("X-accountIdentifier") @QueryParam("accountRef") String accountRef
,@ApiParam(value = "An unique identifier for the account. Format <ProductCode>.<BSB Code>.<AccountNumber>" ,required=true)@HeaderParam("X-accountIdentifier") String xAccountIdentifier
,@ApiParam(value = "Consumer generated message identifier" )@HeaderParam("X-appCorrelationId") String xAppCorrelationId
,@ApiParam(value = "Brand e.g WBC." , allowableValues="WBC, SGB, BSA, BOM, BTPL, UBS, VIRG")@HeaderParam("X-organisationId") String xOrganisationId
,@ApiParam(value = "Sub Sytem Id to Idenfity a specific application or bussiness case under the System" )@HeaderParam("X-originatingSubSystemId") String xOriginatingSubSystemId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.retrieveAccountSummaryView(xMessageId,xBrandSilo,xChannelType,xOriginatingSystemId,accountRef,xAccountIdentifier,xAppCorrelationId,xOrganisationId,xOriginatingSubSystemId,securityContext);
    }
}
