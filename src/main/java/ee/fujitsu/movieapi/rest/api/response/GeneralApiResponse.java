package ee.fujitsu.movieapi.rest.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;

import javax.validation.constraints.NotNull;

public class GeneralApiResponse extends AbstractResponse{
    public GeneralApiResponse(ResponseCode responseCode, String message){
        setMessage(message);
        setResponseCode(responseCode);
    }
    public GeneralApiResponse(){}
}
