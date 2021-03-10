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

import com.liferay.devcon.model.Talk;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the talk service. This utility wraps <code>com.liferay.devcon.service.persistence.impl.TalkPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TalkPersistence
 * @generated
 */
public class TalkUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Talk talk) {
		getPersistence().clearCache(talk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Talk> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Talk> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Talk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Talk> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Talk update(Talk talk) {
		return getPersistence().update(talk);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Talk update(Talk talk, ServiceContext serviceContext) {
		return getPersistence().update(talk, serviceContext);
	}

	/**
	 * Returns all the talks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching talks
	 */
	public static List<Talk> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<Talk> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<Talk> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<Talk> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Talk> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findByUuid_First(
			String uuid, OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUuid_First(
		String uuid, OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findByUuid_Last(
			String uuid, OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUuid_Last(
		String uuid, OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the talks before and after the current talk in the ordered set where uuid = &#63;.
	 *
	 * @param talkId the primary key of the current talk
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public static Talk[] findByUuid_PrevAndNext(
			long talkId, String uuid, OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_PrevAndNext(
			talkId, uuid, orderByComparator);
	}

	/**
	 * Removes all the talks where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of talks where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching talks
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTalkException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findByUUID_G(String uuid, long groupId)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the talk where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the talk where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the talk that was removed
	 */
	public static Talk removeByUUID_G(String uuid, long groupId)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of talks where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching talks
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the talks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching talks
	 */
	public static List<Talk> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<Talk> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Talk> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static Talk[] findByUuid_C_PrevAndNext(
			long talkId, String uuid, long companyId,
			OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByUuid_C_PrevAndNext(
			talkId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the talks where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of talks where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching talks
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the talks where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @return the matching talks
	 */
	public static List<Talk> findBystartDate(Date startDate) {
		return getPersistence().findBystartDate(startDate);
	}

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
	public static List<Talk> findBystartDate(
		Date startDate, int start, int end) {

		return getPersistence().findBystartDate(startDate, start, end);
	}

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
	public static List<Talk> findBystartDate(
		Date startDate, int start, int end,
		OrderByComparator<Talk> orderByComparator) {

		return getPersistence().findBystartDate(
			startDate, start, end, orderByComparator);
	}

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
	public static List<Talk> findBystartDate(
		Date startDate, int start, int end,
		OrderByComparator<Talk> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBystartDate(
			startDate, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findBystartDate_First(
			Date startDate, OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findBystartDate_First(
			startDate, orderByComparator);
	}

	/**
	 * Returns the first talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchBystartDate_First(
		Date startDate, OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchBystartDate_First(
			startDate, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk
	 * @throws NoSuchTalkException if a matching talk could not be found
	 */
	public static Talk findBystartDate_Last(
			Date startDate, OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findBystartDate_Last(
			startDate, orderByComparator);
	}

	/**
	 * Returns the last talk in the ordered set where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching talk, or <code>null</code> if a matching talk could not be found
	 */
	public static Talk fetchBystartDate_Last(
		Date startDate, OrderByComparator<Talk> orderByComparator) {

		return getPersistence().fetchBystartDate_Last(
			startDate, orderByComparator);
	}

	/**
	 * Returns the talks before and after the current talk in the ordered set where startDate = &#63;.
	 *
	 * @param talkId the primary key of the current talk
	 * @param startDate the start date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public static Talk[] findBystartDate_PrevAndNext(
			long talkId, Date startDate,
			OrderByComparator<Talk> orderByComparator)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findBystartDate_PrevAndNext(
			talkId, startDate, orderByComparator);
	}

	/**
	 * Removes all the talks where startDate = &#63; from the database.
	 *
	 * @param startDate the start date
	 */
	public static void removeBystartDate(Date startDate) {
		getPersistence().removeBystartDate(startDate);
	}

	/**
	 * Returns the number of talks where startDate = &#63;.
	 *
	 * @param startDate the start date
	 * @return the number of matching talks
	 */
	public static int countBystartDate(Date startDate) {
		return getPersistence().countBystartDate(startDate);
	}

	/**
	 * Caches the talk in the entity cache if it is enabled.
	 *
	 * @param talk the talk
	 */
	public static void cacheResult(Talk talk) {
		getPersistence().cacheResult(talk);
	}

	/**
	 * Caches the talks in the entity cache if it is enabled.
	 *
	 * @param talks the talks
	 */
	public static void cacheResult(List<Talk> talks) {
		getPersistence().cacheResult(talks);
	}

	/**
	 * Creates a new talk with the primary key. Does not add the talk to the database.
	 *
	 * @param talkId the primary key for the new talk
	 * @return the new talk
	 */
	public static Talk create(long talkId) {
		return getPersistence().create(talkId);
	}

	/**
	 * Removes the talk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk that was removed
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public static Talk remove(long talkId)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().remove(talkId);
	}

	public static Talk updateImpl(Talk talk) {
		return getPersistence().updateImpl(talk);
	}

	/**
	 * Returns the talk with the primary key or throws a <code>NoSuchTalkException</code> if it could not be found.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk
	 * @throws NoSuchTalkException if a talk with the primary key could not be found
	 */
	public static Talk findByPrimaryKey(long talkId)
		throws com.liferay.devcon.exception.NoSuchTalkException {

		return getPersistence().findByPrimaryKey(talkId);
	}

	/**
	 * Returns the talk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param talkId the primary key of the talk
	 * @return the talk, or <code>null</code> if a talk with the primary key could not be found
	 */
	public static Talk fetchByPrimaryKey(long talkId) {
		return getPersistence().fetchByPrimaryKey(talkId);
	}

	/**
	 * Returns all the talks.
	 *
	 * @return the talks
	 */
	public static List<Talk> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Talk> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Talk> findAll(
		int start, int end, OrderByComparator<Talk> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Talk> findAll(
		int start, int end, OrderByComparator<Talk> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the talks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of talks.
	 *
	 * @return the number of talks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TalkPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TalkPersistence, TalkPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TalkPersistence.class);

		ServiceTracker<TalkPersistence, TalkPersistence> serviceTracker =
			new ServiceTracker<TalkPersistence, TalkPersistence>(
				bundle.getBundleContext(), TalkPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}