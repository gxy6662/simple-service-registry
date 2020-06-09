/*
 * Copyright 2004-2020 Homolo Co., Ltd. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.novice.project.simple.registry;

import org.springframework.cloud.client.serviceregistry.ServiceRegistry;

public class SimpleServiceRegistry implements ServiceRegistry<SimpleRegistration> {

	@Override
	public void register(SimpleRegistration registration) {

	}

	@Override
	public void deregister(SimpleRegistration registration) {

	}

	@Override
	public void close() {

	}

	@Override
	public void setStatus(SimpleRegistration registration, String status) {

	}

	@Override
	public <T> T getStatus(SimpleRegistration registration) {
		return null;
	}
}
