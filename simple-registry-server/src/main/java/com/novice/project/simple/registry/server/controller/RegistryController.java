/*
 * Copyright 2004-2020 Homolo Co., Ltd. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.novice.project.simple.registry.server.controller;

import com.novice.project.simple.registry.server.pojo.SimpleServiceInstance;
import com.novice.project.simple.registry.server.result.Message;
import com.novice.project.simple.registry.server.result.MessageCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registry")
public class RegistryController {

	@PostMapping("/register")
	public Message<Void> register(@RequestBody SimpleServiceInstance serviceInstance) {
		System.out.println(serviceInstance);
		return new Message<>(MessageCode.SUCCESS);
	}
}
