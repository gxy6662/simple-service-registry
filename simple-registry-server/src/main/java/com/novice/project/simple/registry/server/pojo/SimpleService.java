/*
 * Copyright 2004-2020 Homolo Co., Ltd. All rights reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */
package com.novice.project.simple.registry.server.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SimpleService implements Serializable {
	private static final long serialVersionUID = -8361015282916126745L;

	private String name;
	private String groupName;
}
