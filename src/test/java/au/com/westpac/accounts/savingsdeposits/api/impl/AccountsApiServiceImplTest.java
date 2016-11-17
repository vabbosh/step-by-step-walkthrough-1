package au.com.westpac.accounts.savingsdeposits.api.impl;

import au.com.westpac.accounts.savingsdeposits.api.ApiResponseMessage;
import au.com.westpac.accounts.savingsdeposits.api.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.hamcrest.CoreMatchers.is;

public class AccountsApiServiceImplTest {

    private AccountsApiServiceImpl serviceImpl = new AccountsApiServiceImpl();

    @Test
    public void shouldReturnMagic() throws NotFoundException {
        Response response = this.serviceImpl.retrieveAccountSummaryView("xMessageId", "xBrandSilo", "xChannelType", "xOriginatingSystemId", "accountRef", "xAccountIdentifier", "xAppCorrelationId", "xOrganisationId", "xOriginatingSubSystemId", null);
        ApiResponseMessage message = (ApiResponseMessage) response.getEntity();
        Assert.assertThat(message.getCode(), is(ApiResponseMessage.OK));
        Assert.assertThat(message.getMessage(), is("magic!"));
    }
}