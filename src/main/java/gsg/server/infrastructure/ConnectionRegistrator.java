package gsg.server.infrastructure;

import gsg.infrastructure.messages.MessageContainer;

import java.net.Socket;

/**
* @author zkejid@gmail.com
*         Created: 14.07.15 23:31
*/
public interface ConnectionRegistrator {
	void registerConnection(Socket socket);
}
