package md5be13cb5746c79434a287e9cb4c271fba;


public class KinveyAccountService
	extends android.app.Service
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:()V:GetOnCreateHandler\n" +
			"n_onBind:(Landroid/content/Intent;)Landroid/os/IBinder;:GetOnBind_Landroid_content_Intent_Handler\n" +
			"n_onStartCommand:(Landroid/content/Intent;II)I:GetOnStartCommand_Landroid_content_Intent_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Kinvey.KinveyAccountService, Kinvey", KinveyAccountService.class, __md_methods);
	}


	public KinveyAccountService ()
	{
		super ();
		if (getClass () == KinveyAccountService.class)
			mono.android.TypeManager.Activate ("Kinvey.KinveyAccountService, Kinvey", "", this, new java.lang.Object[] {  });
	}


	public void onCreate ()
	{
		n_onCreate ();
	}

	private native void n_onCreate ();


	public android.os.IBinder onBind (android.content.Intent p0)
	{
		return n_onBind (p0);
	}

	private native android.os.IBinder n_onBind (android.content.Intent p0);


	public int onStartCommand (android.content.Intent p0, int p1, int p2)
	{
		return n_onStartCommand (p0, p1, p2);
	}

	private native int n_onStartCommand (android.content.Intent p0, int p1, int p2);

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
