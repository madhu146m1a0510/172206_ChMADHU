package com.cg.rest.Springrest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	private Map<Long, Message> messages = Databaseclass.getMessages();
public MessageService()
{
	messages.put(1L,new Message(1L, "madhu","ram"));
	messages.put(2L,new Message(2L, "ram","madhu"));

}
	public List<Message> getAllmessages() {

		return new ArrayList<Message>(messages.values());
	}

	public Message getMessages(Long id) {
		return messages.get(id);
	}

	public Message addMessages(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessages(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
}