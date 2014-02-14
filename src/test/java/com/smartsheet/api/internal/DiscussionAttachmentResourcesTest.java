package com.smartsheet.api.internal;

/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
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
 * %[license]
 */

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import com.smartsheet.api.internal.http.DefaultHttpClient;
import com.smartsheet.api.models.Attachment;

public class DiscussionAttachmentResourcesTest extends ResourcesImplBase  {

	private DiscussionAttachmentResources discussionAttachmentResources;

	@Before
	public void setUp() throws Exception {
		discussionAttachmentResources = new DiscussionAttachmentResources(new SmartsheetImpl("http://localhost:9090/1.1/", 
				"accessToken", new DefaultHttpClient(), serializer));
	}

	@Test
	public void testAttachFileLongFileString() {
		try{
			discussionAttachmentResources.attachFile(1234L, new File("src/test/rescoures/getPDF.pdf"), "application/pdf");
			fail("Exception should have been thrown.");
		}catch(UnsupportedOperationException ex){
			// Expected
		}
	}
	
	@Test
	public void testAttachFileLongFileStringLong(){
		try{
			discussionAttachmentResources.attachFile(1234L, new File("src/test/resources/getPDF.pdf"), "application/pdf", 1234L);
			fail("Exception should have been thrown.");
		}catch(UnsupportedOperationException ex){
			// Expected
		}
	}

	@Test
	public void testAttachURL() {
		try{
			discussionAttachmentResources.attachURL(1234L, new Attachment());
			fail("Exception should have been thrown.");
		}catch(UnsupportedOperationException ex){
			// Expected
		}
	}

	@Test
	public void testDiscussionAttachmentResources() {}

}