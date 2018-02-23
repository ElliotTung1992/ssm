package com.github.dge1992.ssm.controller;

import com.github.dge1992.ssm.utils.ajax.AjaxResult;

public class BaseController {

    /** ============================     ajax    =================================================  */

    /**
     * 返回ajaxresult
     * @param data
     * @return AjaxResult
     */
    public AjaxResult json(Object data) {
        return new AjaxResult().success(data);
    }

    /**
     * 返回ajaxresult
     * @param data
     * @param message
     * @return AjaxResult
     */
    public AjaxResult json(Object data, String message) {
        return json(data).setMessage(message);
    }

    /**
     * 返回ajaxresult
     * @param data
     * @param message
     * @param code
     * @return AjaxResult
     */
    public AjaxResult json(Object data, String message, int code) {
        return json(data, message).setCode(code);
    }

    /**
     * 返回ajaxresult
     * @param message
     * @return AjaxResult
     */
    public AjaxResult success(String message) {
        return new AjaxResult().addSuccess(message);
    }

    /**
     * 返回ajaxresult
     * @param message
     * @return AjaxResult
     */
    public AjaxResult error(String message) {
        return new AjaxResult().addError(message);
    }

    /**
     * 返回ajaxresult
     * @param message
     * @return AjaxResult
     */
    public AjaxResult warn(String message) {
        return new AjaxResult().addWarn(message);
    }

    /**
     * 返回ajaxresult
     * @param message
     * @return AjaxResult
     */
    public AjaxResult fail(String message) {
        return new AjaxResult().addFail(message);
    }
}
