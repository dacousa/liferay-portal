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

package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

/**
 * Provides a wrapper for {@link ExportImportService}.
 *
 * @author Brian Wing Shun Chan
 * @see ExportImportService
 * @generated
 */
@ProviderType
public class ExportImportServiceWrapper implements ExportImportService,
	ServiceWrapper<ExportImportService> {
	public ExportImportServiceWrapper(ExportImportService exportImportService) {
		_exportImportService = exportImportService;
	}

	@Override
	public java.io.File exportLayoutsAsFile(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.exportLayoutsAsFile(exportImportConfiguration);
	}

	@Override
	public long exportLayoutsAsFileInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.exportLayoutsAsFileInBackground(exportImportConfiguration);
	}

	@Override
	public long exportLayoutsAsFileInBackground(
		long exportImportConfigurationId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.exportLayoutsAsFileInBackground(exportImportConfigurationId);
	}

	@Override
	public java.io.File exportPortletInfoAsFile(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.exportPortletInfoAsFile(exportImportConfiguration);
	}

	@Override
	public long exportPortletInfoAsFileInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.exportPortletInfoAsFileInBackground(exportImportConfiguration);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _exportImportService.getBeanIdentifier();
	}

	@Override
	public void importLayouts(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		_exportImportService.importLayouts(exportImportConfiguration, file);
	}

	@Override
	public void importLayouts(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		_exportImportService.importLayouts(exportImportConfiguration,
			inputStream);
	}

	@Override
	public long importLayoutsInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.importLayoutsInBackground(exportImportConfiguration,
			file);
	}

	@Override
	public long importLayoutsInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.importLayoutsInBackground(exportImportConfiguration,
			inputStream);
	}

	@Override
	public void importPortletInfo(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		_exportImportService.importPortletInfo(exportImportConfiguration, file);
	}

	@Override
	public void importPortletInfo(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		_exportImportService.importPortletInfo(exportImportConfiguration,
			inputStream);
	}

	@Override
	public long importPortletInfoInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.importPortletInfoInBackground(exportImportConfiguration,
			file);
	}

	@Override
	public long importPortletInfoInBackground(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.importPortletInfoInBackground(exportImportConfiguration,
			inputStream);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_exportImportService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public com.liferay.portal.kernel.lar.MissingReferences validateImportLayoutsFile(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.validateImportLayoutsFile(exportImportConfiguration,
			file);
	}

	@Override
	public com.liferay.portal.kernel.lar.MissingReferences validateImportLayoutsFile(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.validateImportLayoutsFile(exportImportConfiguration,
			inputStream);
	}

	@Override
	public com.liferay.portal.kernel.lar.MissingReferences validateImportPortletInfo(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.File file)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.validateImportPortletInfo(exportImportConfiguration,
			file);
	}

	@Override
	public com.liferay.portal.kernel.lar.MissingReferences validateImportPortletInfo(
		com.liferay.portal.model.ExportImportConfiguration exportImportConfiguration,
		java.io.InputStream inputStream)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _exportImportService.validateImportPortletInfo(exportImportConfiguration,
			inputStream);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public ExportImportService getWrappedExportImportService() {
		return _exportImportService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedExportImportService(
		ExportImportService exportImportService) {
		_exportImportService = exportImportService;
	}

	@Override
	public ExportImportService getWrappedService() {
		return _exportImportService;
	}

	@Override
	public void setWrappedService(ExportImportService exportImportService) {
		_exportImportService = exportImportService;
	}

	private ExportImportService _exportImportService;
}