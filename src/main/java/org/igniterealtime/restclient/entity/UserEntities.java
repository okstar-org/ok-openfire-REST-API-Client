package org.igniterealtime.restclient.entity;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

/**
 * The Class UserEntities.
 */
@XmlRootElement(name = "users")
public class UserEntities {

	/** The users. */
	List<UserEntity> users;

	/**
	 * Instantiates a new user entities.
	 */
	public UserEntities() {

	}

	/**
	 * Instantiates a new user entities.
	 *
	 * @param users
	 *            the users
	 */
	public UserEntities(List<UserEntity> users) {
		this.users = users;
	}

	/**
	 * Gets the users.
	 *
	 * @return the users
	 */
	public List<UserEntity> getUsers() {
		return users;
	}

	/**
	 * Sets the users.
	 *
	 * @param users
	 *            the new users
	 */
	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}

}
