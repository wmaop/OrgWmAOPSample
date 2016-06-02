package org.wmaop.sample.util;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-06-02 07:49:51 BST
// -----( ON-HOST: WSII

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.net.InetAddress;
import java.net.UnknownHostException;
// --- <<IS-END-IMPORTS>> ---

public final class server

{
	// ---( internal utility methods )---

	final static server _instance = new server();

	static server _newInstance() { return new server(); }

	static server _cast(Object o) { return (server)o; }

	// ---( server methods )---




	public static final void getHostName (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getHostName)>> ---
		// @sigtype java 3.5
		// [o] field:0:required hostName
		String hostName = "unknown";
		try {
			hostName = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			String winCompName = System.getenv("COMPUTERNAME");
			if (winCompName != null) {
				hostName = winCompName;
			}
			// NOOP
		}
		IDataCursor pipelineCursor = pipeline.getCursor();
		IDataUtil.put( pipelineCursor, "hostName", hostName);
		pipelineCursor.destroy();  
		// --- <<IS-END>> ---

                
	}
}

