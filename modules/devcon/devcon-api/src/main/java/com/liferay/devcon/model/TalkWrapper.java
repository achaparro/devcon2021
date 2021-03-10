/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.devcon.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Talk}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Talk
 * @generated
 */
public class TalkWrapper
	extends BaseModelWrapper<Talk> implements ModelWrapper<Talk>, Talk {

	public TalkWrapper(Talk talk) {
		super(talk);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("talkId", getTalkId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("speaker", getSpeaker());
		attributes.put("description", getDescription());
		attributes.put("startDate", getStartDate());
		attributes.put("endDate", getEndDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long talkId = (Long)attributes.get("talkId");

		if (talkId != null) {
			setTalkId(talkId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String speaker = (String)attributes.get("speaker");

		if (speaker != null) {
			setSpeaker(speaker);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date startDate = (Date)attributes.get("startDate");

		if (startDate != null) {
			setStartDate(startDate);
		}

		Date endDate = (Date)attributes.get("endDate");

		if (endDate != null) {
			setEndDate(endDate);
		}
	}

	/**
	 * Returns the company ID of this talk.
	 *
	 * @return the company ID of this talk
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this talk.
	 *
	 * @return the create date of this talk
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this talk.
	 *
	 * @return the description of this talk
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the end date of this talk.
	 *
	 * @return the end date of this talk
	 */
	@Override
	public Date getEndDate() {
		return model.getEndDate();
	}

	/**
	 * Returns the group ID of this talk.
	 *
	 * @return the group ID of this talk
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this talk.
	 *
	 * @return the modified date of this talk
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this talk.
	 *
	 * @return the name of this talk
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this talk.
	 *
	 * @return the primary key of this talk
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the speaker of this talk.
	 *
	 * @return the speaker of this talk
	 */
	@Override
	public String getSpeaker() {
		return model.getSpeaker();
	}

	/**
	 * Returns the start date of this talk.
	 *
	 * @return the start date of this talk
	 */
	@Override
	public Date getStartDate() {
		return model.getStartDate();
	}

	/**
	 * Returns the talk ID of this talk.
	 *
	 * @return the talk ID of this talk
	 */
	@Override
	public long getTalkId() {
		return model.getTalkId();
	}

	/**
	 * Returns the user ID of this talk.
	 *
	 * @return the user ID of this talk
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this talk.
	 *
	 * @return the user name of this talk
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this talk.
	 *
	 * @return the user uuid of this talk
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this talk.
	 *
	 * @return the uuid of this talk
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this talk.
	 *
	 * @param companyId the company ID of this talk
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this talk.
	 *
	 * @param createDate the create date of this talk
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this talk.
	 *
	 * @param description the description of this talk
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the end date of this talk.
	 *
	 * @param endDate the end date of this talk
	 */
	@Override
	public void setEndDate(Date endDate) {
		model.setEndDate(endDate);
	}

	/**
	 * Sets the group ID of this talk.
	 *
	 * @param groupId the group ID of this talk
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this talk.
	 *
	 * @param modifiedDate the modified date of this talk
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this talk.
	 *
	 * @param name the name of this talk
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this talk.
	 *
	 * @param primaryKey the primary key of this talk
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the speaker of this talk.
	 *
	 * @param speaker the speaker of this talk
	 */
	@Override
	public void setSpeaker(String speaker) {
		model.setSpeaker(speaker);
	}

	/**
	 * Sets the start date of this talk.
	 *
	 * @param startDate the start date of this talk
	 */
	@Override
	public void setStartDate(Date startDate) {
		model.setStartDate(startDate);
	}

	/**
	 * Sets the talk ID of this talk.
	 *
	 * @param talkId the talk ID of this talk
	 */
	@Override
	public void setTalkId(long talkId) {
		model.setTalkId(talkId);
	}

	/**
	 * Sets the user ID of this talk.
	 *
	 * @param userId the user ID of this talk
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this talk.
	 *
	 * @param userName the user name of this talk
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this talk.
	 *
	 * @param userUuid the user uuid of this talk
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this talk.
	 *
	 * @param uuid the uuid of this talk
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TalkWrapper wrap(Talk talk) {
		return new TalkWrapper(talk);
	}

}