package com.microsoft.bingads.bulk.entities;

public class BulkSharedNegativeKeyword extends BulkNegativeKeyword {

    public long getNegativeKeywordListId() {
        return this.getParentId();
    }

    public void setNegativeKeywordListId(long negativeKeywordListId) {
        this.setParentId(negativeKeywordListId);
    }
}