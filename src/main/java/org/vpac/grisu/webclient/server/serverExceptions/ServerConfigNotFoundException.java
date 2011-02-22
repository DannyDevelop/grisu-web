/**
 * 
 */
package org.vpac.grisu.webclient.server.serverExceptions;

/**
 * @author danny
 *
 */
public class ServerConfigNotFoundException extends Exception {

	
	
	public ServerConfigNotFoundException(Exception e) 
	{
		super("Counldn't load DefaultServerConfiguration.XML ServerConfiguration.xml ERROR : " + e);
		
	}
}
