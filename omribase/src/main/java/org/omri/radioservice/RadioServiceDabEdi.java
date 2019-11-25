package org.omri.radioservice;

/**
 * Copyright (C) 2016 Open Mobile Radio Interface (OMRI) Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Abstract class for a DAB {@link RadioService}
 * @author Fabian Sattler, IRT GmbH
 */

import org.omri.radioservice.metadata.SbtItem;

import java.util.List;

/**
 * Interface representing a DAB over IP service
 */
public interface RadioServiceDabEdi extends RadioServiceDab {

	/**
	 * Returns the URL of the EDI stream
	 * @return the URL of the EDI stream
	 */
	public String getUrl();

	/**
	 * Returns if the EDI stream has Server Based Timeshift functionality
	 * @return {@code true} if SBT is available, {@code false} otherwise
	 */
	public boolean sbtEnabled();

	public long getSbtMax();

	public void seekSbt(long seekMs);

	public void setToggleSbt(long toggleId);

	public void pauseSbt(boolean pause);

	public List<SbtItem> getSbtItems();

	public String getSbtToken();

	public void setInitialSbtToken(String token);

	public void setInitialSbtOffset(long offset);

	public void setInitialSbtToggleId(long toggleId);

	public void addSbtCallback(SbtCallback callback);

	public void removeSbtCallback(SbtCallback callback);

	public long getRealtimePosixMs();

	public interface SbtCallback {

		void sbtEnabled();

		void streamDabTime(long posixSeconds);

		void sbtItemAdded(SbtItem item);

		void sbtItemInvalid(SbtItem item);
	}
}
