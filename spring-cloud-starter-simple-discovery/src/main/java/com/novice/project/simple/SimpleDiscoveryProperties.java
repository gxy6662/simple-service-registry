/*
 * Copyright 2004-2020 Homolo Co., Ltd. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.novice.project.simple;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;


@Data
@Component
@ConfigurationProperties("spring.cloud.simple.discovery")
public class SimpleDiscoveryProperties {
	private String serverAddr;
	private String host;
	@Value("${spring.cloud.simple.discovery.port:${server.port:8080}}")
	private int port;
	@Value("${spring.cloud.simple.discovery.service:${spring.application.name:}}")
	private String service;
	private String group = "DEFAULT_GROUP";
	private Map<String, String> metadata = new HashMap<>();
	private boolean secure = false;

	@PostConstruct
	public void init() throws UnknownHostException {
		if (StringUtils.isEmpty(this.host)) {
			this.host = InetAddress.getLocalHost().getHostName();
		}
	}
}
