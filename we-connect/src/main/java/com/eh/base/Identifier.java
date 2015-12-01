package com.eh.base;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by David Li on 2015/12/1.
 */
public class Identifier<ID extends Serializable> extends BaseModel implements Serializable {
    private static final long serialVersionUID = -1622529881776633820L;

    public static final String ID = "id";

    protected ID id;
    protected Date createdOn;
    protected Date updatedOn;

    public Identifier() {
    }

    public Identifier(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
