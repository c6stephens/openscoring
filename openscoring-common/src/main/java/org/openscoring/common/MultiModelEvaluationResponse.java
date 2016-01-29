package org.openscoring.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

import java.util.Map;

@JsonInclude (
	value = JsonInclude.Include.NON_EMPTY
)
public class MultiModelEvaluationResponse extends SimpleResponse {

	private String id = null;

	private Map<String, BatchEvaluationResponse> responses = null;

	public MultiModelEvaluationResponse() {

	}

	public MultiModelEvaluationResponse(String id) {
		setId(id);
	}

	@Override
	public String toString(){
		String message = getMessage();
		if(message != null){
			return super.toString();
		}

		ToStringHelper stringHelper = MoreObjects.toStringHelper(getClass())
			.add("id", getId())
			.add("responses", getResponses());

		return stringHelper.toString();
	}

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public Map<String, BatchEvaluationResponse> getResponses() {
		return this.responses;
	}

	public void setResponses(Map<String, BatchEvaluationResponse> responses){
		this.responses = responses;
	}
}