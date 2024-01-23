package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "participants")
public class ParticipantEntities {
	List<ParticipantEntity> participants;

	public ParticipantEntities() {
	}

	public ParticipantEntities(List<ParticipantEntity> participants) {
		this.participants = participants;
	}

	@XmlElement(name = "participants")
	public List<ParticipantEntity> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantEntity> participants) {
		this.participants = participants;
	}
}
