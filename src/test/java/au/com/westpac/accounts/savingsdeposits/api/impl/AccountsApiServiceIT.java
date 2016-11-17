package au.com.westpac.accounts.savingsdeposits.api.impl;

import au.com.westpac.accounts.savingsdeposits.api.AccountsApi;
import au.com.westpac.accounts.savingsdeposits.api.ApiResponseMessage;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;

import static org.hamcrest.CoreMatchers.is;

public class AccountsApiServiceIT extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(AccountsApi.class);
    }

    @Test
    public void shouldReturnMagic() {
        ApiResponseMessage message = target("/accounts/summaryView").request().get(ApiResponseMessage.class);
        Assert.assertThat(message.getType(), is("ok"));
        Assert.assertThat(message.getMessage(), is("magic!"));
    }
}
