package com.silong.usermatch.common;

/**
 * 返回工具类
 */
public class ResultUtils {

    /**
     * 成功的返回
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    /**
     * 失败的返回
     *
     * @param errorcode
     * @return
     */
    public static BaseResponse error(ErrorCode errorcode) {
        return new BaseResponse<>(errorcode);
    }

    public static BaseResponse error(int code, String message, String description) {
        return new BaseResponse<>(code, message, description);
    }
}
