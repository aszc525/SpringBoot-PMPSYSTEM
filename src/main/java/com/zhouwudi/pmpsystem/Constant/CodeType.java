package com.zhouwudi.pmpsystem.Constant;

public enum  CodeType {
        /**
         * 状态码
         */
        SUCCESS_STATUS(0, "成功"),

        USER_NOT_LOGIN(101, "用户未登录"),
        PERMISSION_VERIFY_FAIL(102, "权限验证失败"),
        SERVER_EXCEPTION(103, "服务器异常"),

        USERNAME_TOO_LANG(501, "用户名太长"),
        USERNAME_BLANK(502, "用户名为空"),
        HAS_MODIFY_USERNAME(503, "修改个人信息成功，并且修改了用户名"),
        NOT_MODIFY_USERNAME(504, "修改个人信息成功，但没有修改用户名"),
        USERNAME_EXIST(505, "用户名已存在"),
        USERNAME_NOT_EXIST(506, "用户名不存在"),
        USERNAME_FORMAT_ERROR(507, "用户名长度过长或格式不正确"),

        COMMENT_BLANK(801, "内容为空"),
        MESSAGE_HAS_THUMBS_UP(802, "已经点过赞了"),

        PHONE_ERROR(901, "手机号错误"),
        AUTH_CODE_ERROR(902, "验证码错误"),
        PHONE_EXIST(903, "手机号存在"),
        ;

        private int code;
        private String message;

        CodeType(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

    }
