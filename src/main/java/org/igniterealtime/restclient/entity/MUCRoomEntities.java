package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
public class MUCRoomEntities {
	List<MUCRoomEntity> chatRooms;

	public MUCRoomEntities() {
	}

	public MUCRoomEntities(List<MUCRoomEntity> mucRooms) {
		this.chatRooms = mucRooms;
	}

	@XmlElement(name = "chatRooms")
	public List<MUCRoomEntity> getChatRooms() {
		return chatRooms;
	}

	public void setChatRooms(List<MUCRoomEntity> mucRooms) {
		this.chatRooms = mucRooms;
	}
}
