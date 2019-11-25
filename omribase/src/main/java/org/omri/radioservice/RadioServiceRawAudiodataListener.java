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
 * Interface to receive the encoded, radiosystem specific, raw audio stream
 *
 * @author Fabian Sattler, IRT GmbH
 */
public interface RadioServiceRawAudiodataListener extends RadioServiceListener {

	/**
	 * Encoded raw audio data interface
	 * @param rawData the raw audio data
	 * @param sbr indicates if SBR is used
	 * @param ps indicates if PS (Parametric Stereo) is used
	 * @param type the used audioType
	 * @param numChannels number of channels contained in the raw audio stream
	 * @param samplingRate the sampling rate of the raw audio stream
	 */
	public void rawAudioData(byte[] rawData, boolean sbr, boolean ps, RadioServiceMimeType type, int numChannels, int samplingRate);
}
