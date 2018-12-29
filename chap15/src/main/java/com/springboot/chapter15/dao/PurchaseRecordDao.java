package com.springboot.chapter15.dao;

import com.springboot.chapter15.pojo.PurchaseRecordPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Citrix on 2018-12-26.
 */
@Mapper
public interface PurchaseRecordDao {
    public int insertPurchaseRecord(PurchaseRecordPo pr);
}