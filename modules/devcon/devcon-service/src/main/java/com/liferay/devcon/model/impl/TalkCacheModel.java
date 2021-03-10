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

package com.liferay.devcon.model.impl;

import com.liferay.devcon.model.Talk;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Talk in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TalkCacheModel implements CacheModel<Talk>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TalkCacheModel)) {
			return false;
		}

		TalkCacheModel talkCacheModel = (TalkCacheModel)object;

		if (talkId == talkCacheModel.talkId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, talkId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", talkId=");
		sb.append(talkId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", speaker=");
		sb.append(speaker);
		sb.append(", description=");
		sb.append(description);
		sb.append(", startDate=");
		sb.append(startDate);
		sb.append(", endDate=");
		sb.append(endDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Talk toEntityModel() {
		TalkImpl talkImpl = new TalkImpl();

		if (uuid == null) {
			talkImpl.setUuid("");
		}
		else {
			talkImpl.setUuid(uuid);
		}

		talkImpl.setTalkId(talkId);
		talkImpl.setGroupId(groupId);
		talkImpl.setCompanyId(companyId);
		talkImpl.setUserId(userId);

		if (userName == null) {
			talkImpl.setUserName("");
		}
		else {
			talkImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			talkImpl.setCreateDate(null);
		}
		else {
			talkImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			talkImpl.setModifiedDate(null);
		}
		else {
			talkImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (name == null) {
			talkImpl.setName("");
		}
		else {
			talkImpl.setName(name);
		}

		if (speaker == null) {
			talkImpl.setSpeaker("");
		}
		else {
			talkImpl.setSpeaker(speaker);
		}

		if (description == null) {
			talkImpl.setDescription("");
		}
		else {
			talkImpl.setDescription(description);
		}

		if (startDate == Long.MIN_VALUE) {
			talkImpl.setStartDate(null);
		}
		else {
			talkImpl.setStartDate(new Date(startDate));
		}

		if (endDate == Long.MIN_VALUE) {
			talkImpl.setEndDate(null);
		}
		else {
			talkImpl.setEndDate(new Date(endDate));
		}

		talkImpl.resetOriginalValues();

		return talkImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		talkId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		name = objectInput.readUTF();
		speaker = objectInput.readUTF();
		description = objectInput.readUTF();
		startDate = objectInput.readLong();
		endDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(talkId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (speaker == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(speaker);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(startDate);
		objectOutput.writeLong(endDate);
	}

	public String uuid;
	public long talkId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String name;
	public String speaker;
	public String description;
	public long startDate;
	public long endDate;

}