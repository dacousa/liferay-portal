/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.security.membershippolicy;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.UserGroup;

import java.io.Serializable;

import java.util.Map;

/**
 * @author Roberto Díaz
 */
public class UserGroupMembershipPolicyUtil {

	public static void checkAddMembership(long[] userIds, long[] userGroupIds)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		membershipPolicy.checkAddMembership(userIds, userGroupIds);
	}

	public static void checkRemoveMembership(
			long[] userIds, long[] userGroupIds)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		membershipPolicy.checkRemoveMembership(userIds, userGroupIds);
	}

	public static boolean isMembershipAllowed(long userId, long userGroupId)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		return membershipPolicy.isMembershipAllowed(userId, userGroupId);
	}

	public static boolean isMembershipRequired(long userId, long userGroupId)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		return membershipPolicy.isMembershipRequired(userId, userGroupId);
	}

	public static void propagateAddMembership(
			long[] userIds, long[] userGroupIds)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		for (long userGroupId : userGroupIds) {
			membershipPolicy.propagateAddMembership(userIds, userGroupId);
		}
	}

	public static void propagateRemoveMembership(
			long[] userIds, long[] userGroupIds)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		for (long userGroupId : userGroupIds) {
			membershipPolicy.propagateRemoveMembership(userIds, userGroupId);
		}
	}

	public static void verifyPolicy() throws PortalException, SystemException {
		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		membershipPolicy.verifyPolicy();
	}

	public static void verifyPolicy(UserGroup userGroup)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		membershipPolicy.verifyPolicy(userGroup);
	}

	public static void verifyUpdatePolicy(
			UserGroup userGroup, UserGroup oldUserGroup,
			Map<String, Serializable> oldExpandoAttributes)
		throws PortalException, SystemException {

		UserGroupMembershipPolicy membershipPolicy =
			UserGroupMembershipPolicyFactoryUtil.getMembershipPolicy();

		membershipPolicy.verifyUpdatePolicy(
			userGroup, oldUserGroup, oldExpandoAttributes);
	}

}