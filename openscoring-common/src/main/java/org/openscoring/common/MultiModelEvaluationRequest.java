package org.openscoring.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;

import java.util.Map;

@JsonInclude (
	value = JsonInclude.Include.NON_EMPTY
)
public class MultiModelEvaluationRequest extends SimpleRequest {

	private String id = null;

	private Map<String, BatchEvaluationRequest> requests = null;


	public MultiModelEvaluationRequest() {
	}

	public MultiModelEvaluationRequest(String id) {
		setId(id);
	}

	@Override
	public String toString(){
		ToStringHelper stringHelper = MoreObjects.toStringHelper(getClass())
			.add("id", getId())
			.add("requests", getRequests());

		return stringHelper.toString();
	}

	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public Map<String, BatchEvaluationRequest> getRequests(){
		return this.requests;
	}

	public void setRequests(Map<String, BatchEvaluationRequest> requests){
		this.requests = requests;
	}
}