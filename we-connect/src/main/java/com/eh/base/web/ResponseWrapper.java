package com.eh.base.web;

/**
 * Created by David Li on 2015/12/1.
 */
public class ResponseWrapper {
    private int code;
    private String desc;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseWrapper() {
        this.code = Status.OK.getCode();
        this.desc = Status.OK.getDesc();
    }

    public ResponseWrapper(Status status) {
        this.code = status.getCode();
        this.desc = status.getDesc();
    }

    public ResponseWrapper(Object data) {
        this.code = Status.OK.getCode();
        this.desc = Status.OK.getDesc();
        this.data = data;
    }

    public ResponseWrapper(Status status, Object data) {
        this.code = status.getCode();
        this.desc = status.getDesc();
        this.data = data;
    }

    public enum Status {
        OK(200, "OK"),
        BAD_REQUEST(400, "Bad Request"),
        PRECONDITION_FAILD(401, "Precondition Faild"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented");

        private int code;
        private String desc;

        Status(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }
}
