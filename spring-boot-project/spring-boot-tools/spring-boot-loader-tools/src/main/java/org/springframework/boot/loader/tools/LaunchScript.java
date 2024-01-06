/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.loader.tools;

/**
 * A script that can be prepended to the front of a JAR file to make it executable.
 *
 * @author Phillip Webb
 * @since 1.3.0
 */
@FunctionalInterface
public interface LaunchScript {

	/**
	 * The content of the launch script as a byte array.
	 * @return the script bytes
	 */
	byte[] toByteArray();

}
