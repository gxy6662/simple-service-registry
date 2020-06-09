/*
 * Copyright 2004-2020 Homolo Co., Ltd. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.novice.project.simple.registry;

import org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration;
import org.springframework.cloud.client.serviceregistry.AutoServiceRegistrationProperties;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

public class SimpleAutoServiceRegistration extends AbstractAutoServiceRegistration<SimpleRegistration> {
	private final SimpleRegistration simpleRegistration;

	protected SimpleAutoServiceRegistration(ServiceRegistry<SimpleRegistration> serviceRegistry,
											AutoServiceRegistrationProperties properties,
											SimpleRegistration registration) {
		super(serviceRegistry, properties);
		this.simpleRegistration = registration;
	}

	@Override
	protected boolean isEnabled() {
		return true;
	}

	@Override
	protected SimpleRegistration getRegistration() {
		return this.simpleRegistration;
	}

	@Override
	protected SimpleRegistration getManagementRegistration() {
		return null;
	}

	@Override
	@Deprecated
	protected Object getConfiguration() {
		return null;
	}
}
