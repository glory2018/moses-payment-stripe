package com.moses.config;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Moses
 */
@Data
@ApiModel(value = "BaseResponse", description = "Response result")
public class BaseResponse<T> {
    private static final int CODE_SUCCESS = 200;
    private static final int CODE_FAIL = 400;
    @ApiModelProperty(value = "200,400")
    private int status;
    @ApiModelProperty(value = "true,false")
    private boolean flag;
    @ApiModelProperty(value = "successfully,failed")
    private String message;
    @ApiModelProperty(value = "result data")
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(int status, String message, boolean flag) {
        this.status = status;
        this.message = message;
        this.flag = flag;
    }

    public static <T> BaseResponse<T> success(T data) {
        BaseResponse response = new BaseResponse<T>(CODE_SUCCESS, "successfully", true);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> fail(T data) {
        BaseResponse response = new BaseResponse<T>(CODE_FAIL, "failed", false);
        response.setData(data);
        return response;
    }
}
