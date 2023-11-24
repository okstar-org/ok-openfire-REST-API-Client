package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

/**
 * The Class RosterEntities.
 */
@XmlRootElement(name = "roster")
public class RosterEntities {

	/** The roster. */
	List<RosterItemEntity> rosterItem;

	/**
	 * Instantiates a new roster entities.
	 */
	public RosterEntities() {

	}

	/**
	 * Instantiates a new roster entities.
	 *
	 * @param roster
	 *            the roster
	 */
	public RosterEntities(List<RosterItemEntity> roster) {
		this.rosterItem = roster;
	}

	/**
	 * Gets the roster.
	 *
	 * @return the roster
	 */
	@XmlElement(name = "rosterItem")
	public List<RosterItemEntity> getRosterItem() {
		return rosterItem;
	}

	/**
	 * Sets the roster.
	 *
	 * @param roster
	 *            the new roster
	 */

	public void setRosterItem(List<RosterItemEntity> roster) {
		this.rosterItem = roster;
	}

}
