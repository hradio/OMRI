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
*/
public enum RadioServiceMimeType {

	/** MIME type not known **/
	UNKNOWN("mime/unknown", -1),
	/** MIME type for MPEG 1 Layer 1, 2, 3 **/
	AUDIO_MPEG("audio/mpeg", 0),
	/** MIME type for OGG Vorbis audio **/
	AUDIO_OGG_VORBIS("audio/ogg", 1),
	/** MIME type for Free Losless Audio Codec **/
	AUDIO_FLAC("audio/flac", 2),
	/** MIME type ADTS AAC **/
	AUDIO_AAC("audio/aacp", 3),
	/** RAW DAB+ AAC Access Unit **/
	AUDIO_AAC_DAB_AU("audio/aac", 63),
	/** PCM Audio **/
	AUDIO_PCM("audio/wav", 99);

	private final String contentTypeString;
	private final int contentTypeId;

	private RadioServiceMimeType(String contentTypeString, int contentTypeId) {
		this.contentTypeString = contentTypeString;
		this.contentTypeId = contentTypeId;
	}

	public String getMimeTypeString() {
		return this.contentTypeString;
	}

	public int getContententTypeId() {
		return this.contentTypeId;
	}
}
