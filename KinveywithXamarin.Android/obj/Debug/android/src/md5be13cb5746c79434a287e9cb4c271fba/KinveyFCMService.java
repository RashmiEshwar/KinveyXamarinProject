package md5be13cb5746c79434a287e9cb4c271fba;


public abstract class KinveyFCMService
	extends mono.android.app.IntentService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("Kinvey.KinveyFCMService, Kinvey", KinveyFCMService.class, __md_methods);
	}


	public KinveyFCMService (java.lang.String p0)
	{
		super (p0);
		if (getClass () == KinveyFCMService.class)
			mono.android.TypeManager.Activate ("Kinvey.KinveyFCMService, Kinvey", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public KinveyFCMService ()
	{
		super ();
		if (getClass () == KinveyFCMService.class)
			mono.android.TypeManager.Activate ("Kinvey.KinveyFCMService, Kinvey", "", this, new java.lang.Object[] {  });
	}


	public void onHandleIntent (android.content.Intent p0)
	{
		n_onHandleIntent (p0);
	}

	private native void n_onHandleIntent (android.content.Intent p0);

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
