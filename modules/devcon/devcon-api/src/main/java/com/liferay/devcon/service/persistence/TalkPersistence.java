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

package com.liferay.devcon.service.persistence;

import com.liferay.devcon.exception.NoSuchTalkException;
import com.liferay.devcon.model.Talk;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the talk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TalkUtil
 * @generated
 */
@ProviderType
public interface TalkPersistence extends BasePersistence<Talk> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TalkUtil} to access the talk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the talks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching talks
	 */
	public java.util.List<Talk> findByUuid(String uuid);

	/**
	 * Returns a range of all the talks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @return the range of matching talks
	 */
	public java.util.List<Talk> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the talks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns an ordered range of all the talks where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the first talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the last talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the last talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the talks before and after the current talk in the ordered set where uuid = &#63;.
	 *
	 * @param talkId the primary key of the current talk
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public Talk[] findByUuid_PrevAndNext(
			long talkId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Removes all the talks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of talks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching talks
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTalkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findByUUID_G(String uuid, long groupId)
		throws NoSuchTalkException;

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the talk where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the talk that was removed
	 */
	public Talk removeByUUID_G(String uuid, long groupId)
		throws NoSuchTalkException;

	/**
	 * Returns the number of talks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching talks
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the talks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching talks
	 */
	public java.util.List<Talk> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the talks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @return the range of matching talks
	 */
	public java.util.List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the talks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns an ordered range of all the talks where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the first talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the last talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the last talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the talks before and after the current talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param talkId the primary key of the current talk
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public Talk[] findByUuid_C_PrevAndNext(
			long talkId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Removes all the talks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of talks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching talks
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the talks where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @return the matching talks
	 */
	public java.util.List<Talk> findBystartDate(Date startDate);

	/**
	 * Returns a range of all the talks where startDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param startDate the start date
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @return the range of matching talks
	 */
	public java.util.List<Talk> findBystartDate(
		Date startDate, int start, int end);

	/**
	 * Returns an ordered range of all the talks where startDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param startDate the start date
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findBystartDate(
		Date startDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns an ordered range of all the talks where startDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param startDate the start date
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching talks
	 */
	public java.util.List<Talk> findBystartDate(
		Date startDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findBystartDate_First(
			Date startDate,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the first talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchBystartDate_First(
		Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the last talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public Talk findBystartDate_Last(
			Date startDate,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Returns the last talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public Talk fetchBystartDate_Last(
		Date startDate,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns the talks before and after the current talk in the ordered set where startDate = &#63;.
	 *
	 * @param talkId the primary key of the current talk
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public Talk[] findBystartDate_PrevAndNext(
			long talkId, Date startDate,
			com.liferay.portal.kernel.util.OrderByComparator<Talk>
				orderByComparator)
		throws NoSuchTalkException;

	/**
	 * Removes all the talks where startDate = &#63; from the database.
	 *
	 * @param startDate the start date
	 */
	public void removeBystartDate(Date startDate);

	/**
	 * Returns the number of talks where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @return the number of matching talks
	 */
	public int countBystartDate(Date startDate);

	/**
	 * Caches the talk in the entity cache if it is enabled.
	 *
	 * @param talk the talk
	 */
	public void cacheResult(Talk talk);

	/**
	 * Caches the talks in the entity cache if it is enabled.
	 *
	 * @param talks the talks
	 */
	public void cacheResult(java.util.List<Talk> talks);

	/**
	 * Creates a new talk with the primary key. Does not add the talk to the database.
	 *
	 * @param talkId the primary key for the new talk
	 * @return the new talk
	 */
	public Talk create(long talkId);

	/**
	 * Removes the talk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk that was removed
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public Talk remove(long talkId) throws NoSuchTalkException;

	public Talk updateImpl(Talk talk);

	/**
	 * Returns the talk with the primary key or throws a <code>NoSuchTalkException</code> if it could not be found.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public Talk findByPrimaryKey(long talkId) throws NoSuchTalkException;

	/**
	 * Returns the talk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk, or <code>null</code> if a talk with the primary key could not be found
	 */
	public Talk fetchByPrimaryKey(long talkId);

	/**
	 * Returns all the talks.
	 *
	 * @return the talks
	 */
	public java.util.List<Talk> findAll();

	/**
	 * Returns a range of all the talks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @return the range of talks
	 */
	public java.util.List<Talk> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the talks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of talks
	 */
	public java.util.List<Talk> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator);

	/**
	 * Returns an ordered range of all the talks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TalkModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of talks
	 * @param end the upper bound of the range of talks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of talks
	 */
	public java.util.List<Talk> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Talk>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the talks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of talks.
	 *
	 * @return the number of talks
	 */
	public int countAll();

}