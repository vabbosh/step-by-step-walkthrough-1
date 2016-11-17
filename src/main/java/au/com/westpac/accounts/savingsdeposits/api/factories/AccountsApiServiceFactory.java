package au.com.westpac.accounts.savingsdeposits.api.factories;

import au.com.westpac.accounts.savingsdeposits.api.AccountsApiService;
import au.com.westpac.accounts.savingsdeposits.api.impl.AccountsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-17T18:45:24.812+11:00")
public class AccountsApiServiceFactory {
    private final static AccountsApiService service = new AccountsApiServiceImpl();

    public static AccountsApiService getAccountsApi() {
        return service;
    }
}
