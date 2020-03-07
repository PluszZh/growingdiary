package org.lf.diary.repository;

import org.lf.diary.model.RelationShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: PengZH
 * @Date: 2020/3/7 19:14
 * @Description:
 */
public interface RelationShipRepository extends JpaRepository<RelationShip,Long>, JpaSpecificationExecutor<RelationShip> {

    //根据HostID查找所有contactors
    List<RelationShip>  findByHostId(Long hostId);

    /**
     * save:方法 contact和host两个不能与数据库中的重复
     */




}
