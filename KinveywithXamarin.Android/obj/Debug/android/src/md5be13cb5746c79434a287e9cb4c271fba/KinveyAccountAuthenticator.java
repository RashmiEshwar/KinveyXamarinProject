package md5be13cb5746c79434a287e9cb4c271fba;


public class KinveyAccountAuthenticator
	extends android.accounts.AbstractAccountAuthenticator
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_addAccount:(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;:GetAddAccount_Landroid_accounts_AccountAuthenticatorResponse_Ljava_lang_String_Ljava_lang_String_arrayLjava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_getAuthToken:(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;:GetGetAuthToken_Landroid_accounts_AccountAuthenticatorResponse_Landroid_accounts_Account_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_hasFeatures:(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)Landroid/os/Bundle;:GetHasFeatures_Landroid_accounts_AccountAuthenticatorResponse_Landroid_accounts_Account_arrayLjava_lang_String_Handler\n" +
			"n_editProperties:(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;)Landroid/os/Bundle;:GetEditProperties_Landroid_accounts_AccountAuthenticatorResponse_Ljava_lang_String_Handler\n" +
			"n_confirmCredentials:(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Landroid/os/Bundle;)Landroid/os/Bundle;:GetConfirmCredentials_Landroid_accounts_AccountAuthenticatorResponse_Landroid_accounts_Account_Landroid_os_Bundle_Handler\n" +
			"n_updateCredentials:(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;:GetUpdateCredentials_Landroid_accounts_AccountAuthenticatorResponse_Landroid_accounts_Account_Ljava_lang_String_Landroid_os_Bundle_Handler\n" +
			"n_getAuthTokenLabel:(Ljava/lang/String;)Ljava/lang/String;:GetGetAuthTokenLabel_Ljava_lang_String_Handler\n" +
			"";
		mono.android.Runtime.register ("Kinvey.KinveyAccountAuthenticator, Kinvey", KinveyAccountAuthenticator.class, __md_methods);
	}


	public KinveyAccountAuthenticator (android.content.Context p0)
	{
		super (p0);
		if (getClass () == KinveyAccountAuthenticator.class)
			mono.android.TypeManager.Activate ("Kinvey.KinveyAccountAuthenticator, Kinvey", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.os.Bundle addAccount (android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4)
	{
		return n_addAccount (p0, p1, p2, p3, p4);
	}

	private native android.os.Bundle n_addAccount (android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3, android.os.Bundle p4);


	public android.os.Bundle getAuthToken (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3)
	{
		return n_getAuthToken (p0, p1, p2, p3);
	}

	private native android.os.Bundle n_getAuthToken (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3);


	public android.os.Bundle hasFeatures (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2)
	{
		return n_hasFeatures (p0, p1, p2);
	}

	private native android.os.Bundle n_hasFeatures (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String[] p2);


	public android.os.Bundle editProperties (android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1)
	{
		return n_editProperties (p0, p1);
	}

	private native android.os.Bundle n_editProperties (android.accounts.AccountAuthenticatorResponse p0, java.lang.String p1);


	public android.os.Bundle confirmCredentials (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2)
	{
		return n_confirmCredentials (p0, p1, p2);
	}

	private native android.os.Bundle n_confirmCredentials (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, android.os.Bundle p2);


	public android.os.Bundle updateCredentials (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3)
	{
		return n_updateCredentials (p0, p1, p2, p3);
	}

	private native android.os.Bundle n_updateCredentials (android.accounts.AccountAuthenticatorResponse p0, android.accounts.Account p1, java.lang.String p2, android.os.Bundle p3);


	public java.lang.String getAuthTokenLabel (java.lang.String p0)
	{
		return n_getAuthTokenLabel (p0);
	}

	private native java.lang.String n_getAuthTokenLabel (java.lang.String p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
