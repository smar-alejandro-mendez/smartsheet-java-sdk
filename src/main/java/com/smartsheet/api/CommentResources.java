package com.smartsheet.api;

import com.smartsheet.api.models.Comment;

/**
 * This interface provides methods to access Comment resources.
 * 
 * Currently the following resources are supported, please refer to
 * http://publish.smartsheet.com/6f44714480de47c1a8cb72375864a7de for full listing of the resources, and
 * http://www.smartsheet.com/developers/api-documentation for full API documentation:
 * 
 * GET /comment/{id} DELETE /comment/{id} POST /comment/{id}/attachments
 * 
 * Thread Safety: Implementation of this interface must be thread safe.
 */
public interface CommentResources {
	/**
	 * Get a comment.
	 * 
	 * It mirrors to the following Smartsheet REST API method: GET /comment/{id}
	 * 
	 * Parameters: - id : the ID
	 * 
	 * Returns: the resource (note that if there is no such resource, this method will throw ResourceNotFoundException
	 * rather than returning null).
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 * 
	 * @param id
	 * @return
	 */
	public Comment getComment(long id);

	/**
	 * Delete a comment.
	 * 
	 * It mirrors to the following Smartsheet REST API method: DELETE /comment{id}
	 * 
	 * Parameters: - id : the ID of the comment
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 * 
	 * @param id
	 */
	public void deleteComment(long id);

	/**
	 * Return the AssociatedAttachmentResources object that provides access to attachment resources associated with
	 * Comment resources.
	 * 
	 * Returns: the AssociatedAttachmentResources object
	 * 
	 * Exceptions: None
	 * 
	 * @return
	 */
	public AssociatedAttachmentResources attachments();
}
